/*
 * An XML document type.
 * Localname: EnviaSMSResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one EnviaSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class EnviaSMSResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnviaSMSResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIASMSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSResponse");
    
    
    /**
     * Gets the "EnviaSMSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse getEnviaSMSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse)get_store().find_element_user(ENVIASMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnviaSMSResponse" element
     */
    public void setEnviaSMSResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse enviaSMSResponse)
    {
        generatedSetterHelperImpl(enviaSMSResponse, ENVIASMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnviaSMSResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse addNewEnviaSMSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse)get_store().add_element_user(ENVIASMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EnviaSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class EnviaSMSResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSResponseDocument.EnviaSMSResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EnviaSMSResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENVIASMSRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "EnviaSMSResult");
        
        
        /**
         * Gets the "EnviaSMSResult" element
         */
        public java.lang.String getEnviaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EnviaSMSResult" element
         */
        public org.apache.xmlbeans.XmlString xgetEnviaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EnviaSMSResult" element
         */
        public boolean isSetEnviaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENVIASMSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "EnviaSMSResult" element
         */
        public void setEnviaSMSResult(java.lang.String enviaSMSResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIASMSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIASMSRESULT$0);
                }
                target.setStringValue(enviaSMSResult);
            }
        }
        
        /**
         * Sets (as xml) the "EnviaSMSResult" element
         */
        public void xsetEnviaSMSResult(org.apache.xmlbeans.XmlString enviaSMSResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIASMSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIASMSRESULT$0);
                }
                target.set(enviaSMSResult);
            }
        }
        
        /**
         * Unsets the "EnviaSMSResult" element
         */
        public void unsetEnviaSMSResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENVIASMSRESULT$0, 0);
            }
        }
    }
}
