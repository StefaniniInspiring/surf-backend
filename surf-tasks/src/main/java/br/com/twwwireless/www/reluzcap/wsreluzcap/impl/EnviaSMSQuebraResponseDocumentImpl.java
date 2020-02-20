/*
 * An XML document type.
 * Localname: EnviaSMSQuebraResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSQuebraResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSQuebraResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSQuebraResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSQUEBRARESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSQuebraResponse");
    
    
    /**
     * Gets the "EnviaSMSQuebraResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse getEnviaSMSQuebraResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse)get_store().find_element_user(ENVIASMSQUEBRARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSQuebraResponse" element
     */
    public void setEnviaSMSQuebraResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse enviaSMSQuebraResponse)
    {
        generatedSetterHelperImpl(enviaSMSQuebraResponse, ENVIASMSQUEBRARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSQuebraResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse addNewEnviaSMSQuebraResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse)get_store().add_element_user(ENVIASMSQUEBRARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSQuebraResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSQuebraResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSQuebraResponseDocument.EnviaSMSQuebraResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSQuebraResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSQUEBRARESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSQuebraResult");
        
        
        /**
         * Gets the "EnviaSMSQuebraResult" element
         */
        public java.lang.String getEnviaSMSQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSQUEBRARESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSQuebraResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSQUEBRARESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSQuebraResult" element
         */
        public boolean isSetEnviaSMSQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSQUEBRARESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSQuebraResult" element
         */
        public void setEnviaSMSQuebraResult(java.lang.String enviaSMSQuebraResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSQUEBRARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSQUEBRARESULT$0);
                }
                target.setStringValue(enviaSMSQuebraResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSQuebraResult" element
         */
        public void xsetEnviaSMSQuebraResult(org.apache.xmlbeans.XmlString enviaSMSQuebraResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSQUEBRARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSQUEBRARESULT$0);
                }
                target.set(enviaSMSQuebraResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSQuebraResult" element
         */
        public void unsetEnviaSMSQuebraResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSQUEBRARESULT$0, 0);
            }
        }
    }
}
