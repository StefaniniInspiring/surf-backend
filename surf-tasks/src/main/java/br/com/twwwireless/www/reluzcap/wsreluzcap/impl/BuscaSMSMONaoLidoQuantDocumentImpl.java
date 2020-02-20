/*
 * An XML document type.
 * Localname: BuscaSMSMONaoLidoQuant
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one BuscaSMSMONaoLidoQuant(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class BuscaSMSMONaoLidoQuantDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuscaSMSMONaoLidoQuantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSCASMSMONAOLIDOQUANT$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "BuscaSMSMONaoLidoQuant");
    
    
    /**
     * Gets the "BuscaSMSMONaoLidoQuant" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant getBuscaSMSMONaoLidoQuant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant)get_store().find_element_user(BUSCASMSMONAOLIDOQUANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BuscaSMSMONaoLidoQuant" element
     */
    public void setBuscaSMSMONaoLidoQuant(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant buscaSMSMONaoLidoQuant)
    {
        generatedSetterHelperImpl(buscaSMSMONaoLidoQuant, BUSCASMSMONAOLIDOQUANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BuscaSMSMONaoLidoQuant" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant addNewBuscaSMSMONaoLidoQuant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant)get_store().add_element_user(BUSCASMSMONAOLIDOQUANT$0);
            return target;
        }
    }
    /**
     * An XML BuscaSMSMONaoLidoQuant(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class BuscaSMSMONaoLidoQuantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSMONaoLidoQuantDocument.BuscaSMSMONaoLidoQuant
    {
        private static final long serialVersionUID = 1L;
        
        public BuscaSMSMONaoLidoQuantImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Senha");
        private static final javax.xml.namespace.QName QUANT$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Quant");
        
        
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
         * Gets the "Quant" element
         */
        public int getQuant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANT$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Quant" element
         */
        public org.apache.xmlbeans.XmlInt xgetQuant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Quant" element
         */
        public void setQuant(int quant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANT$4);
                }
                target.setIntValue(quant);
            }
        }
        
        /**
         * Sets (as xml) the "Quant" element
         */
        public void xsetQuant(org.apache.xmlbeans.XmlInt quant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANT$4);
                }
                target.set(quant);
            }
        }
    }
}
