/*
 * An XML document type.
 * Localname: AlteraSenha
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one AlteraSenha(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class AlteraSenhaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlteraSenhaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERASENHA$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "AlteraSenha");
    
    
    /**
     * Gets the "AlteraSenha" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha getAlteraSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha)get_store().find_element_user(ALTERASENHA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AlteraSenha" element
     */
    public void setAlteraSenha(br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha alteraSenha)
    {
        generatedSetterHelperImpl(alteraSenha, ALTERASENHA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AlteraSenha" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha addNewAlteraSenha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha)get_store().add_element_user(ALTERASENHA$0);
            return target;
        }
    }
    /**
     * An XML AlteraSenha(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class AlteraSenhaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaDocument.AlteraSenha
    {
        private static final long serialVersionUID = 1L;
        
        public AlteraSenhaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHAANTIGA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SenhaAntiga");
        private static final javax.xml.namespace.QName SENHANOVA$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SenhaNova");
        
        
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
         * Gets the "SenhaAntiga" element
         */
        public java.lang.String getSenhaAntiga()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHAANTIGA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SenhaAntiga" element
         */
        public org.apache.xmlbeans.XmlString xgetSenhaAntiga()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHAANTIGA$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "SenhaAntiga" element
         */
        public boolean isSetSenhaAntiga()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENHAANTIGA$2) != 0;
            }
        }
        
        /**
         * Sets the "SenhaAntiga" element
         */
        public void setSenhaAntiga(java.lang.String senhaAntiga)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHAANTIGA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHAANTIGA$2);
                }
                target.setStringValue(senhaAntiga);
            }
        }
        
        /**
         * Sets (as xml) the "SenhaAntiga" element
         */
        public void xsetSenhaAntiga(org.apache.xmlbeans.XmlString senhaAntiga)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHAANTIGA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHAANTIGA$2);
                }
                target.set(senhaAntiga);
            }
        }
        
        /**
         * Unsets the "SenhaAntiga" element
         */
        public void unsetSenhaAntiga()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENHAANTIGA$2, 0);
            }
        }
        
        /**
         * Gets the "SenhaNova" element
         */
        public java.lang.String getSenhaNova()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHANOVA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SenhaNova" element
         */
        public org.apache.xmlbeans.XmlString xgetSenhaNova()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHANOVA$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "SenhaNova" element
         */
        public boolean isSetSenhaNova()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENHANOVA$4) != 0;
            }
        }
        
        /**
         * Sets the "SenhaNova" element
         */
        public void setSenhaNova(java.lang.String senhaNova)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENHANOVA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENHANOVA$4);
                }
                target.setStringValue(senhaNova);
            }
        }
        
        /**
         * Sets (as xml) the "SenhaNova" element
         */
        public void xsetSenhaNova(org.apache.xmlbeans.XmlString senhaNova)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENHANOVA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENHANOVA$4);
                }
                target.set(senhaNova);
            }
        }
        
        /**
         * Unsets the "SenhaNova" element
         */
        public void unsetSenhaNova()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENHANOVA$4, 0);
            }
        }
    }
}
