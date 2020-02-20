/*
 * An XML document type.
 * Localname: EnviaSMSOTA8BitResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSOTA8BitResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSOTA8BitResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSOTA8BitResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSOTA8BITRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSOTA8BitResponse");
    
    
    /**
     * Gets the "EnviaSMSOTA8BitResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse getEnviaSMSOTA8BitResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse)get_store().find_element_user(ENVIASMSOTA8BITRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSOTA8BitResponse" element
     */
    public void setEnviaSMSOTA8BitResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse enviaSMSOTA8BitResponse)
    {
        generatedSetterHelperImpl(enviaSMSOTA8BitResponse, ENVIASMSOTA8BITRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSOTA8BitResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse addNewEnviaSMSOTA8BitResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse)get_store().add_element_user(ENVIASMSOTA8BITRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSOTA8BitResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSOTA8BitResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSOTA8BitResponseDocument.EnviaSMSOTA8BitResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSOTA8BitResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSOTA8BITRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSOTA8BitResult");
        
        
        /**
         * Gets the "EnviaSMSOTA8BitResult" element
         */
        public java.lang.String getEnviaSMSOTA8BitResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSOTA8BITRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSOTA8BitResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSOTA8BitResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSOTA8BITRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSOTA8BitResult" element
         */
        public boolean isSetEnviaSMSOTA8BitResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSOTA8BITRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSOTA8BitResult" element
         */
        public void setEnviaSMSOTA8BitResult(java.lang.String enviaSMSOTA8BitResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSOTA8BITRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSOTA8BITRESULT$0);
                }
                target.setStringValue(enviaSMSOTA8BitResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSOTA8BitResult" element
         */
        public void xsetEnviaSMSOTA8BitResult(org.apache.xmlbeans.XmlString enviaSMSOTA8BitResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSOTA8BITRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSOTA8BITRESULT$0);
                }
                target.set(enviaSMSOTA8BitResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSOTA8BitResult" element
         */
        public void unsetEnviaSMSOTA8BitResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSOTA8BITRESULT$0, 0);
            }
        }
    }
}
