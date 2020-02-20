/*
 * An XML document type.
 * Localname: EnviaSMSTemplate
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSTemplate(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSTemplateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSTemplateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSTEMPLATE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSTemplate");
    
    
    /**
     * Gets the "EnviaSMSTemplate" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate getEnviaSMSTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate)get_store().find_element_user(ENVIASMSTEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSTemplate" element
     */
    public void setEnviaSMSTemplate(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate enviaSMSTemplate)
    {
        generatedSetterHelperImpl(enviaSMSTemplate, ENVIASMSTEMPLATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSTemplate" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate addNewEnviaSMSTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate)get_store().add_element_user(ENVIASMSTEMPLATE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSTemplate(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSTemplateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTemplateDocument.EnviaSMSTemplate
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSTemplateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Senha");
        private static final javax.xml.namespace.QName TEMPLATE$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Template");
        private static final javax.xml.namespace.QName SEUNUM$6 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SeuNum");
        private static final javax.xml.namespace.QName CELULAR$8 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Celular");
        private static final javax.xml.namespace.QName VARNOME$10 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VarNome");
        private static final javax.xml.namespace.QName VAR1$12 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Var1");
        private static final javax.xml.namespace.QName VAR2$14 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Var2");
        private static final javax.xml.namespace.QName VAR3$16 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Var3");
        private static final javax.xml.namespace.QName VAR4$18 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Var4");
        private static final javax.xml.namespace.QName AGENDAMENTO$20 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Agendamento");
        
        
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
         * Gets the "Template" element
         */
        public java.lang.String getTemplate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Template" element
         */
        public org.apache.xmlbeans.XmlString xgetTemplate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPLATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Template" element
         */
        public boolean isSetTemplate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEMPLATE$4) != 0;
            }
        }
        
        /**
         * Sets the "Template" element
         */
        public void setTemplate(java.lang.String template)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATE$4);
                }
                target.setStringValue(template);
            }
        }
        
        /**
         * Sets (as xml) the "Template" element
         */
        public void xsetTemplate(org.apache.xmlbeans.XmlString template)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPLATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPLATE$4);
                }
                target.set(template);
            }
        }
        
        /**
         * Unsets the "Template" element
         */
        public void unsetTemplate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEMPLATE$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM$6, 0);
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
                return get_store().count_elements(SEUNUM$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEUNUM$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEUNUM$6);
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
                get_store().remove_element(SEUNUM$6, 0);
            }
        }
        
        /**
         * Gets the "Celular" element
         */
        public java.lang.String getCelular()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELULAR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Celular" element
         */
        public org.apache.xmlbeans.XmlString xgetCelular()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELULAR$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Celular" element
         */
        public boolean isSetCelular()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CELULAR$8) != 0;
            }
        }
        
        /**
         * Sets the "Celular" element
         */
        public void setCelular(java.lang.String celular)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELULAR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELULAR$8);
                }
                target.setStringValue(celular);
            }
        }
        
        /**
         * Sets (as xml) the "Celular" element
         */
        public void xsetCelular(org.apache.xmlbeans.XmlString celular)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELULAR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELULAR$8);
                }
                target.set(celular);
            }
        }
        
        /**
         * Unsets the "Celular" element
         */
        public void unsetCelular()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CELULAR$8, 0);
            }
        }
        
        /**
         * Gets the "VarNome" element
         */
        public java.lang.String getVarNome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARNOME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VarNome" element
         */
        public org.apache.xmlbeans.XmlString xgetVarNome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARNOME$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "VarNome" element
         */
        public boolean isSetVarNome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VARNOME$10) != 0;
            }
        }
        
        /**
         * Sets the "VarNome" element
         */
        public void setVarNome(java.lang.String varNome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARNOME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARNOME$10);
                }
                target.setStringValue(varNome);
            }
        }
        
        /**
         * Sets (as xml) the "VarNome" element
         */
        public void xsetVarNome(org.apache.xmlbeans.XmlString varNome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARNOME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARNOME$10);
                }
                target.set(varNome);
            }
        }
        
        /**
         * Unsets the "VarNome" element
         */
        public void unsetVarNome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VARNOME$10, 0);
            }
        }
        
        /**
         * Gets the "Var1" element
         */
        public java.lang.String getVar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR1$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Var1" element
         */
        public org.apache.xmlbeans.XmlString xgetVar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR1$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "Var1" element
         */
        public boolean isSetVar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VAR1$12) != 0;
            }
        }
        
        /**
         * Sets the "Var1" element
         */
        public void setVar1(java.lang.String var1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR1$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAR1$12);
                }
                target.setStringValue(var1);
            }
        }
        
        /**
         * Sets (as xml) the "Var1" element
         */
        public void xsetVar1(org.apache.xmlbeans.XmlString var1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR1$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VAR1$12);
                }
                target.set(var1);
            }
        }
        
        /**
         * Unsets the "Var1" element
         */
        public void unsetVar1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VAR1$12, 0);
            }
        }
        
        /**
         * Gets the "Var2" element
         */
        public java.lang.String getVar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR2$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Var2" element
         */
        public org.apache.xmlbeans.XmlString xgetVar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR2$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "Var2" element
         */
        public boolean isSetVar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VAR2$14) != 0;
            }
        }
        
        /**
         * Sets the "Var2" element
         */
        public void setVar2(java.lang.String var2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR2$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAR2$14);
                }
                target.setStringValue(var2);
            }
        }
        
        /**
         * Sets (as xml) the "Var2" element
         */
        public void xsetVar2(org.apache.xmlbeans.XmlString var2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR2$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VAR2$14);
                }
                target.set(var2);
            }
        }
        
        /**
         * Unsets the "Var2" element
         */
        public void unsetVar2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VAR2$14, 0);
            }
        }
        
        /**
         * Gets the "Var3" element
         */
        public java.lang.String getVar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR3$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Var3" element
         */
        public org.apache.xmlbeans.XmlString xgetVar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR3$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "Var3" element
         */
        public boolean isSetVar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VAR3$16) != 0;
            }
        }
        
        /**
         * Sets the "Var3" element
         */
        public void setVar3(java.lang.String var3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR3$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAR3$16);
                }
                target.setStringValue(var3);
            }
        }
        
        /**
         * Sets (as xml) the "Var3" element
         */
        public void xsetVar3(org.apache.xmlbeans.XmlString var3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR3$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VAR3$16);
                }
                target.set(var3);
            }
        }
        
        /**
         * Unsets the "Var3" element
         */
        public void unsetVar3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VAR3$16, 0);
            }
        }
        
        /**
         * Gets the "Var4" element
         */
        public java.lang.String getVar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR4$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Var4" element
         */
        public org.apache.xmlbeans.XmlString xgetVar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR4$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "Var4" element
         */
        public boolean isSetVar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VAR4$18) != 0;
            }
        }
        
        /**
         * Sets the "Var4" element
         */
        public void setVar4(java.lang.String var4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAR4$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAR4$18);
                }
                target.setStringValue(var4);
            }
        }
        
        /**
         * Sets (as xml) the "Var4" element
         */
        public void xsetVar4(org.apache.xmlbeans.XmlString var4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAR4$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VAR4$18);
                }
                target.set(var4);
            }
        }
        
        /**
         * Unsets the "Var4" element
         */
        public void unsetVar4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VAR4$18, 0);
            }
        }
        
        /**
         * Gets the "Agendamento" element
         */
        public java.lang.String getAgendamento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENDAMENTO$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Agendamento" element
         */
        public org.apache.xmlbeans.XmlString xgetAgendamento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENDAMENTO$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "Agendamento" element
         */
        public boolean isSetAgendamento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENDAMENTO$20) != 0;
            }
        }
        
        /**
         * Sets the "Agendamento" element
         */
        public void setAgendamento(java.lang.String agendamento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENDAMENTO$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENDAMENTO$20);
                }
                target.setStringValue(agendamento);
            }
        }
        
        /**
         * Sets (as xml) the "Agendamento" element
         */
        public void xsetAgendamento(org.apache.xmlbeans.XmlString agendamento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENDAMENTO$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGENDAMENTO$20);
                }
                target.set(agendamento);
            }
        }
        
        /**
         * Unsets the "Agendamento" element
         */
        public void unsetAgendamento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENDAMENTO$20, 0);
            }
        }
    }
}
