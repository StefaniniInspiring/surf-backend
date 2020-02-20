/*
 * An XML document type.
 * Localname: StatusSMSDataSetResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one StatusSMSDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class StatusSMSDataSetResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusSMSDataSetResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSSMSDATASETRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMSDataSetResponse");
    
    
    /**
     * Gets the "StatusSMSDataSetResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse getStatusSMSDataSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse)get_store().find_element_user(STATUSSMSDATASETRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusSMSDataSetResponse" element
     */
    public void setStatusSMSDataSetResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse statusSMSDataSetResponse)
    {
        generatedSetterHelperImpl(statusSMSDataSetResponse, STATUSSMSDATASETRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusSMSDataSetResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse addNewStatusSMSDataSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse)get_store().add_element_user(STATUSSMSDATASETRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StatusSMSDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class StatusSMSDataSetResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StatusSMSDataSetResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUSSMSDATASETRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMSDataSetResult");
        
        
        /**
         * Gets the "StatusSMSDataSetResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult getStatusSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult)get_store().find_element_user(STATUSSMSDATASETRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StatusSMSDataSetResult" element
         */
        public boolean isSetStatusSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSSMSDATASETRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "StatusSMSDataSetResult" element
         */
        public void setStatusSMSDataSetResult(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult statusSMSDataSetResult)
        {
            generatedSetterHelperImpl(statusSMSDataSetResult, STATUSSMSDATASETRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StatusSMSDataSetResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult addNewStatusSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult)get_store().add_element_user(STATUSSMSDATASETRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "StatusSMSDataSetResult" element
         */
        public void unsetStatusSMSDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSSMSDATASETRESULT$0, 0);
            }
        }
        /**
         * An XML StatusSMSDataSetResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class StatusSMSDataSetResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetResponseDocument.StatusSMSDataSetResponse.StatusSMSDataSetResult
        {
            private static final long serialVersionUID = 1L;
            
            public StatusSMSDataSetResultImpl(org.apache.xmlbeans.SchemaType sType)
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
