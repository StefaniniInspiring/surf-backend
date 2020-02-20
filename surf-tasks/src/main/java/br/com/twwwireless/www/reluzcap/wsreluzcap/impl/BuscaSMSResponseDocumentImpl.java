/*
 * An XML document type.
 * Localname: BuscaSMSResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSResponse");
    
    
    /**
     * Gets the "BuscaSMSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse getBuscaSMSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse)get_store().find_element_user(BUSCASMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSResponse" element
     */
    public void setBuscaSMSResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse buscaSMSResponse)
    {
        generatedSetterHelperImpl(buscaSMSResponse, BUSCASMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse addNewBuscaSMSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse)get_store().add_element_user(BUSCASMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSCASMSRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSResult");
        
        
        /**
         * Gets the "BuscaSMSResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult getBuscaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult)get_store().find_element_user(BUSCASMSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BuscaSMSResult" element
         */
        public boolean isSetBuscaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSCASMSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "BuscaSMSResult" element
         */
        public void setBuscaSMSResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult buscaSMSResult)
        {
            generatedSetterHelperImpl(buscaSMSResult, BUSCASMSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BuscaSMSResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult addNewBuscaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult)get_store().add_element_user(BUSCASMSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "BuscaSMSResult" element
         */
        public void unsetBuscaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSCASMSRESULT$0, 0);
            }
        }
        /**
         * An XML BuscaSMSResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class BuscaSMSResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult
        {
            private static final long serialVersionUID = 1L;
            
            public BuscaSMSResultImpl(org.apache.xmlbeans.SchemaType sType)
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
