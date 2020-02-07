package com.inspiring.surf.sms;

import com.inspiring.iep.commons.exceptions.IepException;
import com.inspiring.iep.commons.listeners.PropertyListener;
import com.inspiring.iep.commons.util.DateUtils;
import com.inspiring.iep.commons.util.DynamicProperties;
import com.inspiring.iep.message.beans.SmsGateway;
import com.inspiring.iep.message.beans.SmsMessage;
import com.inspiring.iep.message.messenger.SmsMessenger;
import com.inspiring.iep.task.exception.SendToBackOfficeException;
import com.inspiring.surf.sms.beans.SMSAuthResponse;
import com.inspiring.surf.sms.beans.SMSResponse;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static com.inspiring.iep.commons.kpi.Register.startAndStopKpi;
import static com.inspiring.iep.commons.kpi.Register.startKpi;
import static com.inspiring.iep.commons.kpi.Register.stopKpi;
import static com.inspiring.iep.commons.util.DateUtils.toISO8601;
import static com.inspiring.iep.commons.util.JsonUtil.serialize;
import static com.inspiring.surf.ErrorMap.ERROR_0002;
import static com.inspiring.surf.ErrorMap.ERROR_0003;
import static com.inspiring.surf.ErrorMap.ERROR_0004;
import static com.inspiring.surf.ErrorMap.ERROR_0005;
import static com.inspiring.surf.ErrorMap.ERROR_0006;
import static java.lang.System.currentTimeMillis;
import static java.util.Arrays.asList;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.concurrent.CompletableFuture.runAsync;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Component("surfSmsSender")
public class SmsServiceTask implements SmsMessenger, PropertyListener {

    private static final Logger log = LoggerFactory.getLogger(SmsServiceTask.class);
    private static final Logger smsAudit = LoggerFactory.getLogger("audit.surf.sms");
    private static final Logger report = LoggerFactory.getLogger("report.sms.sent");

    private static final String SMS_MAX_CONNECTIONS = "surf.sms.connections.max";
    private static final String SMS_CONNECTION_TIMEOUT = "surf.sms.connection.timeout";
    private static final String SMS_SOCKET_TIMEOUT = "surf.sms.socket.timeout";
    private static final String SMS_HOST = "surf.sms.host";
    private static final String SMS_AUTH_ENDPOINT = "surf.sms.auth.endpoint";
    private static final String SMS_ENDPOINT = "surf.sms.endpoint";
    private static final String SMS_SENHA = "surf.sms.senha";
    private static final String SMS_EMAIL = "surf.sms.email";

    private static final Integer DEFAULT_MAX_ATTEMPTS = 12;
    private static final Integer DEFAULT_ATTEMPTS_DELAY = 5000;
    private static final String ATTEMPTS_PROPERTY_KEY = "MAX_ATTEMPTS";
    private static final String ATTEMPTS_DELAY_PROPERTY_KEY = "ATTEMPTS_DELAY_IN_MILISECONDS";

    private static final String PARTICIPANT = "participant";
    private static final String CAMPAIGN = "campaign";
    private static final String AUDIT_DATE = "dt";
    private static final String SMS = "sms";
    private static final String FACTS = "fact";
    private static final String DIMENSIONS = "dim";


    private RestTemplate smsServer;
    private PoolingHttpClientConnectionManager currentHttpPool;
    private @Autowired
    DynamicProperties dynamicProperties;
    private ExecutorService executor = Executors.newSingleThreadExecutor();
    private long timeLimit = 0;
    private String indexDate;
    private String token;


    @PostConstruct
    public void ini() {
        dynamicProperties.registerListener(SMS_MAX_CONNECTIONS, this);
        dynamicProperties.registerListener(SMS_CONNECTION_TIMEOUT, this);
        dynamicProperties.registerListener(SMS_SOCKET_TIMEOUT, this);
        updateHttpClientConfig();
        executor.submit(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                if (currentHttpPool != null) {
                    if (currentHttpPool.getTotalStats().getPending() > 10) {
                        log.warn("SMS Connection Manager has {} requests pending. Increase for better performance",
                                currentHttpPool.getTotalStats().getPending());
                    }
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    //Ignore
                }
            }
        });
    }

    @Override
    public void send(SmsMessage message) throws IepException {

        log.info("Received message: {}", message);
        Integer delay, retries;

        SmsGateway gateway = message.getGateway();

        if (gateway.getProperties().get(ATTEMPTS_PROPERTY_KEY) != null) {
            retries = Integer.valueOf(gateway.getProperties().getProperty(ATTEMPTS_PROPERTY_KEY));
        } else {
            retries = DEFAULT_MAX_ATTEMPTS;
        }

        if (gateway.getProperties().getProperty(ATTEMPTS_DELAY_PROPERTY_KEY) != null) {
            delay = Integer.valueOf(gateway.getProperties().getProperty(ATTEMPTS_DELAY_PROPERTY_KEY));
        } else {
            delay = DEFAULT_ATTEMPTS_DELAY;
        }

        //Lista de destinatários
        for (String recipient : message.getRecipients()) {

            HttpStatus response = doSend(recipient, message);
            if (response == null) {
                response = doRetry(retries, recipient, message, delay);
            }
            if (HttpStatus.OK.equals(response)) {
                startAndStopKpi("surf.sms.success");
            } else {
                startAndStopKpi("surf.sms.error");
                throw new IepException(ERROR_0006.getMessage(), ERROR_0006.getCode());
            }
        }
    }

    private HttpStatus doSend(String dest, SmsMessage message) throws IepException {
        log.info("Sending message {} from {} to {}", message.getText(), message.getOriginator(), dest);

        SmsGateway gateway = message.getGateway();
        validate(dest, message.getText(), gateway);

        String campaignConfigId = null;
        String campaignTargetId = null;
        if (nonNull(message.getVariables())) {
            campaignConfigId = (String) message.getVariables().get("campaign.configId");
            campaignTargetId = (String) message.getVariables().get("campaign.targetId");
        }
        if (isNull(campaignConfigId)) {
            campaignConfigId = EMPTY;
        }
        if (isNull(campaignTargetId)) {
            campaignTargetId = EMPTY;
        }

        String url = getUrl();
        String from = message.getOriginator();

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("numero", "55".concat(dest));
        params.add("mensagem", message.getText());

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Accept", MediaType.WILDCARD);
        headers.add("Content-type", MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("token", getToken());

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params, headers);

        try {
            startKpi("surf.sms.send");

            ResponseEntity<SMSResponse> response = smsServer.postForEntity(url, request, SMSResponse.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SMSResponse smsResponse = response.getBody();
                if (nonNull(smsResponse.getSucesso()) && smsResponse.getSucesso().equals("0")) {
                    smsAudit.info("campaignConfigId:{};campaignTargetId:{};to:{};from:{};messageId:{};text:{};transactionId:{}",
                            campaignConfigId,
                            campaignTargetId,
                            dest,
                            from,
                            message.getConfigId(),
                            message.getText(),
                            smsResponse.getTransacao());
                    printReport(dest, from, campaignConfigId, campaignTargetId, message.getConfigId());
                    return HttpStatus.OK;
                } else if (nonNull(smsResponse.getErro())) {
                    if (smsResponse.getErro().equals(5)) {
                        //Autenticacao invalida, forçar obter novo token e retentar enviar
                        token = null;
                        return null;
                    } else if (smsResponse.getErro().equals(12)) {
                        log.error("SMS Send Error - Cliente nao existe: {}", dest);
                        return HttpStatus.BAD_REQUEST;
                    } else {
                        log.error("SMS message couldn't be sent during to error. ErrorMessage: {}",
                                smsResponse.getDescricao());
                        return HttpStatus.BAD_REQUEST;
                    }
                } else {
                    log.error("SMS message couldn't be sent during to error. ErrorCode: {}, ErrorMessage: {}",
                            smsResponse.getErro(), smsResponse.getDescricao());
                    return HttpStatus.BAD_REQUEST;
                }
            } else {
                return response.getStatusCode();
            }
        } catch (HttpStatusCodeException e) {

            log.error("Error sending SMS, HttpError: {}-{}, Cause by: {}", e.getStatusCode().value(), e.getStatusCode().getReasonPhrase(),
                    e.getMostSpecificCause().getMessage());

            return e.getStatusCode();
        } catch (RestClientException e) {
            if (e.getRootCause() instanceof SocketTimeoutException) {
                return null;
            } else if (e.getRootCause() instanceof ConnectTimeoutException) {
                return null;
            } else if (e.getRootCause() instanceof ConnectException) {
                return null;
            }
            if (log.isDebugEnabled()) {
                log.error("Can not send SMS, server error.", e);
            } else {
                log.error("Can not send SMS, server error: {}", e.getMessage());
            }
            return HttpStatus.BAD_REQUEST;
        } finally {
            stopKpi();
        }
    }

    private synchronized String getToken() throws IepException {

        if (isNotBlank(token)) {
            return token;
        }

        String url = getAuthUrl();

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("email", getEmail());
        params.add("senha", getSenha());

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params, headers);

        try {
            startKpi("surf.sms.token");

            ResponseEntity<SMSAuthResponse> response = smsServer.postForEntity(url, request, SMSAuthResponse.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                SMSAuthResponse tokenResponse = response.getBody();
                if (tokenResponse.getSucesso() != 0) {
                    throw new IepException(tokenResponse.getDescricao());
                }
                token = tokenResponse.getToken();

                log.debug("New SMS Auth Token: {}", token);

                return token;
            }

            throw new IepException(response.toString());
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.error("Error in SMS Auth Token, server error.", e);
            } else {
                log.error("Error in SMS Auth Token, server error: {}", e.getMessage());
            }
            throw new IepException(e.getMessage());
        } finally {
            stopKpi();
        }
    }

    private String getAuthUrl() {
        String host = dynamicProperties.getString(SMS_HOST, "http://backend-platform.develop.surfgroup.nuageit.com.br");
        String endpoint = dynamicProperties.getString(SMS_AUTH_ENDPOINT, "/api-spec/v1/auth");
        return host + endpoint;
    }

    private String getUrl() {
        String host = dynamicProperties.getString(SMS_HOST, "http://backend-platform.develop.surfgroup.nuageit.com.br");
        String endpoint = dynamicProperties.getString(SMS_ENDPOINT, "/api-plintron-consulta/v1/sms/surf");
        return host + endpoint;
    }

    private void printReport(String dest, String from, String campaignConfigId, String campaignTargetId, String messageId) {
        try {
            Map<String, Object> reportData = new HashMap<>();
            reportData.put(AUDIT_DATE, toISO8601(DateUtils.now()));

            Map<String, Object> dimensions = new HashMap<>();
            reportData.put(DIMENSIONS, dimensions);

            dimensions.put(PARTICIPANT.concat(".msisdn"), dest);
            if (isNotBlank(campaignConfigId)) {
                dimensions.put(CAMPAIGN.concat(".config_id"), campaignConfigId);
            }
            if (isNotBlank(campaignTargetId)) {
                dimensions.put(CAMPAIGN.concat(".target"), campaignTargetId);
            }
            dimensions.put(SMS.concat(".config_id"), messageId);
            dimensions.put(SMS.concat(".from"), from);

            Map<String, Object> facts = new HashMap<>();
            reportData.put(FACTS, facts);

            facts.put(SMS.concat(".out"), 1);

            report.info("sms-{};dft;{}", getIndexDate(), serialize(reportData));
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.warn("Error generating sms report data", e);
            } else {
                log.warn("Error generating sms report data, cause: {}", e.getMessage());
            }
        }
    }

    private void waitToRetry(Integer delay) throws IepException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new IepException(ERROR_0006.getMessage(), ERROR_0006.getCode());
        }
    }

    private HttpStatus doRetry(Integer retries, String recipient, SmsMessage message, Integer delay) throws IepException {
        for (int retry = 1; retry <= retries; retry++) {
            log.info("Retrying for message {} in {} for {} time", message, delay, retry);
            waitToRetry(delay);
            HttpStatus response = doSend(recipient, message);

            if (response != null) {
                return response;
            }
        }
        startAndStopKpi("surf.sms.backoffice");
        throw new SendToBackOfficeException(ERROR_0005.getCode(), ERROR_0005.getMessage());
    }

    private void validate(String dest, String message, SmsGateway gateway) throws IepException {
        if (StringUtils.isBlank(message)) {
            throw new IepException(ERROR_0002.getMessage(), ERROR_0002.getCode());
        }

        if (StringUtils.isBlank(dest)) {
            throw new IepException(ERROR_0003.getMessage(), ERROR_0003.getCode());
        }

        if (StringUtils.isBlank(gateway.getHost())) {
            throw new IepException(ERROR_0004.getMessage(), ERROR_0004.getCode());
        }

        if (gateway.getPort() == null || gateway.getPort() == 0) {
            throw new IepException(ERROR_0004.getMessage(), ERROR_0004.getCode());
        }
    }


    @Override
    public void notify(String name, String value) {

        if (SMS_CONNECTION_TIMEOUT.equals(name)
                || SMS_SOCKET_TIMEOUT.equals(name)
                || SMS_MAX_CONNECTIONS.equals(name)) {

            updateHttpClientConfig();
        }
    }

    private void updateHttpClientConfig() {
        PoolingHttpClientConnectionManager tempHttpPool = currentHttpPool;
        RestTemplate smsServerNew = new RestTemplate(new HttpComponentsClientHttpRequestFactory(createHttpClient()));
        smsServerNew.setMessageConverters(asList(new FormHttpMessageConverter(), new StringHttpMessageConverter(), new Jaxb2RootElementHttpMessageConverter(), new MappingJackson2HttpMessageConverter()));
        smsServer = smsServerNew;
        //Force close connections
        if (tempHttpPool != null) {
            runAsync(() -> {
                while (!Thread.currentThread().isInterrupted() &&
                        tempHttpPool.getTotalStats().getAvailable() + tempHttpPool.getTotalStats().getLeased() + tempHttpPool.getTotalStats().getPending() > 0) {
                    tempHttpPool.closeIdleConnections(1, TimeUnit.MILLISECONDS);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //Ignore
                    }
                }
                tempHttpPool.shutdown();
            });
        }
        log.info("SMS Client created successfully");
    }

    private CloseableHttpClient createHttpClient() {

        SocketConfig socketConfig = SocketConfig.custom()
                .setSoTimeout(getSocketTimeout()).build();

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(getConnectionTimeout())
                .setSocketTimeout(getSocketTimeout())
                .setCookieSpec("default").build();

        return HttpClients.custom()
                .setConnectionManager(createConnectionManager())
                .setDefaultSocketConfig(socketConfig)
                .setDefaultRequestConfig(requestConfig)
                .evictIdleConnections(5, TimeUnit.MINUTES)
                .build();
    }

    private HttpClientConnectionManager createConnectionManager() {
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.setMaxTotal(getMaxConnections());
        cm.setDefaultMaxPerRoute(getMaxConnections());
        cm.setValidateAfterInactivity(30000);
        currentHttpPool = cm;
        return cm;
    }

    private String getIndexDate() {
        if (timeLimit <= currentTimeMillis()) {
            timeLimit = DateUtils.addDays(DateUtils.today(), 1).getTime();
            indexDate = DateUtils.format("yyyy-MM-dd");
        }
        return indexDate;
    }

    private int getSocketTimeout() {
        return dynamicProperties.getInteger(SMS_SOCKET_TIMEOUT, 30000);
    }

    private int getConnectionTimeout() {
        return dynamicProperties.getInteger(SMS_CONNECTION_TIMEOUT, 30000);
    }

    private int getMaxConnections() {
        return dynamicProperties.getInteger(SMS_MAX_CONNECTIONS, 10);
    }

    private String getSenha() {
        return dynamicProperties.getString(SMS_SENHA);
    }

    private String getEmail() {
        return dynamicProperties.getString(SMS_EMAIL);
    }
}
