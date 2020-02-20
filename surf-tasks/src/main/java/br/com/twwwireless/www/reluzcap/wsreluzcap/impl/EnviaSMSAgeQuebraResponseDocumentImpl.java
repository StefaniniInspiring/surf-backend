/*
 * An XML document type.
 * Localname: EnviaSMSAgeQuebraResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSAgeQuebraResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSAgeQuebraResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSAgeQuebraResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSAGEQUEBRARESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAgeQuebraResponse");
    
    
    /**
     * Gets the "EnviaSMSAgeQuebraResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse getEnviaSMSAgeQuebraResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse)get_store().find_element_user(ENVIASMSAGEQUEBRARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSAgeQuebraResponse" element
     */
    public void setEnviaSMSAgeQuebraResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse enviaSMSAgeQuebraResponse)
    {
        generatedSetterHelperImpl(enviaSMSAgeQuebraResponse, ENVIASMSAGEQUEBRARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSAgeQuebraResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse addNewEnviaSMSAgeQuebraResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse)get_store().add_element_user(ENVIASMSAGEQUEBRARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSAgeQuebraResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSAgeQuebraResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeQuebraResponseDocument.EnviaSMSAgeQuebraResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSAgeQuebraResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSAGEQUEBRARESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAgeQuebraResult");
        
        
        /**
         * Gets the "EnviaSMSAgeQuebraResult" element
         */
        public java.lang.String getEnviaSMSAgeQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSAGEQUEBRARESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSAgeQuebraResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSAgeQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSAGEQUEBRARESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSAgeQuebraResult" element
         */
        public boolean isSetEnviaSMSAgeQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSAGEQUEBRARESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSAgeQuebraResult" element
         */
        public void setEnviaSMSAgeQuebraResult(java.lang.String enviaSMSAgeQuebraResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSAGEQUEBRARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSAGEQUEBRARESULT$0);
                }
                target.setStringValue(enviaSMSAgeQuebraResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSAgeQuebraResult" element
         */
        public void xsetEnviaSMSAgeQuebraResult(org.apache.xmlbeans.XmlString enviaSMSAgeQuebraResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSAGEQUEBRARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSAGEQUEBRARESULT$0);
                }
                target.set(enviaSMSAgeQuebraResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSAgeQuebraResult" element
         */
        public void unsetEnviaSMSAgeQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSAGEQUEBRARESULT$0, 0);
            }
        }
    }
}
