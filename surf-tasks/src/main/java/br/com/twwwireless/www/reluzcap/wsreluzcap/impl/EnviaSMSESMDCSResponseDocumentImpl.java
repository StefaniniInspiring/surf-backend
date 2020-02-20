/*
 * An XML document type.
 * Localname: EnviaSMSESMDCSResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSESMDCSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSESMDCSResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSESMDCSResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSESMDCSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSESMDCSResponse");
    
    
    /**
     * Gets the "EnviaSMSESMDCSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse getEnviaSMSESMDCSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse)get_store().find_element_user(ENVIASMSESMDCSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSESMDCSResponse" element
     */
    public void setEnviaSMSESMDCSResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse enviaSMSESMDCSResponse)
    {
        generatedSetterHelperImpl(enviaSMSESMDCSResponse, ENVIASMSESMDCSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSESMDCSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse addNewEnviaSMSESMDCSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse)get_store().add_element_user(ENVIASMSESMDCSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSESMDCSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSESMDCSResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSResponseDocument.EnviaSMSESMDCSResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSESMDCSResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSESMDCSRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSESMDCSResult");
        
        
        /**
         * Gets the "EnviaSMSESMDCSResult" element
         */
        public java.lang.String getEnviaSMSESMDCSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSESMDCSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSESMDCSResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSESMDCSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSESMDCSRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSESMDCSResult" element
         */
        public boolean isSetEnviaSMSESMDCSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSESMDCSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSESMDCSResult" element
         */
        public void setEnviaSMSESMDCSResult(java.lang.String enviaSMSESMDCSResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSESMDCSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSESMDCSRESULT$0);
                }
                target.setStringValue(enviaSMSESMDCSResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSESMDCSResult" element
         */
        public void xsetEnviaSMSESMDCSResult(org.apache.xmlbeans.XmlString enviaSMSESMDCSResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSESMDCSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSESMDCSRESULT$0);
                }
                target.set(enviaSMSESMDCSResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSESMDCSResult" element
         */
        public void unsetEnviaSMSESMDCSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSESMDCSRESULT$0, 0);
            }
        }
    }
}
