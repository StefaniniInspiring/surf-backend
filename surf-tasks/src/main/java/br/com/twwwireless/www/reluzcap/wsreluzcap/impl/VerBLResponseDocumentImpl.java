/*
 * An XML document type.
 * Localname: VerBLResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one VerBLResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class VerBLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerBLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERBLRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VerBLResponse");
    
    
    /**
     * Gets the "VerBLResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse getVerBLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse)get_store().find_element_user(VERBLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerBLResponse" element
     */
    public void setVerBLResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse verBLResponse)
    {
        generatedSetterHelperImpl(verBLResponse, VERBLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerBLResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse addNewVerBLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse)get_store().add_element_user(VERBLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML VerBLResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class VerBLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public VerBLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERBLRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VerBLResult");
        
        
        /**
         * Gets the "VerBLResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult getVerBLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult)get_store().find_element_user(VERBLRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "VerBLResult" element
         */
        public boolean isSetVerBLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERBLRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "VerBLResult" element
         */
        public void setVerBLResult(br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult verBLResult)
        {
            generatedSetterHelperImpl(verBLResult, VERBLRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "VerBLResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult addNewVerBLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult)get_store().add_element_user(VERBLRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "VerBLResult" element
         */
        public void unsetVerBLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERBLRESULT$0, 0);
            }
        }
        /**
         * An XML VerBLResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class VerBLResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerBLResponseDocument.VerBLResponse.VerBLResult
        {
            private static final long serialVersionUID = 1L;
            
            public VerBLResultImpl(org.apache.xmlbeans.SchemaType sType)
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
