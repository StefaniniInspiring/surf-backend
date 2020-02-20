/*
 * An XML document type.
 * Localname: EnviaSMSAlt
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSAlt(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSAltDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSAltDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSALT$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSAlt");
    
    
    /**
     * Gets the "EnviaSMSAlt" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt getEnviaSMSAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt)get_store().find_element_user(ENVIASMSALT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSAlt" element
     */
    public void setEnviaSMSAlt(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt enviaSMSAlt)
    {
        generatedSetterHelperImpl(enviaSMSAlt, ENVIASMSALT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSAlt" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt addNewEnviaSMSAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt)get_store().add_element_user(ENVIASMSALT$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSAlt(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSAltImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAltDocument.EnviaSMSAlt
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSAltImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USER$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "user");
        private static final javax.xml.namespace.QName PWD$2 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "pwd");
        private static final javax.xml.namespace.QName MSGID$4 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "msgid");
        private static final javax.xml.namespace.QName PHONE$6 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "phone");
        private static final javax.xml.namespace.QName MSGTEXT$8 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "msgtext");
        
        
        /**
         * Gets the "user" element
         */
        public java.lang.String getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "user" element
         */
        public org.apache.xmlbeans.XmlString xgetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "user" element
         */
        public boolean isSetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USER$0) != 0;
            }
        }
        
        /**
         * Sets the "user" element
         */
        public void setUser(java.lang.String user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USER$0);
                }
                target.setStringValue(user);
            }
        }
        
        /**
         * Sets (as xml) the "user" element
         */
        public void xsetUser(org.apache.xmlbeans.XmlString user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USER$0);
                }
                target.set(user);
            }
        }
        
        /**
         * Unsets the "user" element
         */
        public void unsetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USER$0, 0);
            }
        }
        
        /**
         * Gets the "pwd" element
         */
        public java.lang.String getPwd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PWD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pwd" element
         */
        public org.apache.xmlbeans.XmlString xgetPwd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PWD$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "pwd" element
         */
        public boolean isSetPwd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PWD$2) != 0;
            }
        }
        
        /**
         * Sets the "pwd" element
         */
        public void setPwd(java.lang.String pwd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PWD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PWD$2);
                }
                target.setStringValue(pwd);
            }
        }
        
        /**
         * Sets (as xml) the "pwd" element
         */
        public void xsetPwd(org.apache.xmlbeans.XmlString pwd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PWD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PWD$2);
                }
                target.set(pwd);
            }
        }
        
        /**
         * Unsets the "pwd" element
         */
        public void unsetPwd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PWD$2, 0);
            }
        }
        
        /**
         * Gets the "msgid" element
         */
        public java.lang.String getMsgid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "msgid" element
         */
        public org.apache.xmlbeans.XmlString xgetMsgid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSGID$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "msgid" element
         */
        public boolean isSetMsgid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MSGID$4) != 0;
            }
        }
        
        /**
         * Sets the "msgid" element
         */
        public void setMsgid(java.lang.String msgid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSGID$4);
                }
                target.setStringValue(msgid);
            }
        }
        
        /**
         * Sets (as xml) the "msgid" element
         */
        public void xsetMsgid(org.apache.xmlbeans.XmlString msgid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSGID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MSGID$4);
                }
                target.set(msgid);
            }
        }
        
        /**
         * Unsets the "msgid" element
         */
        public void unsetMsgid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MSGID$4, 0);
            }
        }
        
        /**
         * Gets the "phone" element
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phone" element
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "phone" element
         */
        public boolean isSetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHONE$6) != 0;
            }
        }
        
        /**
         * Sets the "phone" element
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$6);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "phone" element
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$6);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "phone" element
         */
        public void unsetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHONE$6, 0);
            }
        }
        
        /**
         * Gets the "msgtext" element
         */
        public java.lang.String getMsgtext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGTEXT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "msgtext" element
         */
        public org.apache.xmlbeans.XmlString xgetMsgtext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSGTEXT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "msgtext" element
         */
        public boolean isSetMsgtext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MSGTEXT$8) != 0;
            }
        }
        
        /**
         * Sets the "msgtext" element
         */
        public void setMsgtext(java.lang.String msgtext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGTEXT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSGTEXT$8);
                }
                target.setStringValue(msgtext);
            }
        }
        
        /**
         * Sets (as xml) the "msgtext" element
         */
        public void xsetMsgtext(org.apache.xmlbeans.XmlString msgtext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSGTEXT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MSGTEXT$8);
                }
                target.set(msgtext);
            }
        }
        
        /**
         * Unsets the "msgtext" element
         */
        public void unsetMsgtext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MSGTEXT$8, 0);
            }
        }
    }
}
