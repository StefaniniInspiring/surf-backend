/*
 * An XML document type.
 * Localname: StatusSMSResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one StatusSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class StatusSMSResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusSMSResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSSMSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMSResponse");
    
    
    /**
     * Gets the "StatusSMSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse getStatusSMSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse)get_store().find_element_user(STATUSSMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusSMSResponse" element
     */
    public void setStatusSMSResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse statusSMSResponse)
    {
        generatedSetterHelperImpl(statusSMSResponse, STATUSSMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusSMSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse addNewStatusSMSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse)get_store().add_element_user(STATUSSMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StatusSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class StatusSMSResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StatusSMSResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUSSMSRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMSResult");
        
        
        /**
         * Gets the "StatusSMSResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult getStatusSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult)get_store().find_element_user(STATUSSMSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StatusSMSResult" element
         */
        public boolean isSetStatusSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSSMSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "StatusSMSResult" element
         */
        public void setStatusSMSResult(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult statusSMSResult)
        {
            generatedSetterHelperImpl(statusSMSResult, STATUSSMSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StatusSMSResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult addNewStatusSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult)get_store().add_element_user(STATUSSMSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "StatusSMSResult" element
         */
        public void unsetStatusSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSSMSRESULT$0, 0);
            }
        }
        /**
         * An XML StatusSMSResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class StatusSMSResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSResponseDocument.StatusSMSResponse.StatusSMSResult
        {
            private static final long serialVersionUID = 1L;
            
            public StatusSMSResultImpl(org.apache.xmlbeans.SchemaType sType)
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
