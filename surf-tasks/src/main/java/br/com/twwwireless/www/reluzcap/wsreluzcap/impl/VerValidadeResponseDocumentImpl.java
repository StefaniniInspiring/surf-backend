/*
 * An XML document type.
 * Localname: VerValidadeResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one VerValidadeResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class VerValidadeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerValidadeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERVALIDADERESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VerValidadeResponse");
    
    
    /**
     * Gets the "VerValidadeResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse getVerValidadeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse)get_store().find_element_user(VERVALIDADERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerValidadeResponse" element
     */
    public void setVerValidadeResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse verValidadeResponse)
    {
        generatedSetterHelperImpl(verValidadeResponse, VERVALIDADERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerValidadeResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse addNewVerValidadeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse)get_store().add_element_user(VERVALIDADERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML VerValidadeResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class VerValidadeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerValidadeResponseDocument.VerValidadeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public VerValidadeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERVALIDADERESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VerValidadeResult");
        
        
        /**
         * Gets the "VerValidadeResult" element
         */
        public java.util.Calendar getVerValidadeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERVALIDADERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "VerValidadeResult" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetVerValidadeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VERVALIDADERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VerValidadeResult" element
         */
        public void setVerValidadeResult(java.util.Calendar verValidadeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERVALIDADERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERVALIDADERESULT$0);
                }
                target.setCalendarValue(verValidadeResult);
            }
        }
        
        /**
         * Sets (as xml) the "VerValidadeResult" element
         */
        public void xsetVerValidadeResult(org.apache.xmlbeans.XmlDateTime verValidadeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VERVALIDADERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(VERVALIDADERESULT$0);
                }
                target.set(verValidadeResult);
            }
        }
    }
}
