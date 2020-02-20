/*
 * An XML document type.
 * Localname: EnviaSMSAgeResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSAgeResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSAgeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSAgeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSAGERESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAgeResponse");
    
    
    /**
     * Gets the "EnviaSMSAgeResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse getEnviaSMSAgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse)get_store().find_element_user(ENVIASMSAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSAgeResponse" element
     */
    public void setEnviaSMSAgeResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse enviaSMSAgeResponse)
    {
        generatedSetterHelperImpl(enviaSMSAgeResponse, ENVIASMSAGERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSAgeResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse addNewEnviaSMSAgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse)get_store().add_element_user(ENVIASMSAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSAgeResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSAgeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSAgeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSAGERESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAgeResult");
        
        
        /**
         * Gets the "EnviaSMSAgeResult" element
         */
        public java.lang.String getEnviaSMSAgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSAGERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSAgeResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSAgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSAGERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSAgeResult" element
         */
        public boolean isSetEnviaSMSAgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSAGERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSAgeResult" element
         */
        public void setEnviaSMSAgeResult(java.lang.String enviaSMSAgeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSAGERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSAGERESULT$0);
                }
                target.setStringValue(enviaSMSAgeResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSAgeResult" element
         */
        public void xsetEnviaSMSAgeResult(org.apache.xmlbeans.XmlString enviaSMSAgeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSAGERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSAGERESULT$0);
                }
                target.set(enviaSMSAgeResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSAgeResult" element
         */
        public void unsetEnviaSMSAgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSAGERESULT$0, 0);
            }
        }
    }
}
