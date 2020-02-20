/*
 * An XML document type.
 * Localname: EnviaSMSTIMResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSTIMResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSTIMResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSTIMResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSTIMRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSTIMResponse");
    
    
    /**
     * Gets the "EnviaSMSTIMResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse getEnviaSMSTIMResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse)get_store().find_element_user(ENVIASMSTIMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSTIMResponse" element
     */
    public void setEnviaSMSTIMResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse enviaSMSTIMResponse)
    {
        generatedSetterHelperImpl(enviaSMSTIMResponse, ENVIASMSTIMRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSTIMResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse addNewEnviaSMSTIMResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse)get_store().add_element_user(ENVIASMSTIMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSTIMResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSTIMResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSTIMResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSTIMRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSTIMResult");
        
        
        /**
         * Gets the "EnviaSMSTIMResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult getEnviaSMSTIMResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult)get_store().find_element_user(ENVIASMSTIMRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSTIMResult" element
         */
        public boolean isSetEnviaSMSTIMResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSTIMRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSTIMResult" element
         */
        public void setEnviaSMSTIMResult(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult enviaSMSTIMResult)
        {
            generatedSetterHelperImpl(enviaSMSTIMResult, ENVIASMSTIMRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EnviaSMSTIMResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult addNewEnviaSMSTIMResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult)get_store().add_element_user(ENVIASMSTIMRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "EnviaSMSTIMResult" element
         */
        public void unsetEnviaSMSTIMResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSTIMRESULT$0, 0);
            }
        }
        /**
         * An XML EnviaSMSTIMResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class EnviaSMSTIMResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMResponseDocument.EnviaSMSTIMResponse.EnviaSMSTIMResult
        {
            private static final long serialVersionUID = 1L;
            
            public EnviaSMSTIMResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
