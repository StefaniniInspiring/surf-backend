/*
 * An XML document type.
 * Localname: EnviaSMSConcatenadoSemAcento2NResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSConcatenadoSemAcento2NResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSConcatenadoSemAcento2NResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSConcatenadoSemAcento2NResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSCONCATENADOSEMACENTO2NRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoSemAcento2NResponse");
    
    
    /**
     * Gets the "EnviaSMSConcatenadoSemAcento2NResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse getEnviaSMSConcatenadoSemAcento2NResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSConcatenadoSemAcento2NResponse" element
     */
    public void setEnviaSMSConcatenadoSemAcento2NResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse enviaSMSConcatenadoSemAcento2NResponse)
    {
        generatedSetterHelperImpl(enviaSMSConcatenadoSemAcento2NResponse, ENVIASMSCONCATENADOSEMACENTO2NRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSConcatenadoSemAcento2NResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse addNewEnviaSMSConcatenadoSemAcento2NResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse)get_store().add_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSConcatenadoSemAcento2NResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSConcatenadoSemAcento2NResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcento2NResponseDocument.EnviaSMSConcatenadoSemAcento2NResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSConcatenadoSemAcento2NResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSCONCATENADOSEMACENTO2NRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoSemAcento2NResult");
        
        
        /**
         * Gets the "EnviaSMSConcatenadoSemAcento2NResult" element
         */
        public java.lang.String getEnviaSMSConcatenadoSemAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSConcatenadoSemAcento2NResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSConcatenadoSemAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSConcatenadoSemAcento2NResult" element
         */
        public boolean isSetEnviaSMSConcatenadoSemAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSConcatenadoSemAcento2NResult" element
         */
        public void setEnviaSMSConcatenadoSemAcento2NResult(java.lang.String enviaSMSConcatenadoSemAcento2NResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0);
                }
                target.setStringValue(enviaSMSConcatenadoSemAcento2NResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSConcatenadoSemAcento2NResult" element
         */
        public void xsetEnviaSMSConcatenadoSemAcento2NResult(org.apache.xmlbeans.XmlString enviaSMSConcatenadoSemAcento2NResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0);
                }
                target.set(enviaSMSConcatenadoSemAcento2NResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSConcatenadoSemAcento2NResult" element
         */
        public void unsetEnviaSMSConcatenadoSemAcento2NResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSCONCATENADOSEMACENTO2NRESULT$0, 0);
            }
        }
    }
}
