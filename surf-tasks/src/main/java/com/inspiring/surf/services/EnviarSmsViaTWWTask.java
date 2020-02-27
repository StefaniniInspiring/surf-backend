package com.inspiring.surf.services;

import com.inspiring.iep.commons.exceptions.IepException;
import com.inspiring.iep.task.annotation.Task;
import com.inspiring.iep.task.execution.ExecutionContext;
import com.inspiring.surf.services.impl.TWWEnviaSmsConcatenadoSemAcentoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.isBlank;

@Component
public class EnviarSmsViaTWWTask {

    private static final Logger log = LoggerFactory.getLogger(EnviarSmsViaTWWTask.class);
    private @Autowired TWWEnviaSmsConcatenadoSemAcentoImpl enviaSmsConcatenado;


    @Task(inputChannel="Surf.enviarSmsConcatenado")
    public ExecutionContext sendSMS(ExecutionContext context) throws IepException {


        String msisdn = (String) context.getParam("msisdn");
        String mensagem = (String) context.getParam("mensagem");
        String idCorrelacao = (String) context.getParam("idCorrelacao");
        String campaignConfigId = (String) context.getParam("campaign.configId");
        String campaignTargetId = (String) context.getParam("campaign.targetId");

        if (isBlank(msisdn)) {
            log.error("Task Enviar SMS Concatenado - Parametro obrigatorio nao informado: msisdn");
            throw new IepException("Parametro obrigatorio nao informado: msisdn");
        }

        if (isBlank(mensagem)) {
            log.error("Task Enviar SMS Concatenado - Parametro obrigatorio nao informado: mensagem");
            throw new IepException("Parametro obrigatorio nao informado: mensagem");
        }

        if (isNull(campaignConfigId)) {
            campaignConfigId = EMPTY;
        }
        if (isNull(campaignTargetId)) {
            campaignTargetId = EMPTY;
        }

        idCorrelacao = enviaSmsConcatenado.enviaSmsConcatenado(msisdn, mensagem, idCorrelacao, campaignConfigId, campaignTargetId);

        context.setParam("result", idCorrelacao);

        return context;
    }
}
