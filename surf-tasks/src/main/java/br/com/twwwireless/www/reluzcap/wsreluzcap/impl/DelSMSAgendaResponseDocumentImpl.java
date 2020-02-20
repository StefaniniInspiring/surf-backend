/*
 * An XML document type.
 * Localname: DelSMSAgendaResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one DelSMSAgendaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class DelSMSAgendaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DelSMSAgendaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELSMSAGENDARESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DelSMSAgendaResponse");
    
    
    /**
     * Gets the "DelSMSAgendaResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse getDelSMSAgendaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse)get_store().find_element_user(DELSMSAGENDARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DelSMSAgendaResponse" element
     */
    public void setDelSMSAgendaResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse delSMSAgendaResponse)
    {
        generatedSetterHelperImpl(delSMSAgendaResponse, DELSMSAGENDARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DelSMSAgendaResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse addNewDelSMSAgendaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse)get_store().add_element_user(DELSMSAGENDARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DelSMSAgendaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class DelSMSAgendaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.DelSMSAgendaResponseDocument.DelSMSAgendaResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DelSMSAgendaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELSMSAGENDARESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DelSMSAgendaResult");
        
        
        /**
         * Gets the "DelSMSAgendaResult" element
         */
        public java.lang.String getDelSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELSMSAGENDARESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DelSMSAgendaResult" element
         */
        public org.apache.xmlbeans.XmlString xgetDelSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELSMSAGENDARESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DelSMSAgendaResult" element
         */
        public boolean isSetDelSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELSMSAGENDARESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "DelSMSAgendaResult" element
         */
        public void setDelSMSAgendaResult(java.lang.String delSMSAgendaResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELSMSAGENDARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELSMSAGENDARESULT$0);
                }
                target.setStringValue(delSMSAgendaResult);
            }
        }
        
        /**
         * Sets (as xml) the "DelSMSAgendaResult" element
         */
        public void xsetDelSMSAgendaResult(org.apache.xmlbeans.XmlString delSMSAgendaResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELSMSAGENDARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELSMSAGENDARESULT$0);
                }
                target.set(delSMSAgendaResult);
            }
        }
        
        /**
         * Unsets the "DelSMSAgendaResult" element
         */
        public void unsetDelSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELSMSAGENDARESULT$0, 0);
            }
        }
    }
}
