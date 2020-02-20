/*
 * XML Type:  MONLIDOQUANT
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * An XML MONLIDOQUANT(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
 *
 * This is a complex type.
 */
public class MONLIDOQUANTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT
{
    private static final long serialVersionUID = 1L;
    
    public MONLIDOQUANTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTNL$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "QUANTNL");
    private static final javax.xml.namespace.QName DS$2 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DS");
    
    
    /**
     * Gets the "QUANTNL" element
     */
    public int getQUANTNL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTNL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "QUANTNL" element
     */
    public org.apache.xmlbeans.XmlInt xgetQUANTNL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTNL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QUANTNL" element
     */
    public void setQUANTNL(int quantnl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTNL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTNL$0);
            }
            target.setIntValue(quantnl);
        }
    }
    
    /**
     * Sets (as xml) the "QUANTNL" element
     */
    public void xsetQUANTNL(org.apache.xmlbeans.XmlInt quantnl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTNL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTNL$0);
            }
            target.set(quantnl);
        }
    }
    
    /**
     * Gets the "DS" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS getDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS)get_store().find_element_user(DS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DS" element
     */
    public boolean isSetDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DS$2) != 0;
        }
    }
    
    /**
     * Sets the "DS" element
     */
    public void setDS(br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS ds)
    {
        generatedSetterHelperImpl(ds, DS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS addNewDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS)get_store().add_element_user(DS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DS" element
     */
    public void unsetDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DS$2, 0);
        }
    }
    /**
     * An XML DS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class DSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT.DS
    {
        private static final long serialVersionUID = 1L;
        
        public DSImpl(org.apache.xmlbeans.SchemaType sType)
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
