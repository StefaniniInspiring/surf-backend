/*
 * An XML document type.
 * Localname: BuscaSMSAgendaDataSetResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSAgendaDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSAgendaDataSetResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSAgendaDataSetResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSAGENDADATASETRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSAgendaDataSetResponse");
    
    
    /**
     * Gets the "BuscaSMSAgendaDataSetResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse getBuscaSMSAgendaDataSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse)get_store().find_element_user(BUSCASMSAGENDADATASETRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSAgendaDataSetResponse" element
     */
    public void setBuscaSMSAgendaDataSetResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse buscaSMSAgendaDataSetResponse)
    {
        generatedSetterHelperImpl(buscaSMSAgendaDataSetResponse, BUSCASMSAGENDADATASETRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSAgendaDataSetResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse addNewBuscaSMSAgendaDataSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse)get_store().add_element_user(BUSCASMSAGENDADATASETRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSAgendaDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSAgendaDataSetResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSAgendaDataSetResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSCASMSAGENDADATASETRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSAgendaDataSetResult");
        
        
        /**
         * Gets the "BuscaSMSAgendaDataSetResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult getBuscaSMSAgendaDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult)get_store().find_element_user(BUSCASMSAGENDADATASETRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BuscaSMSAgendaDataSetResult" element
         */
        public boolean isSetBuscaSMSAgendaDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSCASMSAGENDADATASETRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "BuscaSMSAgendaDataSetResult" element
         */
        public void setBuscaSMSAgendaDataSetResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult buscaSMSAgendaDataSetResult)
        {
            generatedSetterHelperImpl(buscaSMSAgendaDataSetResult, BUSCASMSAGENDADATASETRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BuscaSMSAgendaDataSetResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult addNewBuscaSMSAgendaDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult)get_store().add_element_user(BUSCASMSAGENDADATASETRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "BuscaSMSAgendaDataSetResult" element
         */
        public void unsetBuscaSMSAgendaDataSetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSCASMSAGENDADATASETRESULT$0, 0);
            }
        }
        /**
         * An XML BuscaSMSAgendaDataSetResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class BuscaSMSAgendaDataSetResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult
        {
            private static final long serialVersionUID = 1L;
            
            public BuscaSMSAgendaDataSetResultImpl(org.apache.xmlbeans.SchemaType sType)
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
