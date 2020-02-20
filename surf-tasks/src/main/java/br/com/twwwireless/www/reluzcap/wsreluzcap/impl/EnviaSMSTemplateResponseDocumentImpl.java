/*
 * An XML document type.
 * Localname: EnviaSMSTemplateResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSTemplateResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSTemplateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSTemplateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSTEMPLATERESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSTemplateResponse");
    
    
    /**
     * Gets the "EnviaSMSTemplateResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse getEnviaSMSTemplateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse)get_store().find_element_user(ENVIASMSTEMPLATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSTemplateResponse" element
     */
    public void setEnviaSMSTemplateResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse enviaSMSTemplateResponse)
    {
        generatedSetterHelperImpl(enviaSMSTemplateResponse, ENVIASMSTEMPLATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSTemplateResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse addNewEnviaSMSTemplateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse)get_store().add_element_user(ENVIASMSTEMPLATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSTemplateResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSTemplateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateResponseDocument.EnviaSMSTemplateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSTemplateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSTEMPLATERESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSTemplateResult");
        
        
        /**
         * Gets the "EnviaSMSTemplateResult" element
         */
        public java.lang.String getEnviaSMSTemplateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSTEMPLATERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSTemplateResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSTemplateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSTEMPLATERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSTemplateResult" element
         */
        public boolean isSetEnviaSMSTemplateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSTEMPLATERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSTemplateResult" element
         */
        public void setEnviaSMSTemplateResult(java.lang.String enviaSMSTemplateResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSTEMPLATERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSTEMPLATERESULT$0);
                }
                target.setStringValue(enviaSMSTemplateResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSTemplateResult" element
         */
        public void xsetEnviaSMSTemplateResult(org.apache.xmlbeans.XmlString enviaSMSTemplateResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSTEMPLATERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSTEMPLATERESULT$0);
                }
                target.set(enviaSMSTemplateResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSTemplateResult" element
         */
        public void unsetEnviaSMSTemplateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSTEMPLATERESULT$0, 0);
            }
        }
    }
}
