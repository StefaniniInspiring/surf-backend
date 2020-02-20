/*
 * An XML document type.
 * Localname: EnviaSMSConcatenadoComAcentoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSConcatenadoComAcentoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSConcatenadoComAcentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSConcatenadoComAcentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSCONCATENADOCOMACENTORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoComAcentoResponse");
    
    
    /**
     * Gets the "EnviaSMSConcatenadoComAcentoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse getEnviaSMSConcatenadoComAcentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSConcatenadoComAcentoResponse" element
     */
    public void setEnviaSMSConcatenadoComAcentoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse enviaSMSConcatenadoComAcentoResponse)
    {
        generatedSetterHelperImpl(enviaSMSConcatenadoComAcentoResponse, ENVIASMSCONCATENADOCOMACENTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSConcatenadoComAcentoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse addNewEnviaSMSConcatenadoComAcentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse)get_store().add_element_user(ENVIASMSCONCATENADOCOMACENTORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSConcatenadoComAcentoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSConcatenadoComAcentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSConcatenadoComAcentoResponseDocument.EnviaSMSConcatenadoComAcentoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSConcatenadoComAcentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSCONCATENADOCOMACENTORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSConcatenadoComAcentoResult");
        
        
        /**
         * Gets the "EnviaSMSConcatenadoComAcentoResult" element
         */
        public java.lang.String getEnviaSMSConcatenadoComAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSConcatenadoComAcentoResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSConcatenadoComAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTORESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSConcatenadoComAcentoResult" element
         */
        public boolean isSetEnviaSMSConcatenadoComAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSCONCATENADOCOMACENTORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSConcatenadoComAcentoResult" element
         */
        public void setEnviaSMSConcatenadoComAcentoResult(java.lang.String enviaSMSConcatenadoComAcentoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSCONCATENADOCOMACENTORESULT$0);
                }
                target.setStringValue(enviaSMSConcatenadoComAcentoResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSConcatenadoComAcentoResult" element
         */
        public void xsetEnviaSMSConcatenadoComAcentoResult(org.apache.xmlbeans.XmlString enviaSMSConcatenadoComAcentoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSCONCATENADOCOMACENTORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSCONCATENADOCOMACENTORESULT$0);
                }
                target.set(enviaSMSConcatenadoComAcentoResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSConcatenadoComAcentoResult" element
         */
        public void unsetEnviaSMSConcatenadoComAcentoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSCONCATENADOCOMACENTORESULT$0, 0);
            }
        }
    }
}
