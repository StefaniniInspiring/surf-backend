/*
 * An XML document type.
 * Localname: DelSMSAgendaIdLoteResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one DelSMSAgendaIdLoteResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class DelSMSAgendaIdLoteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DelSMSAgendaIdLoteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELSMSAGENDAIDLOTERESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DelSMSAgendaIdLoteResponse");
    
    
    /**
     * Gets the "DelSMSAgendaIdLoteResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse getDelSMSAgendaIdLoteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse)get_store().find_element_user(DELSMSAGENDAIDLOTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DelSMSAgendaIdLoteResponse" element
     */
    public void setDelSMSAgendaIdLoteResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse delSMSAgendaIdLoteResponse)
    {
        generatedSetterHelperImpl(delSMSAgendaIdLoteResponse, DELSMSAGENDAIDLOTERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DelSMSAgendaIdLoteResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse addNewDelSMSAgendaIdLoteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse)get_store().add_element_user(DELSMSAGENDAIDLOTERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DelSMSAgendaIdLoteResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class DelSMSAgendaIdLoteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaIdLoteResponseDocument.DelSMSAgendaIdLoteResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DelSMSAgendaIdLoteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELSMSAGENDAIDLOTERESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DelSMSAgendaIdLoteResult");
        
        
        /**
         * Gets the "DelSMSAgendaIdLoteResult" element
         */
        public java.lang.String getDelSMSAgendaIdLoteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELSMSAGENDAIDLOTERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DelSMSAgendaIdLoteResult" element
         */
        public org.apache.xmlbeans.XmlString xgetDelSMSAgendaIdLoteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELSMSAGENDAIDLOTERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DelSMSAgendaIdLoteResult" element
         */
        public boolean isSetDelSMSAgendaIdLoteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELSMSAGENDAIDLOTERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "DelSMSAgendaIdLoteResult" element
         */
        public void setDelSMSAgendaIdLoteResult(java.lang.String delSMSAgendaIdLoteResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELSMSAGENDAIDLOTERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELSMSAGENDAIDLOTERESULT$0);
                }
                target.setStringValue(delSMSAgendaIdLoteResult);
            }
        }
        
        /**
         * Sets (as xml) the "DelSMSAgendaIdLoteResult" element
         */
        public void xsetDelSMSAgendaIdLoteResult(org.apache.xmlbeans.XmlString delSMSAgendaIdLoteResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELSMSAGENDAIDLOTERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELSMSAGENDAIDLOTERESULT$0);
                }
                target.set(delSMSAgendaIdLoteResult);
            }
        }
        
        /**
         * Unsets the "DelSMSAgendaIdLoteResult" element
         */
        public void unsetDelSMSAgendaIdLoteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELSMSAGENDAIDLOTERESULT$0, 0);
            }
        }
    }
}
