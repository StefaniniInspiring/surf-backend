/*
 * An XML document type.
 * Localname: InsBLResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one InsBLResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class InsBLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public InsBLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSBLRESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "InsBLResponse");
    
    
    /**
     * Gets the "InsBLResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse getInsBLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse)get_store().find_element_user(INSBLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InsBLResponse" element
     */
    public void setInsBLResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse insBLResponse)
    {
        generatedSetterHelperImpl(insBLResponse, INSBLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InsBLResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse addNewInsBLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse)get_store().add_element_user(INSBLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML InsBLResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class InsBLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.InsBLResponseDocument.InsBLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public InsBLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INSBLRESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "InsBLResult");
        
        
        /**
         * Gets the "InsBLResult" element
         */
        public int getInsBLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSBLRESULT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "InsBLResult" element
         */
        public org.apache.xmlbeans.XmlInt xgetInsBLResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSBLRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InsBLResult" element
         */
        public void setInsBLResult(int insBLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSBLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSBLRESULT$0);
                }
                target.setIntValue(insBLResult);
            }
        }
        
        /**
         * Sets (as xml) the "InsBLResult" element
         */
        public void xsetInsBLResult(org.apache.xmlbeans.XmlInt insBLResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSBLRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INSBLRESULT$0);
                }
                target.set(insBLResult);
            }
        }
    }
}
