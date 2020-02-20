/**
 * ReluzCap_x0020_Web_x0020_ServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.inspiring.surf.tww.ws;


/*
 *  ReluzCap_x0020_Web_x0020_ServiceStub java implementation
 */
public class ReluzCap_x0020_Web_x0020_ServiceStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    //https://webservices2.twwwireless.com.br/reluzcap/wsreluzcap.asmx
    private final org.apache.xmlbeans.XmlOptions _xmlOptions;

    {
        _xmlOptions = new org.apache.xmlbeans.XmlOptions();
        _xmlOptions.setSaveNoXmlDecl();
        _xmlOptions.setSaveAggressiveNamespaces();
        _xmlOptions.setSaveNamespacesFirst();
    }

    /**
     *Constructor that takes in a configContext
     */
    public ReluzCap_x0020_Web_x0020_ServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ReluzCap_x0020_Web_x0020_ServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public ReluzCap_x0020_Web_x0020_ServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://webservices2.twwwireless.com.br/reluzcap/wsreluzcap.asmx");
    }

    /**
     * Default Constructor
     */
    public ReluzCap_x0020_Web_x0020_ServiceStub()
        throws org.apache.axis2.AxisFault {
        this("https://webservices2.twwwireless.com.br/reluzcap/wsreluzcap.asmx");
    }

    /**
     * Constructor taking the target endpoint
     */
    public ReluzCap_x0020_Web_x0020_ServiceStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "ReluzCap_x0020_Web_x0020_Service" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[35];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSConcatenadoSemAcento"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "buscaSMSAgenda"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "buscaSMSMONaoLidoQuant"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "resetaStatusLido"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "alteraSenha"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSTIM"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap", "enviaSMS"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "resetaMOLido"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSXML"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap", "buscaSMS"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "statusSMSDataSet"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMS2SN"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "statusSMSNaoLido"));
        _service.addOperation(__operation);

        _operations[12] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "buscaSMSMONaoLido"));
        _service.addOperation(__operation);

        _operations[13] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSConcatenadoComAcento2N"));
        _service.addOperation(__operation);

        _operations[14] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "buscaSMSAgendaDataSet"));
        _service.addOperation(__operation);

        _operations[15] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSConcatenadoSemAcento2N"));
        _service.addOperation(__operation);

        _operations[16] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSAlt"));
        _service.addOperation(__operation);

        _operations[17] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSAge"));
        _service.addOperation(__operation);

        _operations[18] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSConcatenadoComAcento"));
        _service.addOperation(__operation);

        _operations[19] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSESMDCS"));
        _service.addOperation(__operation);

        _operations[20] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSAgeQuebra"));
        _service.addOperation(__operation);

        _operations[21] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSQuebra"));
        _service.addOperation(__operation);

        _operations[22] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSDataSet"));
        _service.addOperation(__operation);

        _operations[23] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "buscaSMSMO"));
        _service.addOperation(__operation);

        _operations[24] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "delSMSAgenda"));
        _service.addOperation(__operation);

        _operations[25] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap", "insBL"));
        _service.addOperation(__operation);

        _operations[26] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "verValidade"));
        _service.addOperation(__operation);

        _operations[27] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "delSMSAgendaIdLote"));
        _service.addOperation(__operation);

        _operations[28] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap", "verBL"));
        _service.addOperation(__operation);

        _operations[29] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "verCredito"));
        _service.addOperation(__operation);

        _operations[30] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "statusSMS"));
        _service.addOperation(__operation);

        _operations[31] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "statusSMS2SN"));
        _service.addOperation(__operation);

        _operations[32] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSTemplate"));
        _service.addOperation(__operation);

        _operations[33] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                "enviaSMSOTA8Bit"));
        _service.addOperation(__operation);

        _operations[34] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem de texto concatenado sem acento para um celular. O campo Serie deve conter um número entre 0 e 255 e deve ser único para cada SMS concatenado enviado, sendo acrescido de 1 a cada envio, e quando atinge 255, comece com 0 (zero) novamente. Se essa mensagem for mais longa que 140 caracteres, ela será dividida em várias mensagens de até 140 caracteres e enviada de forma a chegar concatenada, em uma única mensagem, no celular de destino, desde que a operadora suporte concatenação. Se não houver suporte da operadora, a mensagem será enviada separadamente com + separando as mensagens. Tamanho máximo da mensagem = 4096 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 4096 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSConcatenadoSemAcento
     * @param enviaSMSConcatenadoSemAcento0
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument enviaSMSConcatenadoSemAcento(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument enviaSMSConcatenadoSemAcento0)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoSemAcento");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSConcatenadoSemAcento0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSConcatenadoSemAcento")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSConcatenadoSemAcento"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "EnviaSMSConcatenadoSemAcento"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoSemAcento"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoSemAcento"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem de texto concatenado sem acento para um celular. O campo Serie deve conter um número entre 0 e 255 e deve ser único para cada SMS concatenado enviado, sendo acrescido de 1 a cada envio, e quando atinge 255, comece com 0 (zero) novamente. Se essa mensagem for mais longa que 140 caracteres, ela será dividida em várias mensagens de até 140 caracteres e enviada de forma a chegar concatenada, em uma única mensagem, no celular de destino, desde que a operadora suporte concatenação. Se não houver suporte da operadora, a mensagem será enviada separadamente com + separando as mensagens. Tamanho máximo da mensagem = 4096 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 4096 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSConcatenadoSemAcento
     * @param enviaSMSConcatenadoSemAcento0
     */
    public void startenviaSMSConcatenadoSemAcento(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument enviaSMSConcatenadoSemAcento0,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoSemAcento");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSConcatenadoSemAcento0,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSConcatenadoSemAcento")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSConcatenadoSemAcento"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.class);
                        callback.receiveResultenviaSMSConcatenadoSemAcento((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSConcatenadoSemAcento(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSConcatenadoSemAcento"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoSemAcento"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoSemAcento"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSConcatenadoSemAcento(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSConcatenadoSemAcento(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSConcatenadoSemAcento(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada BuscaSMSAgenda com UM SMS AGENDADO ESPECIFICADO PELO CAMPO SEUNUM. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#buscaSMSAgenda
     * @param buscaSMSAgenda2
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument buscaSMSAgenda(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument buscaSMSAgenda2)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSAgenda");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    buscaSMSAgenda2,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "buscaSMSAgenda")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "BuscaSMSAgenda"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "BuscaSMSAgenda"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSAgenda"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSAgenda"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada BuscaSMSAgenda com UM SMS AGENDADO ESPECIFICADO PELO CAMPO SEUNUM. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startbuscaSMSAgenda
     * @param buscaSMSAgenda2
     */
    public void startbuscaSMSAgenda(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument buscaSMSAgenda2,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSAgenda");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                buscaSMSAgenda2,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "buscaSMSAgenda")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "BuscaSMSAgenda"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.class);
                        callback.receiveResultbuscaSMSAgenda((br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorbuscaSMSAgenda(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "BuscaSMSAgenda"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSAgenda"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSAgenda"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorbuscaSMSAgenda(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgenda(f);
                                }
                            } else {
                                callback.receiveErrorbuscaSMSAgenda(f);
                            }
                        } else {
                            callback.receiveErrorbuscaSMSAgenda(f);
                        }
                    } else {
                        callback.receiveErrorbuscaSMSAgenda(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorbuscaSMSAgenda(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[1].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna uma estrutura MONLIDOQUANT, contendo um DataSet DS, chamado OutDataSet, com uma Tabela chamada SMSMO com o máximo de linhas definido pelo parâmetro de entrada Quant. O valor de Quant deve ser entre 400 e 2000, sendo ajustado caso especificado fora desse intervalo. A tabela contem as mensagens SMS MO não lidas, recebidas nos últimos 4 dias como resposta a SMS enviados anteriormente, e marca esses MOs COMO LIDOS. A estrutura contem, alem do DataSet um inteiro QUANTNL que indica quantos SMS MO NÃO LIDOS ainda existem no banco de dados, depois da presente execução. Estes MOs devem ser lidos usando chamadas subsequentes à função. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#buscaSMSMONaoLidoQuant
     * @param buscaSMSMONaoLidoQuant4
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument buscaSMSMONaoLidoQuant(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument buscaSMSMONaoLidoQuant4)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSMONaoLidoQuant");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    buscaSMSMONaoLidoQuant4,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "buscaSMSMONaoLidoQuant")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "BuscaSMSMONaoLidoQuant"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "BuscaSMSMONaoLidoQuant"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "BuscaSMSMONaoLidoQuant"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "BuscaSMSMONaoLidoQuant"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna uma estrutura MONLIDOQUANT, contendo um DataSet DS, chamado OutDataSet, com uma Tabela chamada SMSMO com o máximo de linhas definido pelo parâmetro de entrada Quant. O valor de Quant deve ser entre 400 e 2000, sendo ajustado caso especificado fora desse intervalo. A tabela contem as mensagens SMS MO não lidas, recebidas nos últimos 4 dias como resposta a SMS enviados anteriormente, e marca esses MOs COMO LIDOS. A estrutura contem, alem do DataSet um inteiro QUANTNL que indica quantos SMS MO NÃO LIDOS ainda existem no banco de dados, depois da presente execução. Estes MOs devem ser lidos usando chamadas subsequentes à função. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startbuscaSMSMONaoLidoQuant
     * @param buscaSMSMONaoLidoQuant4
     */
    public void startbuscaSMSMONaoLidoQuant(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument buscaSMSMONaoLidoQuant4,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSMONaoLidoQuant");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                buscaSMSMONaoLidoQuant4,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "buscaSMSMONaoLidoQuant")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "BuscaSMSMONaoLidoQuant"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument.class);
                        callback.receiveResultbuscaSMSMONaoLidoQuant((br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorbuscaSMSMONaoLidoQuant(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "BuscaSMSMONaoLidoQuant"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSMONaoLidoQuant"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSMONaoLidoQuant"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                                }
                            } else {
                                callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                            }
                        } else {
                            callback.receiveErrorbuscaSMSMONaoLidoQuant(f);
                        }
                    } else {
                        callback.receiveErrorbuscaSMSMONaoLidoQuant(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorbuscaSMSMONaoLidoQuant(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[2].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Reseta o status de LIDO dos Status de SMS desde 1 dia atrás até a data atual. Retorna OK ou NOK em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#resetaStatusLido
     * @param resetaStatusLido6
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument resetaStatusLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument resetaStatusLido6)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/ResetaStatusLido");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    resetaStatusLido6,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "resetaStatusLido")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "ResetaStatusLido"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ResetaStatusLido"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ResetaStatusLido"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ResetaStatusLido"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Reseta o status de LIDO dos Status de SMS desde 1 dia atrás até a data atual. Retorna OK ou NOK em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startresetaStatusLido
     * @param resetaStatusLido6
     */
    public void startresetaStatusLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument resetaStatusLido6,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/ResetaStatusLido");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                resetaStatusLido6,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "resetaStatusLido")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "ResetaStatusLido"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.class);
                        callback.receiveResultresetaStatusLido((br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorresetaStatusLido(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "ResetaStatusLido"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "ResetaStatusLido"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "ResetaStatusLido"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorresetaStatusLido(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaStatusLido(f);
                                }
                            } else {
                                callback.receiveErrorresetaStatusLido(f);
                            }
                        } else {
                            callback.receiveErrorresetaStatusLido(f);
                        }
                    } else {
                        callback.receiveErrorresetaStatusLido(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorresetaStatusLido(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[3].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Essa função foi desativada em 14 de março de 2018. Para mais informações contacte a TWW.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#alteraSenha
     * @param alteraSenha8
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument alteraSenha(
        br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument alteraSenha8)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/AlteraSenha");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    alteraSenha8,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "alteraSenha")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "AlteraSenha"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AlteraSenha"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AlteraSenha"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AlteraSenha"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Essa função foi desativada em 14 de março de 2018. Para mais informações contacte a TWW.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startalteraSenha
     * @param alteraSenha8
     */
    public void startalteraSenha(
        br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument alteraSenha8,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/AlteraSenha");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                alteraSenha8,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "alteraSenha")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "AlteraSenha"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.class);
                        callback.receiveResultalteraSenha((br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErroralteraSenha(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "AlteraSenha"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "AlteraSenha"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "AlteraSenha"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErroralteraSenha(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroralteraSenha(f);
                                }
                            } else {
                                callback.receiveErroralteraSenha(f);
                            }
                        } else {
                            callback.receiveErroralteraSenha(f);
                        }
                    } else {
                        callback.receiveErroralteraSenha(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErroralteraSenha(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[4].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Recebe uma String com um XML no mesmo formato usado para enviar SMS a operadora TIMSUL, para facilitar a integração com sistemas já desenvolvidos.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSTIM
     * @param enviaSMSTIM10
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument enviaSMSTIM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument enviaSMSTIM10)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSTIM");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSTIM10,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSTIM")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSTIM"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSTIM"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSTIM"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSTIM"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Recebe uma String com um XML no mesmo formato usado para enviar SMS a operadora TIMSUL, para facilitar a integração com sistemas já desenvolvidos.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSTIM
     * @param enviaSMSTIM10
     */
    public void startenviaSMSTIM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument enviaSMSTIM10,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSTIM");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSTIM10,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSTIM")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSTIM"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.class);
                        callback.receiveResultenviaSMSTIM((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSTIM(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "EnviaSMSTIM"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSTIM"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSTIM"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSTIM(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTIM(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSTIM(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSTIM(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSTIM(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSTIM(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[5].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular. A quantidade de caracteres suportados por SMS está sujeita a variação por operadora. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMS
     * @param enviaSMS12
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument enviaSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument enviaSMS12)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMS");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMS12,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMS")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMS"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular. A quantidade de caracteres suportados por SMS está sujeita a variação por operadora. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMS
     * @param enviaSMS12
     */
    public void startenviaSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument enviaSMS12,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMS");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMS12,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMS")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMS"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.class);
                        callback.receiveResultenviaSMS((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMS(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "EnviaSMS"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "EnviaSMS"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "EnviaSMS"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMS(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMS(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMS(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMS(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMS(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[6].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Reseta o status de LIDO dos SMS MO desde 1 dia atrás até o momento atual. Retorna OK ou NOK em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#resetaMOLido
     * @param resetaMOLido14
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument resetaMOLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument resetaMOLido14)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/ResetaMOLido");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    resetaMOLido14,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "resetaMOLido")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "ResetaMOLido"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ResetaMOLido"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ResetaMOLido"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ResetaMOLido"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Reseta o status de LIDO dos SMS MO desde 1 dia atrás até o momento atual. Retorna OK ou NOK em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startresetaMOLido
     * @param resetaMOLido14
     */
    public void startresetaMOLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument resetaMOLido14,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/ResetaMOLido");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                resetaMOLido14,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "resetaMOLido")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "ResetaMOLido"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.class);
                        callback.receiveResultresetaMOLido((br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorresetaMOLido(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "ResetaMOLido"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "ResetaMOLido"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "ResetaMOLido"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorresetaMOLido(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorresetaMOLido(f);
                                }
                            } else {
                                callback.receiveErrorresetaMOLido(f);
                            }
                        } else {
                            callback.receiveErrorresetaMOLido(f);
                        }
                    } else {
                        callback.receiveErrorresetaMOLido(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorresetaMOLido(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[7].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Recebe um XML com mensagens SMS a serem enviadas, com os seguintes campos: seunum (Seu número com até 20 caracteres), celular (55DDNNNNNNNN), mensagem, agendamento (dd/mm/aaaa hh:mm:ss). Retorna OK n (n é o número de SMSs recebidos), NOK, Erro ou NA (não disponível)
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSXML
     * @param enviaSMSXML16
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument enviaSMSXML(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument enviaSMSXML16)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSXML");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSXML16,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSXML")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSXML"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSXML"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSXML"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSXML"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Recebe um XML com mensagens SMS a serem enviadas, com os seguintes campos: seunum (Seu número com até 20 caracteres), celular (55DDNNNNNNNN), mensagem, agendamento (dd/mm/aaaa hh:mm:ss). Retorna OK n (n é o número de SMSs recebidos), NOK, Erro ou NA (não disponível)
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSXML
     * @param enviaSMSXML16
     */
    public void startenviaSMSXML(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument enviaSMSXML16,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSXML");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSXML16,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSXML")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSXML"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.class);
                        callback.receiveResultenviaSMSXML((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSXML(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "EnviaSMSXML"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSXML"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSXML"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSXML(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSXML(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSXML(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSXML(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSXML(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSXML(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[8].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada BuscaSMS com as mensagens transmitidas dentro de um período MÁXIMO DE 4 DIAS, e um MÁXIMO DE 4000 SMSs. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#buscaSMS
     * @param buscaSMS18
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument buscaSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument buscaSMS18)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMS");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    buscaSMS18,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "buscaSMS")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "BuscaSMS"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "BuscaSMS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada BuscaSMS com as mensagens transmitidas dentro de um período MÁXIMO DE 4 DIAS, e um MÁXIMO DE 4000 SMSs. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startbuscaSMS
     * @param buscaSMS18
     */
    public void startbuscaSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument buscaSMS18,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMS");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                buscaSMS18,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "buscaSMS")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "BuscaSMS"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.class);
                        callback.receiveResultbuscaSMS((br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorbuscaSMS(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "BuscaSMS"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "BuscaSMS"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "BuscaSMS"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorbuscaSMS(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMS(f);
                                }
                            } else {
                                callback.receiveErrorbuscaSMS(f);
                            }
                        } else {
                            callback.receiveErrorbuscaSMS(f);
                        }
                    } else {
                        callback.receiveErrorbuscaSMS(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorbuscaSMS(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[9].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[9].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Recebe um DataSet com os campos: SeuNum, e retorna um DataSet chamado OutDataSet contendo a tabela StatusSMSDS com várias mensagens já transmitidas. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#statusSMSDataSet
     * @param statusSMSDataSet20
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument statusSMSDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument statusSMSDataSet20)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMSDataSet");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    statusSMSDataSet20,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "statusSMSDataSet")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "StatusSMSDataSet"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "StatusSMSDataSet"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMSDataSet"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMSDataSet"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Recebe um DataSet com os campos: SeuNum, e retorna um DataSet chamado OutDataSet contendo a tabela StatusSMSDS com várias mensagens já transmitidas. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startstatusSMSDataSet
     * @param statusSMSDataSet20
     */
    public void startstatusSMSDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument statusSMSDataSet20,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMSDataSet");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                statusSMSDataSet20,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "statusSMSDataSet")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "StatusSMSDataSet"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.class);
                        callback.receiveResultstatusSMSDataSet((br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorstatusSMSDataSet(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "StatusSMSDataSet"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "StatusSMSDataSet"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "StatusSMSDataSet"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorstatusSMSDataSet(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSDataSet(f);
                                }
                            } else {
                                callback.receiveErrorstatusSMSDataSet(f);
                            }
                        } else {
                            callback.receiveErrorstatusSMSDataSet(f);
                        }
                    } else {
                        callback.receiveErrorstatusSMSDataSet(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorstatusSMSDataSet(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[10].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[10].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular, usando 2 campos de referência ALFANUMÉRICOS (SeuNum1 e SeuNum2) de no máximo 20 caracteres cada. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMS2SN
     * @param enviaSMS2SN22
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument enviaSMS2SN(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument enviaSMS2SN22)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMS2SN");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMS2SN22,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMS2SN")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMS2SN"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMS2SN"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMS2SN"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMS2SN"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular, usando 2 campos de referência ALFANUMÉRICOS (SeuNum1 e SeuNum2) de no máximo 20 caracteres cada. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMS2SN
     * @param enviaSMS2SN22
     */
    public void startenviaSMS2SN(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument enviaSMS2SN22,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMS2SN");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMS2SN22,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMS2SN")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMS2SN"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.class);
                        callback.receiveResultenviaSMS2SN((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMS2SN(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "EnviaSMS2SN"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMS2SN"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMS2SN"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMS2SN(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMS2SN(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMS2SN(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMS2SN(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMS2SN(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMS2SN(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[11].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[11].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo a tabela StatusSMS com no máximo 400 linhas, contendo somente os status de SMS dos últimos 4 dias que ainda não tenham sido lidos, e os MARCA COMO LIDOS. Se houverem 400 linhas na tabela, podem haver mais status não lidos, e estes devem ser lidos usando chamadas subsequentes à função. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#statusSMSNaoLido
     * @param statusSMSNaoLido24
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument statusSMSNaoLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument statusSMSNaoLido24)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMSNaoLido");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    statusSMSNaoLido24,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "statusSMSNaoLido")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "StatusSMSNaoLido"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "StatusSMSNaoLido"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMSNaoLido"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMSNaoLido"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo a tabela StatusSMS com no máximo 400 linhas, contendo somente os status de SMS dos últimos 4 dias que ainda não tenham sido lidos, e os MARCA COMO LIDOS. Se houverem 400 linhas na tabela, podem haver mais status não lidos, e estes devem ser lidos usando chamadas subsequentes à função. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startstatusSMSNaoLido
     * @param statusSMSNaoLido24
     */
    public void startstatusSMSNaoLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument statusSMSNaoLido24,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMSNaoLido");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                statusSMSNaoLido24,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "statusSMSNaoLido")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "StatusSMSNaoLido"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.class);
                        callback.receiveResultstatusSMSNaoLido((br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorstatusSMSNaoLido(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "StatusSMSNaoLido"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "StatusSMSNaoLido"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "StatusSMSNaoLido"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorstatusSMSNaoLido(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMSNaoLido(f);
                                }
                            } else {
                                callback.receiveErrorstatusSMSNaoLido(f);
                            }
                        } else {
                            callback.receiveErrorstatusSMSNaoLido(f);
                        }
                    } else {
                        callback.receiveErrorstatusSMSNaoLido(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorstatusSMSNaoLido(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[12].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[12].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada SMSMO com no máximo 400 linhas, com as mensagens SMS MO não lidas, recebidas nos últimos 4 dias como resposta a SMS enviados anteriormente, e marca esses MOs COMO LIDOS. Se houverem 400 linhas na tabela, podem haver mais MOs não lidos, e estes devem ser lidos usando chamadas subsequentes à função. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#buscaSMSMONaoLido
     * @param buscaSMSMONaoLido26
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument buscaSMSMONaoLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument buscaSMSMONaoLido26)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSMONaoLido");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    buscaSMSMONaoLido26,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "buscaSMSMONaoLido")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "BuscaSMSMONaoLido"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "BuscaSMSMONaoLido"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSMONaoLido"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSMONaoLido"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada SMSMO com no máximo 400 linhas, com as mensagens SMS MO não lidas, recebidas nos últimos 4 dias como resposta a SMS enviados anteriormente, e marca esses MOs COMO LIDOS. Se houverem 400 linhas na tabela, podem haver mais MOs não lidos, e estes devem ser lidos usando chamadas subsequentes à função. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startbuscaSMSMONaoLido
     * @param buscaSMSMONaoLido26
     */
    public void startbuscaSMSMONaoLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument buscaSMSMONaoLido26,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSMONaoLido");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                buscaSMSMONaoLido26,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "buscaSMSMONaoLido")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "BuscaSMSMONaoLido"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.class);
                        callback.receiveResultbuscaSMSMONaoLido((br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorbuscaSMSMONaoLido(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "BuscaSMSMONaoLido"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSMONaoLido"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSMONaoLido"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorbuscaSMSMONaoLido(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMONaoLido(f);
                                }
                            } else {
                                callback.receiveErrorbuscaSMSMONaoLido(f);
                            }
                        } else {
                            callback.receiveErrorbuscaSMSMONaoLido(f);
                        }
                    } else {
                        callback.receiveErrorbuscaSMSMONaoLido(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorbuscaSMSMONaoLido(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[13].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[13].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * O mesmo que EnviaSMSConcatenadoComAcento, com 2 campos de referência. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 2048 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSConcatenadoComAcento2N
     * @param enviaSMSConcatenadoComAcento2N28
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument enviaSMSConcatenadoComAcento2N(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument enviaSMSConcatenadoComAcento2N28)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoComAcento2N");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSConcatenadoComAcento2N28,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSConcatenadoComAcento2N")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSConcatenadoComAcento2N"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "EnviaSMSConcatenadoComAcento2N"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoComAcento2N"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoComAcento2N"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * O mesmo que EnviaSMSConcatenadoComAcento, com 2 campos de referência. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 2048 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSConcatenadoComAcento2N
     * @param enviaSMSConcatenadoComAcento2N28
     */
    public void startenviaSMSConcatenadoComAcento2N(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument enviaSMSConcatenadoComAcento2N28,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoComAcento2N");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSConcatenadoComAcento2N28,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSConcatenadoComAcento2N")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSConcatenadoComAcento2N"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.class);
                        callback.receiveResultenviaSMSConcatenadoComAcento2N((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSConcatenadoComAcento2N(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSConcatenadoComAcento2N"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoComAcento2N"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoComAcento2N"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSConcatenadoComAcento2N(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSConcatenadoComAcento2N(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSConcatenadoComAcento2N(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[14].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[14].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Recebe um DataSet com os campos: SeuNum, e retorna um DataSet chamado OutDataSet contendo a tabela BuscaSMSAgendaDS com mensagens AGENDADAS. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#buscaSMSAgendaDataSet
     * @param buscaSMSAgendaDataSet30
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument buscaSMSAgendaDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument buscaSMSAgendaDataSet30)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSAgendaDataSet");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    buscaSMSAgendaDataSet30,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "buscaSMSAgendaDataSet")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "BuscaSMSAgendaDataSet"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "BuscaSMSAgendaDataSet"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSAgendaDataSet"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSAgendaDataSet"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Recebe um DataSet com os campos: SeuNum, e retorna um DataSet chamado OutDataSet contendo a tabela BuscaSMSAgendaDS com mensagens AGENDADAS. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startbuscaSMSAgendaDataSet
     * @param buscaSMSAgendaDataSet30
     */
    public void startbuscaSMSAgendaDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument buscaSMSAgendaDataSet30,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSAgendaDataSet");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                buscaSMSAgendaDataSet30,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "buscaSMSAgendaDataSet")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "BuscaSMSAgendaDataSet"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.class);
                        callback.receiveResultbuscaSMSAgendaDataSet((br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorbuscaSMSAgendaDataSet(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "BuscaSMSAgendaDataSet"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSAgendaDataSet"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSAgendaDataSet"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorbuscaSMSAgendaDataSet(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSAgendaDataSet(f);
                                }
                            } else {
                                callback.receiveErrorbuscaSMSAgendaDataSet(f);
                            }
                        } else {
                            callback.receiveErrorbuscaSMSAgendaDataSet(f);
                        }
                    } else {
                        callback.receiveErrorbuscaSMSAgendaDataSet(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorbuscaSMSAgendaDataSet(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[15].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[15].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * O mesmo que EnviaSMSConcatenadoComAcento, com 2 campos de referência. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 4096 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSConcatenadoSemAcento2N
     * @param enviaSMSConcatenadoSemAcento2N32
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument enviaSMSConcatenadoSemAcento2N(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument enviaSMSConcatenadoSemAcento2N32)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoSemAcento2N");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSConcatenadoSemAcento2N32,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSConcatenadoSemAcento2N")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSConcatenadoSemAcento2N"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "EnviaSMSConcatenadoSemAcento2N"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoSemAcento2N"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoSemAcento2N"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * O mesmo que EnviaSMSConcatenadoComAcento, com 2 campos de referência. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 4096 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSConcatenadoSemAcento2N
     * @param enviaSMSConcatenadoSemAcento2N32
     */
    public void startenviaSMSConcatenadoSemAcento2N(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument enviaSMSConcatenadoSemAcento2N32,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoSemAcento2N");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSConcatenadoSemAcento2N32,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSConcatenadoSemAcento2N")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSConcatenadoSemAcento2N"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.class);
                        callback.receiveResultenviaSMSConcatenadoSemAcento2N((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSConcatenadoSemAcento2N(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSConcatenadoSemAcento2N"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoSemAcento2N"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoSemAcento2N"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSConcatenadoSemAcento2N(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSConcatenadoSemAcento2N(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSConcatenadoSemAcento2N(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[16].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[16].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular utilizando url alternativa. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSAlt
     * @param enviaSMSAlt34
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument enviaSMSAlt(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument enviaSMSAlt34)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSAlt");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSAlt34,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSAlt")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSAlt"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSAlt"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSAlt"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSAlt"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular utilizando url alternativa. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSAlt
     * @param enviaSMSAlt34
     */
    public void startenviaSMSAlt(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument enviaSMSAlt34,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSAlt");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSAlt34,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSAlt")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSAlt"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.class);
                        callback.receiveResultenviaSMSAlt((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSAlt(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "EnviaSMSAlt"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSAlt"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSAlt"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSAlt(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAlt(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSAlt(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSAlt(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSAlt(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSAlt(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[17].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[17].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular com agendamento. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSAge
     * @param enviaSMSAge36
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument enviaSMSAge(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument enviaSMSAge36)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSAge");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSAge36,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSAge")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSAge"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSAge"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSAge"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSAge"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular com agendamento. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSAge
     * @param enviaSMSAge36
     */
    public void startenviaSMSAge(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument enviaSMSAge36,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSAge");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSAge36,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSAge")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSAge"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.class);
                        callback.receiveResultenviaSMSAge((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSAge(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "EnviaSMSAge"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSAge"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSAge"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSAge(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAge(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSAge(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSAge(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSAge(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSAge(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[18].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[18].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem de texto concatenado com acento para um celular. O campo Serie deve conter um número entre 0 e 255 e deve ser único para cada SMS concatenado enviado, sendo acrescido de 1 a cada envio, e quando atinge 255, comece com 0 (zero) novamente. Se essa mensagem for mais longa que 70 caracteres, ela será dividida em várias mensagens de até 70 caracteres e enviada de forma a chegar concatenada, em uma única mensagem, no celular de destino, desde que a operadora suporte concatenação. Se não houver suporte da operadora, a mensagem será enviada separadamente com + separando as mensagens. Tamanho máximo da mensagem = 2048 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 2048 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSConcatenadoComAcento
     * @param enviaSMSConcatenadoComAcento38
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument enviaSMSConcatenadoComAcento(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument enviaSMSConcatenadoComAcento38)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoComAcento");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSConcatenadoComAcento38,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSConcatenadoComAcento")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSConcatenadoComAcento"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "EnviaSMSConcatenadoComAcento"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoComAcento"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "EnviaSMSConcatenadoComAcento"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem de texto concatenado com acento para um celular. O campo Serie deve conter um número entre 0 e 255 e deve ser único para cada SMS concatenado enviado, sendo acrescido de 1 a cada envio, e quando atinge 255, comece com 0 (zero) novamente. Se essa mensagem for mais longa que 70 caracteres, ela será dividida em várias mensagens de até 70 caracteres e enviada de forma a chegar concatenada, em uma única mensagem, no celular de destino, desde que a operadora suporte concatenação. Se não houver suporte da operadora, a mensagem será enviada separadamente com + separando as mensagens. Tamanho máximo da mensagem = 2048 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 2048 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSConcatenadoComAcento
     * @param enviaSMSConcatenadoComAcento38
     */
    public void startenviaSMSConcatenadoComAcento(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument enviaSMSConcatenadoComAcento38,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSConcatenadoComAcento");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSConcatenadoComAcento38,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSConcatenadoComAcento")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSConcatenadoComAcento"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.class);
                        callback.receiveResultenviaSMSConcatenadoComAcento((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSConcatenadoComAcento(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSConcatenadoComAcento"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoComAcento"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSConcatenadoComAcento"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSConcatenadoComAcento(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSConcatenadoComAcento(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSConcatenadoComAcento(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSConcatenadoComAcento(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[19].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[19].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular. O campo ESM, DCS e Header devem estar no formato OTA 8 bit, com um número par de caracteres hexadecimais. O campo Mensagem deve estar formatado como uma string de texto. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSESMDCS
     * @param enviaSMSESMDCS40
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument enviaSMSESMDCS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument enviaSMSESMDCS40)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSESMDCS");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSESMDCS40,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSESMDCS")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSESMDCS"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSESMDCS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSESMDCS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSESMDCS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular. O campo ESM, DCS e Header devem estar no formato OTA 8 bit, com um número par de caracteres hexadecimais. O campo Mensagem deve estar formatado como uma string de texto. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSESMDCS
     * @param enviaSMSESMDCS40
     */
    public void startenviaSMSESMDCS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument enviaSMSESMDCS40,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSESMDCS");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSESMDCS40,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSESMDCS")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSESMDCS"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.class);
                        callback.receiveResultenviaSMSESMDCS((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSESMDCS(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSESMDCS"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSESMDCS"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSESMDCS"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSESMDCS(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSESMDCS(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSESMDCS(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSESMDCS(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSESMDCS(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSESMDCS(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[20].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[20].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular com agendamento. Se essa mensagem for mais longa que 140 caracteres, ela será dividida em várias mensagens de até 140 caracteres, com ... separando as mensagens. Tamanho máximo da mensagem = 4096 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSAgeQuebra
     * @param enviaSMSAgeQuebra42
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument enviaSMSAgeQuebra(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument enviaSMSAgeQuebra42)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSAgeQuebra");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSAgeQuebra42,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSAgeQuebra")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSAgeQuebra"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSAgeQuebra"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSAgeQuebra"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSAgeQuebra"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular com agendamento. Se essa mensagem for mais longa que 140 caracteres, ela será dividida em várias mensagens de até 140 caracteres, com ... separando as mensagens. Tamanho máximo da mensagem = 4096 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSAgeQuebra
     * @param enviaSMSAgeQuebra42
     */
    public void startenviaSMSAgeQuebra(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument enviaSMSAgeQuebra42,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSAgeQuebra");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSAgeQuebra42,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSAgeQuebra")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSAgeQuebra"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.class);
                        callback.receiveResultenviaSMSAgeQuebra((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSAgeQuebra(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSAgeQuebra"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSAgeQuebra"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSAgeQuebra"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSAgeQuebra(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSAgeQuebra(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSAgeQuebra(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSAgeQuebra(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSAgeQuebra(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSAgeQuebra(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[21].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[21].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem de texto para um celular. Se essa mensagem for mais longa que 140 caracteres, ela será dividida em várias mensagens de até 140 caracteres, com ... separando as mensagens. Tamanho máximo da mensagem = 4096 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 4096 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSQuebra
     * @param enviaSMSQuebra44
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument enviaSMSQuebra(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument enviaSMSQuebra44)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSQuebra");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSQuebra44,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSQuebra")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSQuebra"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSQuebra"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSQuebra"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSQuebra"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem de texto para um celular. Se essa mensagem for mais longa que 140 caracteres, ela será dividida em várias mensagens de até 140 caracteres, com ... separando as mensagens. Tamanho máximo da mensagem = 4096 caracteres. Retorna OK n (n é o número de SMS enviados pela operação), NOK (usuário ou senha inválidos, ou mensagem maior que 4096 caracteres), Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSQuebra
     * @param enviaSMSQuebra44
     */
    public void startenviaSMSQuebra(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument enviaSMSQuebra44,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSQuebra");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSQuebra44,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSQuebra")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSQuebra"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.class);
                        callback.receiveResultenviaSMSQuebra((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSQuebra(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSQuebra"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSQuebra"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSQuebra"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSQuebra(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSQuebra(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSQuebra(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSQuebra(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSQuebra(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSQuebra(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[22].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[22].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Recebe um DataSet com mensagens SMS a serem enviadas, com os seguintes campos: seunum (Seu número com até 20 caracteres), idlote (opcional) (ID do lote com até 20 caracteres), celular (55DDNNNNNNNN), mensagem, agendamento (opcional) (dd/mm/aaaa hh:mm:ss). Retorna OK n (n é o número de SMSs recebidos), NOK, Erro ou NA (não disponível)
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSDataSet
     * @param enviaSMSDataSet46
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument enviaSMSDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument enviaSMSDataSet46)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSDataSet");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSDataSet46,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSDataSet")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSDataSet"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSDataSet"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSDataSet"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSDataSet"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Recebe um DataSet com mensagens SMS a serem enviadas, com os seguintes campos: seunum (Seu número com até 20 caracteres), idlote (opcional) (ID do lote com até 20 caracteres), celular (55DDNNNNNNNN), mensagem, agendamento (opcional) (dd/mm/aaaa hh:mm:ss). Retorna OK n (n é o número de SMSs recebidos), NOK, Erro ou NA (não disponível)
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSDataSet
     * @param enviaSMSDataSet46
     */
    public void startenviaSMSDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument enviaSMSDataSet46,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSDataSet");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSDataSet46,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSDataSet")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSDataSet"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.class);
                        callback.receiveResultenviaSMSDataSet((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSDataSet(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSDataSet"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSDataSet"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSDataSet"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSDataSet(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSDataSet(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSDataSet(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSDataSet(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSDataSet(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSDataSet(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[23].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[23].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada BuscaSMSMO com todas as mensagens SMS MO recebidas DENTRO DE UM PERIODO como resposta a SMS enviados anteriormente. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#buscaSMSMO
     * @param buscaSMSMO48
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument buscaSMSMO(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument buscaSMSMO48)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSMO");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    buscaSMSMO48,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "buscaSMSMO")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "BuscaSMSMO"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "BuscaSMSMO"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSMO"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "BuscaSMSMO"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo uma Tabela chamada BuscaSMSMO com todas as mensagens SMS MO recebidas DENTRO DE UM PERIODO como resposta a SMS enviados anteriormente. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startbuscaSMSMO
     * @param buscaSMSMO48
     */
    public void startbuscaSMSMO(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument buscaSMSMO48,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/BuscaSMSMO");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                buscaSMSMO48,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "buscaSMSMO")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "BuscaSMSMO"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.class);
                        callback.receiveResultbuscaSMSMO((br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorbuscaSMSMO(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "BuscaSMSMO"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSMO"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "BuscaSMSMO"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorbuscaSMSMO(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorbuscaSMSMO(f);
                                }
                            } else {
                                callback.receiveErrorbuscaSMSMO(f);
                            }
                        } else {
                            callback.receiveErrorbuscaSMSMO(f);
                        }
                    } else {
                        callback.receiveErrorbuscaSMSMO(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorbuscaSMSMO(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[24].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[24].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Deleta uma mensagem agendada. Retorna OK ou NOK.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#delSMSAgenda
     * @param delSMSAgenda50
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument delSMSAgenda(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument delSMSAgenda50)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/DelSMSAgenda");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    delSMSAgenda50,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "delSMSAgenda")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "DelSMSAgenda"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DelSMSAgenda"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DelSMSAgenda"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DelSMSAgenda"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Deleta uma mensagem agendada. Retorna OK ou NOK.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startdelSMSAgenda
     * @param delSMSAgenda50
     */
    public void startdelSMSAgenda(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument delSMSAgenda50,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/DelSMSAgenda");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                delSMSAgenda50,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "delSMSAgenda")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "DelSMSAgenda"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.class);
                        callback.receiveResultdelSMSAgenda((br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrordelSMSAgenda(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "DelSMSAgenda"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "DelSMSAgenda"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "DelSMSAgenda"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrordelSMSAgenda(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgenda(f);
                                }
                            } else {
                                callback.receiveErrordelSMSAgenda(f);
                            }
                        } else {
                            callback.receiveErrordelSMSAgenda(f);
                        }
                    } else {
                        callback.receiveErrordelSMSAgenda(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrordelSMSAgenda(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[25].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[25].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Insere um número de celular na black list. Retorna 1 em caso de sucesso, 0 caso o celular já esteja na black list, -1 em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#insBL
     * @param insBL52
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument insBL(
        br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument insBL52)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/InsBL");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    insBL52,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "insBL")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "InsBL"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "InsBL"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "InsBL"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "InsBL"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Insere um número de celular na black list. Retorna 1 em caso de sucesso, 0 caso o celular já esteja na black list, -1 em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startinsBL
     * @param insBL52
     */
    public void startinsBL(
        br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument insBL52,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/InsBL");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                insBL52,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "insBL")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "InsBL"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.class);
                        callback.receiveResultinsBL((br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorinsBL(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "InsBL"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "InsBL"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "InsBL"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorinsBL(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsBL(f);
                                }
                            } else {
                                callback.receiveErrorinsBL(f);
                            }
                        } else {
                            callback.receiveErrorinsBL(f);
                        }
                    } else {
                        callback.receiveErrorinsBL(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorinsBL(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[26].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[26].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna a data de validade dos créditos de um Usuário Pré-Pago. Retorna Nothing se o Usuário não for do tipo Pré-Pago ou caso haja erro nos parâmetros.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#verValidade
     * @param verValidade54
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument verValidade(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument verValidade54)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/VerValidade");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    verValidade54,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "verValidade")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "VerValidade"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "VerValidade"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "VerValidade"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "VerValidade"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna a data de validade dos créditos de um Usuário Pré-Pago. Retorna Nothing se o Usuário não for do tipo Pré-Pago ou caso haja erro nos parâmetros.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startverValidade
     * @param verValidade54
     */
    public void startverValidade(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument verValidade54,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/VerValidade");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                verValidade54,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "verValidade")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "VerValidade"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.class);
                        callback.receiveResultverValidade((br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorverValidade(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "VerValidade"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "VerValidade"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "VerValidade"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorverValidade(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverValidade(f);
                                }
                            } else {
                                callback.receiveErrorverValidade(f);
                            }
                        } else {
                            callback.receiveErrorverValidade(f);
                        }
                    } else {
                        callback.receiveErrorverValidade(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorverValidade(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[27].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[27].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Deleta TODAS as mensagens agendadas que tenham o campo IdLote igual ao valor enviado como parâmetro. Retorna OK n, onde n é a quantidade de mensagens agendadas deletados, ou NOK.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#delSMSAgendaIdLote
     * @param delSMSAgendaIdLote56
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument delSMSAgendaIdLote(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument delSMSAgendaIdLote56)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/DelSMSAgendaIdLote");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    delSMSAgendaIdLote56,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "delSMSAgendaIdLote")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "DelSMSAgendaIdLote"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DelSMSAgendaIdLote"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DelSMSAgendaIdLote"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DelSMSAgendaIdLote"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Deleta TODAS as mensagens agendadas que tenham o campo IdLote igual ao valor enviado como parâmetro. Retorna OK n, onde n é a quantidade de mensagens agendadas deletados, ou NOK.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startdelSMSAgendaIdLote
     * @param delSMSAgendaIdLote56
     */
    public void startdelSMSAgendaIdLote(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument delSMSAgendaIdLote56,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/DelSMSAgendaIdLote");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                delSMSAgendaIdLote56,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "delSMSAgendaIdLote")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "DelSMSAgendaIdLote"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.class);
                        callback.receiveResultdelSMSAgendaIdLote((br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrordelSMSAgendaIdLote(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "DelSMSAgendaIdLote"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "DelSMSAgendaIdLote"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "DelSMSAgendaIdLote"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrordelSMSAgendaIdLote(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordelSMSAgendaIdLote(f);
                                }
                            } else {
                                callback.receiveErrordelSMSAgendaIdLote(f);
                            }
                        } else {
                            callback.receiveErrordelSMSAgendaIdLote(f);
                        }
                    } else {
                        callback.receiveErrordelSMSAgendaIdLote(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrordelSMSAgendaIdLote(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[28].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[28].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet com os celulares incluidos na black list. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#verBL
     * @param verBL58
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument verBL(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument verBL58)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/VerBL");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    verBL58,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "verBL")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "VerBL"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "VerBL"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "VerBL"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "VerBL"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet com os celulares incluidos na black list. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startverBL
     * @param verBL58
     */
    public void startverBL(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument verBL58,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/VerBL");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                verBL58,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "verBL")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "VerBL"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.class);
                        callback.receiveResultverBL((br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorverBL(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "VerBL"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "VerBL"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "VerBL"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorverBL(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverBL(f);
                                }
                            } else {
                                callback.receiveErrorverBL(f);
                            }
                        } else {
                            callback.receiveErrorverBL(f);
                        }
                    } else {
                        callback.receiveErrorverBL(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorverBL(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[29].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[29].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Verifica os créditos de um Usuário Pré-Pago. Retorna o número de créditos ou -1 se o Usuário não for do tipo Pré-Pago ou -2 em caso de erro nos parâmetros.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#verCredito
     * @param verCredito60
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument verCredito(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument verCredito60)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/VerCredito");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    verCredito60,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "verCredito")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "VerCredito"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "VerCredito"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "VerCredito"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "VerCredito"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Verifica os créditos de um Usuário Pré-Pago. Retorna o número de créditos ou -1 se o Usuário não for do tipo Pré-Pago ou -2 em caso de erro nos parâmetros.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startverCredito
     * @param verCredito60
     */
    public void startverCredito(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument verCredito60,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/VerCredito");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                verCredito60,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "verCredito")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "VerCredito"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.class);
                        callback.receiveResultverCredito((br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorverCredito(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "VerCredito"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "VerCredito"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "VerCredito"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorverCredito(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorverCredito(f);
                                }
                            } else {
                                callback.receiveErrorverCredito(f);
                            }
                        } else {
                            callback.receiveErrorverCredito(f);
                        }
                    } else {
                        callback.receiveErrorverCredito(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorverCredito(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[30].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[30].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo a tabela StatusSMS com o status de UM SMS já transmitido. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#statusSMS
     * @param statusSMS62
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument statusSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument statusSMS62)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMS");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    statusSMS62,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "statusSMS")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "StatusSMS"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "StatusSMS"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo a tabela StatusSMS com o status de UM SMS já transmitido. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startstatusSMS
     * @param statusSMS62
     */
    public void startstatusSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument statusSMS62,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMS");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                statusSMS62,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "statusSMS")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "StatusSMS"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.class);
                        callback.receiveResultstatusSMS((br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorstatusSMS(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "StatusSMS"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "StatusSMS"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "StatusSMS"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorstatusSMS(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS(f);
                                }
                            } else {
                                callback.receiveErrorstatusSMS(f);
                            }
                        } else {
                            callback.receiveErrorstatusSMS(f);
                        }
                    } else {
                        callback.receiveErrorstatusSMS(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorstatusSMS(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[31].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[31].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Retorna um DataSet chamado OutDataSet contendo a tabela StatusSMS com o status de UM SMS já transmitido. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#statusSMS2SN
     * @param statusSMS2SN64
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument statusSMS2SN(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument statusSMS2SN64)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMS2SN");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    statusSMS2SN64,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "statusSMS2SN")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "StatusSMS2SN"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "StatusSMS2SN"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMS2SN"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "StatusSMS2SN"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Retorna um DataSet chamado OutDataSet contendo a tabela StatusSMS com o status de UM SMS já transmitido. Retorna Nothing em caso de erro.
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startstatusSMS2SN
     * @param statusSMS2SN64
     */
    public void startstatusSMS2SN(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument statusSMS2SN64,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/StatusSMS2SN");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                statusSMS2SN64,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "statusSMS2SN")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "StatusSMS2SN"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.class);
                        callback.receiveResultstatusSMS2SN((br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorstatusSMS2SN(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "StatusSMS2SN"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "StatusSMS2SN"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "StatusSMS2SN"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorstatusSMS2SN(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorstatusSMS2SN(f);
                                }
                            } else {
                                callback.receiveErrorstatusSMS2SN(f);
                            }
                        } else {
                            callback.receiveErrorstatusSMS2SN(f);
                        }
                    } else {
                        callback.receiveErrorstatusSMS2SN(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorstatusSMS2SN(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[32].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[32].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem para um celular obedecendo um template pré-cadastrado no WebCorp. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSTemplate
     * @param enviaSMSTemplate66
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument enviaSMSTemplate(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument enviaSMSTemplate66)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSTemplate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSTemplate66,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSTemplate")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSTemplate"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSTemplate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSTemplate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSTemplate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem para um celular obedecendo um template pré-cadastrado no WebCorp. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSTemplate
     * @param enviaSMSTemplate66
     */
    public void startenviaSMSTemplate(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument enviaSMSTemplate66,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSTemplate");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSTemplate66,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSTemplate")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSTemplate"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.class);
                        callback.receiveResultenviaSMSTemplate((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSTemplate(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSTemplate"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSTemplate"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSTemplate"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSTemplate(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSTemplate(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSTemplate(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSTemplate(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSTemplate(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSTemplate(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[33].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[33].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     * Envia uma mensagem binária para um celular. Tanto o campo Header como o Data devem estar no formato OTA 8 bit, com um número par de caracteres hexadecimais. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#enviaSMSOTA8Bit
     * @param enviaSMSOTA8Bit68
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument enviaSMSOTA8Bit(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument enviaSMSOTA8Bit68)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
            _operationClient.getOptions()
                            .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSOTA8Bit");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    enviaSMSOTA8Bit68,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                            "enviaSMSOTA8Bit")),
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "EnviaSMSOTA8Bit"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.class);

            return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EnviaSMSOTA8Bit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSOTA8Bit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EnviaSMSOTA8Bit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * Envia uma mensagem binária para um celular. Tanto o campo Header como o Data devem estar no formato OTA 8 bit, com um número par de caracteres hexadecimais. Retorna OK, NOK, Erro ou NA (não disponível).
     * @see com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_Service#startenviaSMSOTA8Bit
     * @param enviaSMSOTA8Bit68
     */
    public void startenviaSMSOTA8Bit(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument enviaSMSOTA8Bit68,
        final com.inspiring.surf.tww.ws.ReluzCap_x0020_Web_x0020_ServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
        _operationClient.getOptions()
                        .setAction("https://www.twwwireless.com.br/reluzcap/wsreluzcap/EnviaSMSOTA8Bit");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                enviaSMSOTA8Bit68,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                        "enviaSMSOTA8Bit")),
                new javax.xml.namespace.QName(
                    "https://www.twwwireless.com.br/reluzcap/wsreluzcap",
                    "EnviaSMSOTA8Bit"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.class);
                        callback.receiveResultenviaSMSOTA8Bit((br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorenviaSMSOTA8Bit(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "EnviaSMSOTA8Bit"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSOTA8Bit"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "EnviaSMSOTA8Bit"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorenviaSMSOTA8Bit(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorenviaSMSOTA8Bit(f);
                                }
                            } else {
                                callback.receiveErrorenviaSMSOTA8Bit(f);
                            }
                        } else {
                            callback.receiveErrorenviaSMSOTA8Bit(f);
                        }
                    } else {
                        callback.receiveErrorenviaSMSOTA8Bit(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorenviaSMSOTA8Bit(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[34].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[34].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when
     * serializing objects to XML.
     *
     * @return the options used for serialization
     */
    public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
        return _xmlOptions;
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        _xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param, java.lang.Class type)
        throws org.apache.axis2.AxisFault {
        try {
            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMODocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }

            if (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.class.equals(
                        type)) {
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
                    new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);

                return br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.Factory.parse(param.getXMLStreamReader(
                        false, configuration));
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
