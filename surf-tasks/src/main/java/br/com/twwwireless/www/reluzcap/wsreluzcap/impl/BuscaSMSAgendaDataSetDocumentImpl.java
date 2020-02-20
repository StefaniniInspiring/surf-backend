/*
 * An XML document type.
 * Localname: BuscaSMSAgendaDataSet
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSAgendaDataSet(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSAgendaDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSAgendaDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSAGENDADATASET$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSAgendaDataSet");
    
    
    /**
     * Gets the "BuscaSMSAgendaDataSet" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet getBuscaSMSAgendaDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet)get_store().find_element_user(BUSCASMSAGENDADATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSAgendaDataSet" element
     */
    public void setBuscaSMSAgendaDataSet(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet buscaSMSAgendaDataSet)
    {
        generatedSetterHelperImpl(buscaSMSAgendaDataSet, BUSCASMSAGENDADATASET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSAgendaDataSet" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet addNewBuscaSMSAgendaDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet)get_store().add_element_user(BUSCASMSAGENDADATASET$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSAgendaDataSet(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSAgendaDataSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSAgendaDataSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Senha");
        private static final javax.xml.namespace.QName DS$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DS");
        
        
        /**
         * Gets the "NumUsu" element
         */
        public java.lang.String getNumUsu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMUSU$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NumUsu" element
         */
        public org.apache.xmlbeans.XmlString xgetNumUsu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMUSU$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "NumUsu" element
         */
        public boolean isSetNumUsu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMUSU$0) != 0;
            }
        }
        
        /**
         * Sets the "NumUsu" element
         */
        public void setNumUsu(java.lang.String numUsu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMUSU$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMUSU$0);
                }
                target.setStringValue(numUsu);
            }
        }
        
        /**
         * Sets (as xml) the "NumUsu" element
         */
        public void xsetNumUsu(org.apache.xmlbeans.XmlString numUsu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMUSU$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMUSU$0);
                }
                target.set(numUsu);
            }
        }
        
        /**
         * Unsets the "NumUsu" element
         */
        public void unsetNumUsu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMUSU$0, 0);
            }
        }
        
        /**
         * Gets the "Senha" element
         */
        public java.lang.String getSenha()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Senha" element
         */
        public org.apache.xmlbeans.XmlString xgetSenha()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Senha" element
         */
        public boolean isSetSenha()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENHA$2) != 0;
            }
        }
        
        /**
         * Sets the "Senha" element
         */
        public void setSenha(java.lang.String senha)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHA$2);
                }
                target.setStringValue(senha);
            }
        }
        
        /**
         * Sets (as xml) the "Senha" element
         */
        public void xsetSenha(org.apache.xmlbeans.XmlString senha)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHA$2);
                }
                target.set(senha);
            }
        }
        
        /**
         * Unsets the "Senha" element
         */
        public void unsetSenha()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENHA$2, 0);
            }
        }
        
        /**
         * Gets the "DS" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS getDS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS)get_store().find_element_user(DS$4, 0);
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
                return get_store().count_elements(DS$4) != 0;
            }
        }
        
        /**
         * Sets the "DS" element
         */
        public void setDS(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS ds)
        {
            generatedSetterHelperImpl(ds, DS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DS" element
         */
        public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS addNewDS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS target = null;
                target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS)get_store().add_element_user(DS$4);
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
                get_store().remove_element(DS$4, 0);
            }
        }
        /**
         * An XML DS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public static class DSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetDocument.BuscaSMSAgendaDataSet.DS
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
}
