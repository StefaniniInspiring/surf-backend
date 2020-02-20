/*
 * An XML document type.
 * Localname: EnviaSMS2SNResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMS2SNResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMS2SNResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMS2SNResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMS2SNRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMS2SNResponse");
    
    
    /**
     * Gets the "EnviaSMS2SNResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse getEnviaSMS2SNResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse)get_store().find_element_user(ENVIASMS2SNRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMS2SNResponse" element
     */
    public void setEnviaSMS2SNResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse enviaSMS2SNResponse)
    {
        generatedSetterHelperImpl(enviaSMS2SNResponse, ENVIASMS2SNRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMS2SNResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse addNewEnviaSMS2SNResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse)get_store().add_element_user(ENVIASMS2SNRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMS2SNResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMS2SNResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMS2SNResponseDocument.EnviaSMS2SNResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMS2SNResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMS2SNRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMS2SNResult");
        
        
        /**
         * Gets the "EnviaSMS2SNResult" element
         */
        public java.lang.String getEnviaSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMS2SNRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMS2SNResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMS2SNRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMS2SNResult" element
         */
        public boolean isSetEnviaSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMS2SNRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMS2SNResult" element
         */
        public void setEnviaSMS2SNResult(java.lang.String enviaSMS2SNResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMS2SNRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMS2SNRESULT$0);
                }
                target.setStringValue(enviaSMS2SNResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMS2SNResult" element
         */
        public void xsetEnviaSMS2SNResult(org.apache.xmlbeans.XmlString enviaSMS2SNResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMS2SNRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMS2SNRESULT$0);
                }
                target.set(enviaSMS2SNResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMS2SNResult" element
         */
        public void unsetEnviaSMS2SNResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMS2SNRESULT$0, 0);
            }
        }
    }
}
