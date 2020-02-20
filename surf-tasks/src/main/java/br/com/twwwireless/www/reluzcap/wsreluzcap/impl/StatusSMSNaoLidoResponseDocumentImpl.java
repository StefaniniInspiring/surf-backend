/*
 * An XML document type.
 * Localname: StatusSMSNaoLidoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one StatusSMSNaoLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class StatusSMSNaoLidoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusSMSNaoLidoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSSMSNAOLIDORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMSNaoLidoResponse");
    
    
    /**
     * Gets the "StatusSMSNaoLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse getStatusSMSNaoLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse)get_store().find_element_user(STATUSSMSNAOLIDORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusSMSNaoLidoResponse" element
     */
    public void setStatusSMSNaoLidoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse statusSMSNaoLidoResponse)
    {
        generatedSetterHelperImpl(statusSMSNaoLidoResponse, STATUSSMSNAOLIDORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusSMSNaoLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse addNewStatusSMSNaoLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse)get_store().add_element_user(STATUSSMSNAOLIDORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StatusSMSNaoLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class StatusSMSNaoLidoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StatusSMSNaoLidoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUSSMSNAOLIDORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMSNaoLidoResult");
        
        
        /**
         * Gets the "StatusSMSNaoLidoResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult getStatusSMSNaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult)get_store().find_element_user(STATUSSMSNAOLIDORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StatusSMSNaoLidoResult" element
         */
        public boolean isSetStatusSMSNaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSSMSNAOLIDORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "StatusSMSNaoLidoResult" element
         */
        public void setStatusSMSNaoLidoResult(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult statusSMSNaoLidoResult)
        {
            generatedSetterHelperImpl(statusSMSNaoLidoResult, STATUSSMSNAOLIDORESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StatusSMSNaoLidoResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult addNewStatusSMSNaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult)get_store().add_element_user(STATUSSMSNAOLIDORESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "StatusSMSNaoLidoResult" element
         */
        public void unsetStatusSMSNaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSSMSNAOLIDORESULT$0, 0);
            }
        }
        /**
         * An XML StatusSMSNaoLidoResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class StatusSMSNaoLidoResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSNaoLidoResponseDocument.StatusSMSNaoLidoResponse.StatusSMSNaoLidoResult
        {
            private static final long serialVersionUID = 1L;
            
            public StatusSMSNaoLidoResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SCHEMA$0 = 
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "schema");
            
            
            /**
             * Gets the "schema" element
             */
            public org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema target = null;
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema)get_store().find_element_user(SCHEMA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "schema" element
             */
            public void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema)
            {
                generatedSetterHelperImpl(schema, SCHEMA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "schema" element
             */
            public org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema target = null;
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema)get_store().add_element_user(SCHEMA$0);
                    return target;
                }
            }
        }
    }
}
