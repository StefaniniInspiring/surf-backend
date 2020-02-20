/*
 * An XML document type.
 * Localname: DataSet
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one DataSet(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class DataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DataSet");
    
    
    /**
     * Gets the "DataSet" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet getDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet)get_store().find_element_user(DATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DataSet" element
     */
    public boolean isNilDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet)get_store().find_element_user(DATASET$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DataSet" element
     */
    public void setDataSet(br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet dataSet)
    {
        generatedSetterHelperImpl(dataSet, DATASET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataSet" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet)get_store().add_element_user(DATASET$0);
            return target;
        }
    }
    
    /**
     * Nils the "DataSet" element
     */
    public void setNilDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet)get_store().find_element_user(DATASET$0, 0);
            if (target == null)
            {
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet)get_store().add_element_user(DATASET$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML DataSet(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class DataSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.DataSetDocument.DataSet
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetImpl(org.apache.xmlbeans.SchemaType sType)
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
