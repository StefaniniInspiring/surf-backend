/*
 * An XML document type.
 * Localname: BuscaSMSAgenda
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSAgenda(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSAgendaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSAgendaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSAGENDA$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSAgenda");
    
    
    /**
     * Gets the "BuscaSMSAgenda" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda getBuscaSMSAgenda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda)get_store().find_element_user(BUSCASMSAGENDA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSAgenda" element
     */
    public void setBuscaSMSAgenda(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda buscaSMSAgenda)
    {
        generatedSetterHelperImpl(buscaSMSAgenda, BUSCASMSAGENDA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSAgenda" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda addNewBuscaSMSAgenda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda)get_store().add_element_user(BUSCASMSAGENDA$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSAgenda(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSAgendaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDocument.BuscaSMSAgenda
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSAgendaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Senha");
        private static final javax.xml.namespace.QName SEUNUM$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SeuNum");
        
        
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
         * Gets the "SeuNum" element
         */
        public java.lang.String getSeuNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SeuNum" element
         */
        public org.apache.xmlbeans.XmlString xgetSeuNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "SeuNum" element
         */
        public boolean isSetSeuNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEUNUM$4) != 0;
            }
        }
        
        /**
         * Sets the "SeuNum" element
         */
        public void setSeuNum(java.lang.String seuNum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEUNUM$4);
                }
                target.setStringValue(seuNum);
            }
        }
        
        /**
         * Sets (as xml) the "SeuNum" element
         */
        public void xsetSeuNum(org.apache.xmlbeans.XmlString seuNum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEUNUM$4);
                }
                target.set(seuNum);
            }
        }
        
        /**
         * Unsets the "SeuNum" element
         */
        public void unsetSeuNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEUNUM$4, 0);
            }
        }
    }
}
