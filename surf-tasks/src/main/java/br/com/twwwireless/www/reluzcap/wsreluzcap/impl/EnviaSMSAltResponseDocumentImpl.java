/*
 * An XML document type.
 * Localname: EnviaSMSAltResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSAltResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSAltResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSAltResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSALTRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAltResponse");
    
    
    /**
     * Gets the "EnviaSMSAltResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse getEnviaSMSAltResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse)get_store().find_element_user(ENVIASMSALTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSAltResponse" element
     */
    public void setEnviaSMSAltResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse enviaSMSAltResponse)
    {
        generatedSetterHelperImpl(enviaSMSAltResponse, ENVIASMSALTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSAltResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse addNewEnviaSMSAltResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse)get_store().add_element_user(ENVIASMSALTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSAltResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSAltResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltResponseDocument.EnviaSMSAltResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSAltResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSALTRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAltResult");
        
        
        /**
         * Gets the "EnviaSMSAltResult" element
         */
        public java.lang.String getEnviaSMSAltResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSALTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSAltResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSAltResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSALTRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSAltResult" element
         */
        public boolean isSetEnviaSMSAltResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSALTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSAltResult" element
         */
        public void setEnviaSMSAltResult(java.lang.String enviaSMSAltResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSALTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSALTRESULT$0);
                }
                target.setStringValue(enviaSMSAltResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSAltResult" element
         */
        public void xsetEnviaSMSAltResult(org.apache.xmlbeans.XmlString enviaSMSAltResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSALTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSALTRESULT$0);
                }
                target.set(enviaSMSAltResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSAltResult" element
         */
        public void unsetEnviaSMSAltResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSALTRESULT$0, 0);
            }
        }
    }
}
