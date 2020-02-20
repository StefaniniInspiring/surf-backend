/*
 * An XML document type.
 * Localname: BuscaSMSMOResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSMOResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSMOResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSMOResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSMORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSMOResponse");
    
    
    /**
     * Gets the "BuscaSMSMOResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse getBuscaSMSMOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse)get_store().find_element_user(BUSCASMSMORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSMOResponse" element
     */
    public void setBuscaSMSMOResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse buscaSMSMOResponse)
    {
        generatedSetterHelperImpl(buscaSMSMOResponse, BUSCASMSMORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSMOResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse addNewBuscaSMSMOResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse)get_store().add_element_user(BUSCASMSMORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSMOResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSMOResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSMOResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSCASMSMORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSMOResult");
        
        
        /**
         * Gets the "BuscaSMSMOResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult getBuscaSMSMOResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult)get_store().find_element_user(BUSCASMSMORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BuscaSMSMOResult" element
         */
        public boolean isSetBuscaSMSMOResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSCASMSMORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "BuscaSMSMOResult" element
         */
        public void setBuscaSMSMOResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult buscaSMSMOResult)
        {
            generatedSetterHelperImpl(buscaSMSMOResult, BUSCASMSMORESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BuscaSMSMOResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult addNewBuscaSMSMOResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult)get_store().add_element_user(BUSCASMSMORESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "BuscaSMSMOResult" element
         */
        public void unsetBuscaSMSMOResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSCASMSMORESULT$0, 0);
            }
        }
        /**
         * An XML BuscaSMSMOResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class BuscaSMSMOResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMOResponseDocument.BuscaSMSMOResponse.BuscaSMSMOResult
        {
            private static final long serialVersionUID = 1L;
            
            public BuscaSMSMOResultImpl(org.apache.xmlbeans.SchemaType sType)
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
