/*
 * An XML document type.
 * Localname: EnviaSMSDataSetResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSDataSetResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSDataSetResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSDATASETRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSDataSetResponse");
    
    
    /**
     * Gets the "EnviaSMSDataSetResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse getEnviaSMSDataSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse)get_store().find_element_user(ENVIASMSDATASETRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSDataSetResponse" element
     */
    public void setEnviaSMSDataSetResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse enviaSMSDataSetResponse)
    {
        generatedSetterHelperImpl(enviaSMSDataSetResponse, ENVIASMSDATASETRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSDataSetResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse addNewEnviaSMSDataSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse)get_store().add_element_user(ENVIASMSDATASETRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSDataSetResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDataSetResponseDocument.EnviaSMSDataSetResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSDataSetResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSDATASETRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSDataSetResult");
        
        
        /**
         * Gets the "EnviaSMSDataSetResult" element
         */
        public java.lang.String getEnviaSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSDATASETRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSDataSetResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSDATASETRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSDataSetResult" element
         */
        public boolean isSetEnviaSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSDATASETRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSDataSetResult" element
         */
        public void setEnviaSMSDataSetResult(java.lang.String enviaSMSDataSetResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSDATASETRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSDATASETRESULT$0);
                }
                target.setStringValue(enviaSMSDataSetResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSDataSetResult" element
         */
        public void xsetEnviaSMSDataSetResult(org.apache.xmlbeans.XmlString enviaSMSDataSetResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSDATASETRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSDATASETRESULT$0);
                }
                target.set(enviaSMSDataSetResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSDataSetResult" element
         */
        public void unsetEnviaSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSDATASETRESULT$0, 0);
            }
        }
    }
}
