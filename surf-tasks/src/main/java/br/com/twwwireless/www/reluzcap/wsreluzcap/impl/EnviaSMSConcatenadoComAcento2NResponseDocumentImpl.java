/*
 * An XML document type.
 * Localname: EnviaSMSConcatenadoComAcento2NResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSConcatenadoComAcento2NResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSConcatenadoComAcento2NResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSConcatenadoComAcento2NResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSCONCATENADOCOMACENTO2NRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoComAcento2NResponse");
    
    
    /**
     * Gets the "EnviaSMSConcatenadoComAcento2NResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse getEnviaSMSConcatenadoComAcento2NResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSConcatenadoComAcento2NResponse" element
     */
    public void setEnviaSMSConcatenadoComAcento2NResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse enviaSMSConcatenadoComAcento2NResponse)
    {
        generatedSetterHelperImpl(enviaSMSConcatenadoComAcento2NResponse, ENVIASMSCONCATENADOCOMACENTO2NRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSConcatenadoComAcento2NResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse addNewEnviaSMSConcatenadoComAcento2NResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse)get_store().add_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSConcatenadoComAcento2NResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSConcatenadoComAcento2NResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcento2NResponseDocument.EnviaSMSConcatenadoComAcento2NResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSConcatenadoComAcento2NResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSCONCATENADOCOMACENTO2NRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoComAcento2NResult");
        
        
        /**
         * Gets the "EnviaSMSConcatenadoComAcento2NResult" element
         */
        public java.lang.String getEnviaSMSConcatenadoComAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSConcatenadoComAcento2NResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSConcatenadoComAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSConcatenadoComAcento2NResult" element
         */
        public boolean isSetEnviaSMSConcatenadoComAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSConcatenadoComAcento2NResult" element
         */
        public void setEnviaSMSConcatenadoComAcento2NResult(java.lang.String enviaSMSConcatenadoComAcento2NResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0);
                }
                target.setStringValue(enviaSMSConcatenadoComAcento2NResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSConcatenadoComAcento2NResult" element
         */
        public void xsetEnviaSMSConcatenadoComAcento2NResult(org.apache.xmlbeans.XmlString enviaSMSConcatenadoComAcento2NResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0);
                }
                target.set(enviaSMSConcatenadoComAcento2NResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSConcatenadoComAcento2NResult" element
         */
        public void unsetEnviaSMSConcatenadoComAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSCONCATENADOCOMACENTO2NRESULT$0, 0);
            }
        }
    }
}
