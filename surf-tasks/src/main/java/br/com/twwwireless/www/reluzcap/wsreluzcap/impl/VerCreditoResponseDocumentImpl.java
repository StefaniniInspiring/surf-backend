/*
 * An XML document type.
 * Localname: VerCreditoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one VerCreditoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class VerCreditoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerCreditoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERCREDITORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VerCreditoResponse");
    
    
    /**
     * Gets the "VerCreditoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse getVerCreditoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse)get_store().find_element_user(VERCREDITORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerCreditoResponse" element
     */
    public void setVerCreditoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse verCreditoResponse)
    {
        generatedSetterHelperImpl(verCreditoResponse, VERCREDITORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerCreditoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse addNewVerCreditoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse)get_store().add_element_user(VERCREDITORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML VerCreditoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class VerCreditoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.VerCreditoResponseDocument.VerCreditoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public VerCreditoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERCREDITORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "VerCreditoResult");
        
        
        /**
         * Gets the "VerCreditoResult" element
         */
        public int getVerCreditoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERCREDITORESULT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "VerCreditoResult" element
         */
        public org.apache.xmlbeans.XmlInt xgetVerCreditoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERCREDITORESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VerCreditoResult" element
         */
        public void setVerCreditoResult(int verCreditoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERCREDITORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERCREDITORESULT$0);
                }
                target.setIntValue(verCreditoResult);
            }
        }
        
        /**
         * Sets (as xml) the "VerCreditoResult" element
         */
        public void xsetVerCreditoResult(org.apache.xmlbeans.XmlInt verCreditoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERCREDITORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERCREDITORESULT$0);
                }
                target.set(verCreditoResult);
            }
        }
    }
}
