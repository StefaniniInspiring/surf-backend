package com.inspiring.surf.services.impl;

import com.inspiring.iep.commons.exceptions.IepException;
import com.inspiring.iep.commons.listeners.PropertyListener;
import com.inspiring.iep.commons.util.DateUtils;
import com.inspiring.iep.commons.util.DynamicProperties;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static com.inspiring.iep.commons.kpi.Register.*;
import static com.inspiring.iep.commons.util.DateUtils.toISO8601;
import static com.inspiring.iep.commons.util.JsonUtil.serialize;
import static java.lang.System.currentTimeMillis;
import static java.util.Arrays.asList;
import static java.util.concurrent.CompletableFuture.runAsync;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Component("surfEnviaSmsContatenadoSemAcento")
public class TWWEnviaSmsConcatenadoSemAcentoImpl implements PropertyListener {

    private static final String RANDOM_CHARS = "1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final Logger log = LoggerFactory.getLogger(TWWEnviaSmsConcatenadoSemAcentoImpl.class);
    private static final Logger audit = LoggerFactory.getLogger("audit.surf.tww_sms");
    private static final Logger error = LoggerFactory.getLogger("error.surf.tww_sms");
    private static final Logger report = LoggerFactory.getLogger("report.sms.sent");

    private static final String MAX_CONNECTIONS = "surf.tww.sms.connections.max";
    private static final String CONNECTION_TIMEOUT = "surf.tww.sms.connection.timeout";
    private static final String SOCKET_TIMEOUT = "surf.tww.sms.socket.timeout";
    private static final String PASS = "surf.tww.sms.pass";
    private static final String USER = "surf.tww.sms.user";
    private static final String URL = "surf.tww.sms.url";
    private static final String LOG_PREFIX = "TWW SMS - Envia SMS Concatenado";

    private static final String PARTICIPANT = "participant";
    private static final String CAMPAIGN = "campaign";
    private static final String AUDIT_DATE = "dt";
    private static final String SMS = "sms";
    private static final String FACTS = "fact";
    private static final String DIMENSIONS = "dim";

    private RestTemplate server;
    private PoolingHttpClientConnectionManager currentHttpPool;
    private @Autowired DynamicProperties dynamicProperties;
    private ExecutorService executor = Executors.newSingleThreadExecutor();
    private AtomicInteger serie = new AtomicInteger(0);
    private long timeLimit = 0;
    private String indexDate;

    @PostConstruct
    public void ini() {
        dynamicProperties.registerListener(MAX_CONNECTIONS, this);
        dynamicProperties.registerListener(CONNECTION_TIMEOUT, this);
        dynamicProperties.registerListener(SOCKET_TIMEOUT, this);
        updateHttpClientConfig();
        executor.submit(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                if (currentHttpPool != null) {
                    if (currentHttpPool.getTotalStats().getPending() > 10) {
                        log.warn("{} - Connection Manager has {} requests pending. Increase for better performance", LOG_PREFIX,
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

    public String enviaSmsConcatenado(String msisdn, String mensagem, String idCorrelacao, String campaignConfigId, String campaignTargetId) throws IepException {

        if (isBlank(idCorrelacao)) {
            idCorrelacao = gerarIdCorrelacao();
        }

        String body = REQUEST.replace("${MSISDN}", "55".concat(msisdn));
        body = body.replace("${MENSAGEM}", mensagem);
        body = body.replace("${ID_CORRELACAO}", idCorrelacao);
        body = body.replace("${USUARIO}", getUser());
        body = body.replace("${SENHA}", getPass());
        body = body.replace("${SERIE}", getSerie());


        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/soap+xml; charset=utf-8");
        headers.add("Accept", MediaType.WILDCARD);

        HttpEntity<String> request = new HttpEntity<>(body, headers);

        try {
            startKpi("surf.tww_sms.send");

            ResponseEntity<String> response = server.exchange(getUrl(), HttpMethod.POST, request, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                String responseBody = response.getBody();

                if (responseBody != null) {
                    if (responseBody.contains("EnviaSMSConcatenadoSemAcentoResult")) {
                        int start = responseBody.indexOf("EnviaSMSConcatenadoSemAcentoResult");
                        int end = responseBody.indexOf("EnviaSMSConcatenadoSemAcentoResult", start+1);
                        String resposta = responseBody.substring(start + 35, end - 2);

                        if (isNotBlank(resposta)){
                            if (resposta.startsWith("OK")) {
                                audit.info("msisdn:{};IdCorrelacao:{};mensagem:{}",msisdn, idCorrelacao, mensagem);
                                startAndStopKpi("surf.tww_sms.success");
                                printReport(msisdn, idCorrelacao, campaignConfigId, campaignTargetId);
                                return idCorrelacao;
                            } else if (resposta.startsWith("NOK")) {
                                log.error("{} - Usuario ou Senha Invalido: {}", LOG_PREFIX, resposta);
                            } else {
                                log.error("{} - Erro generico: {}", LOG_PREFIX, resposta);
                            }
                        }
                    } else {
                        if (log.isDebugEnabled()) {
                            log.error("{} - Technical Fault: {}", LOG_PREFIX, responseBody);
                        } else {
                            log.error("{} - Technical Fault", LOG_PREFIX);
                        }
                    }
                } else {
                    log.error("{} - Sem resposta", LOG_PREFIX);
                }
            } else {
                log.error("{} - Http Error: {}-{}", LOG_PREFIX, response.getStatusCodeValue(), response.getStatusCode().getReasonPhrase());
            }
        } catch (HttpStatusCodeException e) {
            log.error("{} - HttpError: {}-{}, Cause by: {}", LOG_PREFIX, e.getStatusCode().value(), e.getStatusCode().getReasonPhrase(),
                    e.getMostSpecificCause().getMessage());
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.error(LOG_PREFIX + " - server error.", e);
            } else {
                log.error("{} - server error: {}", LOG_PREFIX, e.getMessage());
            }
        } finally {
            stopKpi();
        }

        error.info("msisdn:{};IdCorrelacao:{};mensagem:{}",msisdn, idCorrelacao, mensagem);
        startAndStopKpi("surf.tww_sms.error");
        throw new IepException("Erro ao enviar SMS Concatenado");
    }

    private String gerarIdCorrelacao() {
        return RandomStringUtils.random(10, RANDOM_CHARS);
    }

    private synchronized String getSerie() {
        int valorAtual = serie.incrementAndGet();
        if (valorAtual > 255) {
            serie.set(1);
            return "0";
        }
        return String.valueOf(valorAtual);
    }

    private void printReport(String dest, String idCorrelacao, String campaignConfigId, String campaignTargetId) {
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

    private String getIndexDate() {
        if (timeLimit <= currentTimeMillis()) {
            timeLimit = DateUtils.addDays(DateUtils.today(), 1).getTime();
            indexDate = DateUtils.format("yyyy-MM-dd");
        }
        return indexDate;
    }

    private void updateHttpClientConfig() {
        PoolingHttpClientConnectionManager tempHttpPool = currentHttpPool;
        RestTemplate serverNew = new RestTemplate(new HttpComponentsClientHttpRequestFactory(createHttpClient()));
        serverNew.setMessageConverters(asList(new StringHttpMessageConverter()));
        server = serverNew;
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
        log.info("{} - Client created successfully", LOG_PREFIX);
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

    private int getSocketTimeout() {
        return dynamicProperties.getInteger(SOCKET_TIMEOUT, 30000);
    }

    private int getConnectionTimeout() {
        return dynamicProperties.getInteger(CONNECTION_TIMEOUT, 30000);
    }

    private int getMaxConnections() {
        return dynamicProperties.getInteger(MAX_CONNECTIONS, 20);
    }

    private String getPass() {
        return dynamicProperties.getString(PASS);
    }

    private String getUser() {
        return dynamicProperties.getString(USER);
    }

    private String getUrl() {
        return dynamicProperties.getString(URL);
    }

    @Override
    public void notify(String name, String value) {

        if (CONNECTION_TIMEOUT.equals(name)
                || SOCKET_TIMEOUT.equals(name)
                || MAX_CONNECTIONS.equals(name)) {

            updateHttpClientConfig();
        }
    }


    private static final String REQUEST = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\"><soap12:Body><EnviaSMSConcatenadoSemAcento xmlns=\"https://www.twwwireless.com.br/reluzcap/wsreluzcap\"><NumUsu>${USUARIO}</NumUsu><Senha>${SENHA}</Senha><SeuNum>${ID_CORRELACAO}</SeuNum><Serie>${SERIE}</Serie><Celular>${MSISDN}</Celular><Mensagem>${MENSAGEM}</Mensagem></EnviaSMSConcatenadoSemAcento></soap12:Body></soap12:Envelope>";
}
