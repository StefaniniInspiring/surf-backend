/*
 * An XML document type.
 * Localname: StatusSMS2SNResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one StatusSMS2SNResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class StatusSMS2SNResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusSMS2SNResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSSMS2SNRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMS2SNResponse");
    
    
    /**
     * Gets the "StatusSMS2SNResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse getStatusSMS2SNResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse)get_store().find_element_user(STATUSSMS2SNRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusSMS2SNResponse" element
     */
    public void setStatusSMS2SNResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse statusSMS2SNResponse)
    {
        generatedSetterHelperImpl(statusSMS2SNResponse, STATUSSMS2SNRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusSMS2SNResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse addNewStatusSMS2SNResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse)get_store().add_element_user(STATUSSMS2SNRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StatusSMS2SNResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class StatusSMS2SNResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StatusSMS2SNResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUSSMS2SNRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "StatusSMS2SNResult");
        
        
        /**
         * Gets the "StatusSMS2SNResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult getStatusSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult)get_store().find_element_user(STATUSSMS2SNRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StatusSMS2SNResult" element
         */
        public boolean isSetStatusSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSSMS2SNRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "StatusSMS2SNResult" element
         */
        public void setStatusSMS2SNResult(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult statusSMS2SNResult)
        {
            generatedSetterHelperImpl(statusSMS2SNResult, STATUSSMS2SNRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StatusSMS2SNResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult addNewStatusSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult)get_store().add_element_user(STATUSSMS2SNRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "StatusSMS2SNResult" element
         */
        public void unsetStatusSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSSMS2SNRESULT$0, 0);
            }
        }
        /**
         * An XML StatusSMS2SNResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class StatusSMS2SNResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult
        {
            private static final long serialVersionUID = 1L;
            
            public StatusSMS2SNResultImpl(org.apache.xmlbeans.SchemaType sType)
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
