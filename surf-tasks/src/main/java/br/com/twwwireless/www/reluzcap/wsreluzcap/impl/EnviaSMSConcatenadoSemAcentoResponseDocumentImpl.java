/*
 * An XML document type.
 * Localname: EnviaSMSConcatenadoSemAcentoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSConcatenadoSemAcentoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSConcatenadoSemAcentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSConcatenadoSemAcentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSCONCATENADOSEMACENTORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoSemAcentoResponse");
    
    
    /**
     * Gets the "EnviaSMSConcatenadoSemAcentoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse getEnviaSMSConcatenadoSemAcentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSConcatenadoSemAcentoResponse" element
     */
    public void setEnviaSMSConcatenadoSemAcentoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse enviaSMSConcatenadoSemAcentoResponse)
    {
        generatedSetterHelperImpl(enviaSMSConcatenadoSemAcentoResponse, ENVIASMSCONCATENADOSEMACENTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSConcatenadoSemAcentoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse addNewEnviaSMSConcatenadoSemAcentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse)get_store().add_element_user(ENVIASMSCONCATENADOSEMACENTORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSConcatenadoSemAcentoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSConcatenadoSemAcentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoSemAcentoResponseDocument.EnviaSMSConcatenadoSemAcentoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSConcatenadoSemAcentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSCONCATENADOSEMACENTORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoSemAcentoResult");
        
        
        /**
         * Gets the "EnviaSMSConcatenadoSemAcentoResult" element
         */
        public java.lang.String getEnviaSMSConcatenadoSemAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSConcatenadoSemAcentoResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSConcatenadoSemAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTORESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSConcatenadoSemAcentoResult" element
         */
        public boolean isSetEnviaSMSConcatenadoSemAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSCONCATENADOSEMACENTORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSConcatenadoSemAcentoResult" element
         */
        public void setEnviaSMSConcatenadoSemAcentoResult(java.lang.String enviaSMSConcatenadoSemAcentoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSCONCATENADOSEMACENTORESULT$0);
                }
                target.setStringValue(enviaSMSConcatenadoSemAcentoResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSConcatenadoSemAcentoResult" element
         */
        public void xsetEnviaSMSConcatenadoSemAcentoResult(org.apache.xmlbeans.XmlString enviaSMSConcatenadoSemAcentoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOSEMACENTORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSCONCATENADOSEMACENTORESULT$0);
                }
                target.set(enviaSMSConcatenadoSemAcentoResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSConcatenadoSemAcentoResult" element
         */
        public void unsetEnviaSMSConcatenadoSemAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSCONCATENADOSEMACENTORESULT$0, 0);
            }
        }
    }
}
