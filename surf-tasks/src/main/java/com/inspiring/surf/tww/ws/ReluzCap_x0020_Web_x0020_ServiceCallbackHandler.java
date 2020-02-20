/**
 * ReluzCap_x0020_Web_x0020_ServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.inspiring.surf.tww.ws;


/**
 *  ReluzCap_x0020_Web_x0020_ServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ReluzCap_x0020_Web_x0020_ServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ReluzCap_x0020_Web_x0020_ServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ReluzCap_x0020_Web_x0020_ServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for enviaSMSConcatenadoSemAcento method
     * override this method for handling normal response from enviaSMSConcatenadoSemAcento operation
     */
    public void receiveResultenviaSMSConcatenadoSemAcento(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSConcatenadoSemAcento operation
     */
    public void receiveErrorenviaSMSConcatenadoSemAcento(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscaSMSAgenda method
     * override this method for handling normal response from buscaSMSAgenda operation
     */
    public void receiveResultbuscaSMSAgenda(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscaSMSAgenda operation
     */
    public void receiveErrorbuscaSMSAgenda(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscaSMSMONaoLidoQuant method
     * override this method for handling normal response from buscaSMSMONaoLidoQuant operation
     */
    public void receiveResultbuscaSMSMONaoLidoQuant(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscaSMSMONaoLidoQuant operation
     */
    public void receiveErrorbuscaSMSMONaoLidoQuant(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for resetaStatusLido method
     * override this method for handling normal response from resetaStatusLido operation
     */
    public void receiveResultresetaStatusLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from resetaStatusLido operation
     */
    public void receiveErrorresetaStatusLido(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for alteraSenha method
     * override this method for handling normal response from alteraSenha operation
     */
    public void receiveResultalteraSenha(
        br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from alteraSenha operation
     */
    public void receiveErroralteraSenha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSTIM method
     * override this method for handling normal response from enviaSMSTIM operation
     */
    public void receiveResultenviaSMSTIM(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSTIM operation
     */
    public void receiveErrorenviaSMSTIM(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMS method
     * override this method for handling normal response from enviaSMS operation
     */
    public void receiveResultenviaSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMS operation
     */
    public void receiveErrorenviaSMS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for resetaMOLido method
     * override this method for handling normal response from resetaMOLido operation
     */
    public void receiveResultresetaMOLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from resetaMOLido operation
     */
    public void receiveErrorresetaMOLido(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSXML method
     * override this method for handling normal response from enviaSMSXML operation
     */
    public void receiveResultenviaSMSXML(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSXML operation
     */
    public void receiveErrorenviaSMSXML(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscaSMS method
     * override this method for handling normal response from buscaSMS operation
     */
    public void receiveResultbuscaSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscaSMS operation
     */
    public void receiveErrorbuscaSMS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for statusSMSDataSet method
     * override this method for handling normal response from statusSMSDataSet operation
     */
    public void receiveResultstatusSMSDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from statusSMSDataSet operation
     */
    public void receiveErrorstatusSMSDataSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMS2SN method
     * override this method for handling normal response from enviaSMS2SN operation
     */
    public void receiveResultenviaSMS2SN(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMS2SN operation
     */
    public void receiveErrorenviaSMS2SN(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for statusSMSNaoLido method
     * override this method for handling normal response from statusSMSNaoLido operation
     */
    public void receiveResultstatusSMSNaoLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from statusSMSNaoLido operation
     */
    public void receiveErrorstatusSMSNaoLido(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscaSMSMONaoLido method
     * override this method for handling normal response from buscaSMSMONaoLido operation
     */
    public void receiveResultbuscaSMSMONaoLido(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscaSMSMONaoLido operation
     */
    public void receiveErrorbuscaSMSMONaoLido(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSConcatenadoComAcento2N method
     * override this method for handling normal response from enviaSMSConcatenadoComAcento2N operation
     */
    public void receiveResultenviaSMSConcatenadoComAcento2N(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSConcatenadoComAcento2N operation
     */
    public void receiveErrorenviaSMSConcatenadoComAcento2N(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscaSMSAgendaDataSet method
     * override this method for handling normal response from buscaSMSAgendaDataSet operation
     */
    public void receiveResultbuscaSMSAgendaDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscaSMSAgendaDataSet operation
     */
    public void receiveErrorbuscaSMSAgendaDataSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSConcatenadoSemAcento2N method
     * override this method for handling normal response from enviaSMSConcatenadoSemAcento2N operation
     */
    public void receiveResultenviaSMSConcatenadoSemAcento2N(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSConcatenadoSemAcento2N operation
     */
    public void receiveErrorenviaSMSConcatenadoSemAcento2N(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSAlt method
     * override this method for handling normal response from enviaSMSAlt operation
     */
    public void receiveResultenviaSMSAlt(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSAlt operation
     */
    public void receiveErrorenviaSMSAlt(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSAge method
     * override this method for handling normal response from enviaSMSAge operation
     */
    public void receiveResultenviaSMSAge(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSAge operation
     */
    public void receiveErrorenviaSMSAge(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSConcatenadoComAcento method
     * override this method for handling normal response from enviaSMSConcatenadoComAcento operation
     */
    public void receiveResultenviaSMSConcatenadoComAcento(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSConcatenadoComAcento operation
     */
    public void receiveErrorenviaSMSConcatenadoComAcento(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSESMDCS method
     * override this method for handling normal response from enviaSMSESMDCS operation
     */
    public void receiveResultenviaSMSESMDCS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSESMDCS operation
     */
    public void receiveErrorenviaSMSESMDCS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSAgeQuebra method
     * override this method for handling normal response from enviaSMSAgeQuebra operation
     */
    public void receiveResultenviaSMSAgeQuebra(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSAgeQuebra operation
     */
    public void receiveErrorenviaSMSAgeQuebra(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSQuebra method
     * override this method for handling normal response from enviaSMSQuebra operation
     */
    public void receiveResultenviaSMSQuebra(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSQuebra operation
     */
    public void receiveErrorenviaSMSQuebra(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSDataSet method
     * override this method for handling normal response from enviaSMSDataSet operation
     */
    public void receiveResultenviaSMSDataSet(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSDataSet operation
     */
    public void receiveErrorenviaSMSDataSet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscaSMSMO method
     * override this method for handling normal response from buscaSMSMO operation
     */
    public void receiveResultbuscaSMSMO(
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscaSMSMO operation
     */
    public void receiveErrorbuscaSMSMO(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delSMSAgenda method
     * override this method for handling normal response from delSMSAgenda operation
     */
    public void receiveResultdelSMSAgenda(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delSMSAgenda operation
     */
    public void receiveErrordelSMSAgenda(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for insBL method
     * override this method for handling normal response from insBL operation
     */
    public void receiveResultinsBL(
        br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from insBL operation
     */
    public void receiveErrorinsBL(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verValidade method
     * override this method for handling normal response from verValidade operation
     */
    public void receiveResultverValidade(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verValidade operation
     */
    public void receiveErrorverValidade(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delSMSAgendaIdLote method
     * override this method for handling normal response from delSMSAgendaIdLote operation
     */
    public void receiveResultdelSMSAgendaIdLote(
        br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delSMSAgendaIdLote operation
     */
    public void receiveErrordelSMSAgendaIdLote(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verBL method
     * override this method for handling normal response from verBL operation
     */
    public void receiveResultverBL(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verBL operation
     */
    public void receiveErrorverBL(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verCredito method
     * override this method for handling normal response from verCredito operation
     */
    public void receiveResultverCredito(
        br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verCredito operation
     */
    public void receiveErrorverCredito(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for statusSMS method
     * override this method for handling normal response from statusSMS operation
     */
    public void receiveResultstatusSMS(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from statusSMS operation
     */
    public void receiveErrorstatusSMS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for statusSMS2SN method
     * override this method for handling normal response from statusSMS2SN operation
     */
    public void receiveResultstatusSMS2SN(
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from statusSMS2SN operation
     */
    public void receiveErrorstatusSMS2SN(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSTemplate method
     * override this method for handling normal response from enviaSMSTemplate operation
     */
    public void receiveResultenviaSMSTemplate(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSTemplate operation
     */
    public void receiveErrorenviaSMSTemplate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviaSMSOTA8Bit method
     * override this method for handling normal response from enviaSMSOTA8Bit operation
     */
    public void receiveResultenviaSMSOTA8Bit(
        br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviaSMSOTA8Bit operation
     */
    public void receiveErrorenviaSMSOTA8Bit(java.lang.Exception e) {
    }
}
