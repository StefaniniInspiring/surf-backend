/*
 * An XML document type.
 * Localname: EnviaSMS2SN
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMS2SN(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMS2SNDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMS2SNDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMS2SN$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMS2SN");
    
    
    /**
     * Gets the "EnviaSMS2SN" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN getEnviaSMS2SN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN)get_store().find_element_user(ENVIASMS2SN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMS2SN" element
     */
    public void setEnviaSMS2SN(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN enviaSMS2SN)
    {
        generatedSetterHelperImpl(enviaSMS2SN, ENVIASMS2SN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMS2SN" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN addNewEnviaSMS2SN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN)get_store().add_element_user(ENVIASMS2SN$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMS2SN(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMS2SNImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNDocument.EnviaSMS2SN
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMS2SNImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Senha");
        private static final javax.xml.namespace.QName SEUNUM1$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SeuNum1");
        private static final javax.xml.namespace.QName SEUNUM2$6 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SeuNum2");
        private static final javax.xml.namespace.QName CELULAR$8 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Celular");
        private static final javax.xml.namespace.QName MENSAGEM$10 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Mensagem");
        private static final javax.xml.namespace.QName AGENDAMENTO$12 = 
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
         * Gets the "SeuNum1" element
         */
        public java.lang.String getSeuNum1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM1$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SeuNum1" element
         */
        public org.apache.xmlbeans.XmlString xgetSeuNum1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM1$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "SeuNum1" element
         */
        public boolean isSetSeuNum1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEUNUM1$4) != 0;
            }
        }
        
        /**
         * Sets the "SeuNum1" element
         */
        public void setSeuNum1(java.lang.String seuNum1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM1$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEUNUM1$4);
                }
                target.setStringValue(seuNum1);
            }
        }
        
        /**
         * Sets (as xml) the "SeuNum1" element
         */
        public void xsetSeuNum1(org.apache.xmlbeans.XmlString seuNum1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM1$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEUNUM1$4);
                }
                target.set(seuNum1);
            }
        }
        
        /**
         * Unsets the "SeuNum1" element
         */
        public void unsetSeuNum1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEUNUM1$4, 0);
            }
        }
        
        /**
         * Gets the "SeuNum2" element
         */
        public java.lang.String getSeuNum2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM2$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SeuNum2" element
         */
        public org.apache.xmlbeans.XmlString xgetSeuNum2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM2$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "SeuNum2" element
         */
        public boolean isSetSeuNum2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEUNUM2$6) != 0;
            }
        }
        
        /**
         * Sets the "SeuNum2" element
         */
        public void setSeuNum2(java.lang.String seuNum2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEUNUM2$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEUNUM2$6);
                }
                target.setStringValue(seuNum2);
            }
        }
        
        /**
         * Sets (as xml) the "SeuNum2" element
         */
        public void xsetSeuNum2(org.apache.xmlbeans.XmlString seuNum2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEUNUM2$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEUNUM2$6);
                }
                target.set(seuNum2);
            }
        }
        
        /**
         * Unsets the "SeuNum2" element
         */
        public void unsetSeuNum2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEUNUM2$6, 0);
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
         * Gets the "Mensagem" element
         */
        public java.lang.String getMensagem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAGEM$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Mensagem" element
         */
        public org.apache.xmlbeans.XmlString xgetMensagem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAGEM$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "Mensagem" element
         */
        public boolean isSetMensagem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MENSAGEM$10) != 0;
            }
        }
        
        /**
         * Sets the "Mensagem" element
         */
        public void setMensagem(java.lang.String mensagem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAGEM$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENSAGEM$10);
                }
                target.setStringValue(mensagem);
            }
        }
        
        /**
         * Sets (as xml) the "Mensagem" element
         */
        public void xsetMensagem(org.apache.xmlbeans.XmlString mensagem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAGEM$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENSAGEM$10);
                }
                target.set(mensagem);
            }
        }
        
        /**
         * Unsets the "Mensagem" element
         */
        public void unsetMensagem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MENSAGEM$10, 0);
            }
        }
        
        /**
         * Gets the "Agendamento" element
         */
        public java.util.Calendar getAgendamento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENDAMENTO$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Agendamento" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetAgendamento()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AGENDAMENTO$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Agendamento" element
         */
        public void setAgendamento(java.util.Calendar agendamento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENDAMENTO$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENDAMENTO$12);
                }
                target.setCalendarValue(agendamento);
            }
        }
        
        /**
         * Sets (as xml) the "Agendamento" element
         */
        public void xsetAgendamento(org.apache.xmlbeans.XmlDateTime agendamento)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AGENDAMENTO$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(AGENDAMENTO$12);
                }
                target.set(agendamento);
            }
        }
    }
}
