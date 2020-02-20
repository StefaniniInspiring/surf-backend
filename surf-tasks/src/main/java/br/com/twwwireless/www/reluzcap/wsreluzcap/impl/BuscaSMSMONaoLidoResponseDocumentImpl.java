/*
 * An XML document type.
 * Localname: BuscaSMSMONaoLidoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSMONaoLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSMONaoLidoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSMONaoLidoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSMONAOLIDORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSMONaoLidoResponse");
    
    
    /**
     * Gets the "BuscaSMSMONaoLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse getBuscaSMSMONaoLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse)get_store().find_element_user(BUSCASMSMONAOLIDORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSMONaoLidoResponse" element
     */
    public void setBuscaSMSMONaoLidoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse buscaSMSMONaoLidoResponse)
    {
        generatedSetterHelperImpl(buscaSMSMONaoLidoResponse, BUSCASMSMONAOLIDORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSMONaoLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse addNewBuscaSMSMONaoLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse)get_store().add_element_user(BUSCASMSMONAOLIDORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSMONaoLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSMONaoLidoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSMONaoLidoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSCASMSMONAOLIDORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSMONaoLidoResult");
        
        
        /**
         * Gets the "BuscaSMSMONaoLidoResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult getBuscaSMSMONaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult)get_store().find_element_user(BUSCASMSMONAOLIDORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BuscaSMSMONaoLidoResult" element
         */
        public boolean isSetBuscaSMSMONaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSCASMSMONAOLIDORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "BuscaSMSMONaoLidoResult" element
         */
        public void setBuscaSMSMONaoLidoResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult buscaSMSMONaoLidoResult)
        {
            generatedSetterHelperImpl(buscaSMSMONaoLidoResult, BUSCASMSMONAOLIDORESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BuscaSMSMONaoLidoResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult addNewBuscaSMSMONaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult)get_store().add_element_user(BUSCASMSMONAOLIDORESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "BuscaSMSMONaoLidoResult" element
         */
        public void unsetBuscaSMSMONaoLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSCASMSMONAOLIDORESULT$0, 0);
            }
        }
        /**
         * An XML BuscaSMSMONaoLidoResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class BuscaSMSMONaoLidoResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoResponseDocument.BuscaSMSMONaoLidoResponse.BuscaSMSMONaoLidoResult
        {
            private static final long serialVersionUID = 1L;
            
            public BuscaSMSMONaoLidoResultImpl(org.apache.xmlbeans.SchemaType sType)
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
