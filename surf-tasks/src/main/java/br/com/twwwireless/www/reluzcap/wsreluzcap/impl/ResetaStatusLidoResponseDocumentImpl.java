/*
 * An XML document type.
 * Localname: ResetaStatusLidoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one ResetaStatusLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class ResetaStatusLidoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResetaStatusLidoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESETASTATUSLIDORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "ResetaStatusLidoResponse");
    
    
    /**
     * Gets the "ResetaStatusLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse getResetaStatusLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse)get_store().find_element_user(RESETASTATUSLIDORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResetaStatusLidoResponse" element
     */
    public void setResetaStatusLidoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse resetaStatusLidoResponse)
    {
        generatedSetterHelperImpl(resetaStatusLidoResponse, RESETASTATUSLIDORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResetaStatusLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse addNewResetaStatusLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse)get_store().add_element_user(RESETASTATUSLIDORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ResetaStatusLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class ResetaStatusLidoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaStatusLidoResponseDocument.ResetaStatusLidoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ResetaStatusLidoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESETASTATUSLIDORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "ResetaStatusLidoResult");
        
        
        /**
         * Gets the "ResetaStatusLidoResult" element
         */
        public java.lang.String getResetaStatusLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETASTATUSLIDORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ResetaStatusLidoResult" element
         */
        public org.apache.xmlbeans.XmlString xgetResetaStatusLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESETASTATUSLIDORESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ResetaStatusLidoResult" element
         */
        public boolean isSetResetaStatusLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESETASTATUSLIDORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ResetaStatusLidoResult" element
         */
        public void setResetaStatusLidoResult(java.lang.String resetaStatusLidoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETASTATUSLIDORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESETASTATUSLIDORESULT$0);
                }
                target.setStringValue(resetaStatusLidoResult);
            }
        }
        
        /**
         * Sets (as xml) the "ResetaStatusLidoResult" element
         */
        public void xsetResetaStatusLidoResult(org.apache.xmlbeans.XmlString resetaStatusLidoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESETASTATUSLIDORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESETASTATUSLIDORESULT$0);
                }
                target.set(resetaStatusLidoResult);
            }
        }
        
        /**
         * Unsets the "ResetaStatusLidoResult" element
         */
        public void unsetResetaStatusLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESETASTATUSLIDORESULT$0, 0);
            }
        }
    }
}
