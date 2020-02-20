/*
 * An XML document type.
 * Localname: EnviaSMSXMLResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSXMLResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSXMLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSXMLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSXMLRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSXMLResponse");
    
    
    /**
     * Gets the "EnviaSMSXMLResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse getEnviaSMSXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse)get_store().find_element_user(ENVIASMSXMLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSXMLResponse" element
     */
    public void setEnviaSMSXMLResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse enviaSMSXMLResponse)
    {
        generatedSetterHelperImpl(enviaSMSXMLResponse, ENVIASMSXMLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSXMLResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse addNewEnviaSMSXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse)get_store().add_element_user(ENVIASMSXMLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSXMLResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSXMLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSXMLResponseDocument.EnviaSMSXMLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSXMLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSXMLRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSXMLResult");
        
        
        /**
         * Gets the "EnviaSMSXMLResult" element
         */
        public java.lang.String getEnviaSMSXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSXMLRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSXMLResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSXMLRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSXMLResult" element
         */
        public boolean isSetEnviaSMSXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSXMLRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSXMLResult" element
         */
        public void setEnviaSMSXMLResult(java.lang.String enviaSMSXMLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSXMLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSXMLRESULT$0);
                }
                target.setStringValue(enviaSMSXMLResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSXMLResult" element
         */
        public void xsetEnviaSMSXMLResult(org.apache.xmlbeans.XmlString enviaSMSXMLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSXMLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSXMLRESULT$0);
                }
                target.set(enviaSMSXMLResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSXMLResult" element
         */
        public void unsetEnviaSMSXMLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSXMLRESULT$0, 0);
            }
        }
    }
}
