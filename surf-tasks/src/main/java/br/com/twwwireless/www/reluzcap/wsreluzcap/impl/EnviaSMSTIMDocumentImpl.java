/*
 * An XML document type.
 * Localname: EnviaSMSTIM
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSTIM(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSTIMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSTIMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSTIM$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSTIM");
    
    
    /**
     * Gets the "EnviaSMSTIM" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM getEnviaSMSTIM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM)get_store().find_element_user(ENVIASMSTIM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSTIM" element
     */
    public void setEnviaSMSTIM(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM enviaSMSTIM)
    {
        generatedSetterHelperImpl(enviaSMSTIM, ENVIASMSTIM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSTIM" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM addNewEnviaSMSTIM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM)get_store().add_element_user(ENVIASMSTIM$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSTIM(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSTIMImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSTIMDocument.EnviaSMSTIM
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSTIMImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName XMLSTRING$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "XMLString");
        
        
        /**
         * Gets the "XMLString" element
         */
        public java.lang.String getXMLString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XMLSTRING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "XMLString" element
         */
        public org.apache.xmlbeans.XmlString xgetXMLString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XMLSTRING$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "XMLString" element
         */
        public boolean isSetXMLString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(XMLSTRING$0) != 0;
            }
        }
        
        /**
         * Sets the "XMLString" element
         */
        public void setXMLString(java.lang.String xmlString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XMLSTRING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XMLSTRING$0);
                }
                target.setStringValue(xmlString);
            }
        }
        
        /**
         * Sets (as xml) the "XMLString" element
         */
        public void xsetXMLString(org.apache.xmlbeans.XmlString xmlString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XMLSTRING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XMLSTRING$0);
                }
                target.set(xmlString);
            }
        }
        
        /**
         * Unsets the "XMLString" element
         */
        public void unsetXMLString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(XMLSTRING$0, 0);
            }
        }
    }
}
