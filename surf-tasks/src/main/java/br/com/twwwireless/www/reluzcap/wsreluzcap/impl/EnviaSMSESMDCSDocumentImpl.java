/*
 * An XML document type.
 * Localname: EnviaSMSESMDCS
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSESMDCS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSESMDCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSESMDCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSESMDCS$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSESMDCS");
    
    
    /**
     * Gets the "EnviaSMSESMDCS" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS getEnviaSMSESMDCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS)get_store().find_element_user(ENVIASMSESMDCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSESMDCS" element
     */
    public void setEnviaSMSESMDCS(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS enviaSMSESMDCS)
    {
        generatedSetterHelperImpl(enviaSMSESMDCS, ENVIASMSESMDCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSESMDCS" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS addNewEnviaSMSESMDCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS)get_store().add_element_user(ENVIASMSESMDCS$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSESMDCS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSESMDCSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSESMDCSDocument.EnviaSMSESMDCS
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSESMDCSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMUSU$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "NumUsu");
        private static final javax.xml.namespace.QName SENHA$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Senha");
        private static final javax.xml.namespace.QName SEUNUM$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "SeuNum");
        private static final javax.xml.namespace.QName CELULAR$6 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Celular");
        private static final javax.xml.namespace.QName ESM$8 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "ESM");
        private static final javax.xml.namespace.QName DCS$10 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "DCS");
        private static final javax.xml.namespace.QName HEADER$12 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Header");
        private static final javax.xml.namespace.QName MENSAGEM$14 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "Mensagem");
        
        
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
        
        /**
         * Gets the "Celular" element
         */
        public java.lang.String getCelular()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELULAR$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELULAR$6, 0);
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
                return get_store().count_elements(CELULAR$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELULAR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELULAR$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELULAR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELULAR$6);
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
                get_store().remove_element(CELULAR$6, 0);
            }
        }
        
        /**
         * Gets the "ESM" element
         */
        public java.lang.String getESM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESM$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ESM" element
         */
        public org.apache.xmlbeans.XmlString xgetESM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESM$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "ESM" element
         */
        public boolean isSetESM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESM$8) != 0;
            }
        }
        
        /**
         * Sets the "ESM" element
         */
        public void setESM(java.lang.String esm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESM$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESM$8);
                }
                target.setStringValue(esm);
            }
        }
        
        /**
         * Sets (as xml) the "ESM" element
         */
        public void xsetESM(org.apache.xmlbeans.XmlString esm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESM$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESM$8);
                }
                target.set(esm);
            }
        }
        
        /**
         * Unsets the "ESM" element
         */
        public void unsetESM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESM$8, 0);
            }
        }
        
        /**
         * Gets the "DCS" element
         */
        public java.lang.String getDCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DCS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DCS" element
         */
        public org.apache.xmlbeans.XmlString xgetDCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DCS$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "DCS" element
         */
        public boolean isSetDCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DCS$10) != 0;
            }
        }
        
        /**
         * Sets the "DCS" element
         */
        public void setDCS(java.lang.String dcs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DCS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DCS$10);
                }
                target.setStringValue(dcs);
            }
        }
        
        /**
         * Sets (as xml) the "DCS" element
         */
        public void xsetDCS(org.apache.xmlbeans.XmlString dcs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DCS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DCS$10);
                }
                target.set(dcs);
            }
        }
        
        /**
         * Unsets the "DCS" element
         */
        public void unsetDCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DCS$10, 0);
            }
        }
        
        /**
         * Gets the "Header" element
         */
        public java.lang.String getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Header" element
         */
        public org.apache.xmlbeans.XmlString xgetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADER$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "Header" element
         */
        public boolean isSetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADER$12) != 0;
            }
        }
        
        /**
         * Sets the "Header" element
         */
        public void setHeader(java.lang.String header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADER$12);
                }
                target.setStringValue(header);
            }
        }
        
        /**
         * Sets (as xml) the "Header" element
         */
        public void xsetHeader(org.apache.xmlbeans.XmlString header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADER$12);
                }
                target.set(header);
            }
        }
        
        /**
         * Unsets the "Header" element
         */
        public void unsetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADER$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAGEM$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAGEM$14, 0);
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
                return get_store().count_elements(MENSAGEM$14) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENSAGEM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENSAGEM$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MENSAGEM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MENSAGEM$14);
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
                get_store().remove_element(MENSAGEM$14, 0);
            }
        }
    }
}
