/*
 * An XML document type.
 * Localname: BuscaSMSAgendaResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSAgendaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSAgendaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSAgendaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSAGENDARESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSAgendaResponse");
    
    
    /**
     * Gets the "BuscaSMSAgendaResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse getBuscaSMSAgendaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse)get_store().find_element_user(BUSCASMSAGENDARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSAgendaResponse" element
     */
    public void setBuscaSMSAgendaResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse buscaSMSAgendaResponse)
    {
        generatedSetterHelperImpl(buscaSMSAgendaResponse, BUSCASMSAGENDARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSAgendaResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse addNewBuscaSMSAgendaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse)get_store().add_element_user(BUSCASMSAGENDARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSAgendaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSAgendaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSAgendaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSCASMSAGENDARESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSAgendaResult");
        
        
        /**
         * Gets the "BuscaSMSAgendaResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult getBuscaSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult)get_store().find_element_user(BUSCASMSAGENDARESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BuscaSMSAgendaResult" element
         */
        public boolean isSetBuscaSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSCASMSAGENDARESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "BuscaSMSAgendaResult" element
         */
        public void setBuscaSMSAgendaResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult buscaSMSAgendaResult)
        {
            generatedSetterHelperImpl(buscaSMSAgendaResult, BUSCASMSAGENDARESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "BuscaSMSAgendaResult" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult addNewBuscaSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult)get_store().add_element_user(BUSCASMSAGENDARESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "BuscaSMSAgendaResult" element
         */
        public void unsetBuscaSMSAgendaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSCASMSAGENDARESULT$0, 0);
            }
        }
        /**
         * An XML BuscaSMSAgendaResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class BuscaSMSAgendaResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult
        {
            private static final long serialVersionUID = 1L;
            
            public BuscaSMSAgendaResultImpl(org.apache.xmlbeans.SchemaType sType)
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
