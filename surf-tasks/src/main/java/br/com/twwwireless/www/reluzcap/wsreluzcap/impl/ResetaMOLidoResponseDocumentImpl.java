/*
 * An XML document type.
 * Localname: ResetaMOLidoResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one ResetaMOLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class ResetaMOLidoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResetaMOLidoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESETAMOLIDORESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "ResetaMOLidoResponse");
    
    
    /**
     * Gets the "ResetaMOLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse getResetaMOLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse)get_store().find_element_user(RESETAMOLIDORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResetaMOLidoResponse" element
     */
    public void setResetaMOLidoResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse resetaMOLidoResponse)
    {
        generatedSetterHelperImpl(resetaMOLidoResponse, RESETAMOLIDORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResetaMOLidoResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse addNewResetaMOLidoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse)get_store().add_element_user(RESETAMOLIDORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ResetaMOLidoResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class ResetaMOLidoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.ResetaMOLidoResponseDocument.ResetaMOLidoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ResetaMOLidoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESETAMOLIDORESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "ResetaMOLidoResult");
        
        
        /**
         * Gets the "ResetaMOLidoResult" element
         */
        public java.lang.String getResetaMOLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETAMOLIDORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ResetaMOLidoResult" element
         */
        public org.apache.xmlbeans.XmlString xgetResetaMOLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESETAMOLIDORESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ResetaMOLidoResult" element
         */
        public boolean isSetResetaMOLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESETAMOLIDORESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ResetaMOLidoResult" element
         */
        public void setResetaMOLidoResult(java.lang.String resetaMOLidoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETAMOLIDORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESETAMOLIDORESULT$0);
                }
                target.setStringValue(resetaMOLidoResult);
            }
        }
        
        /**
         * Sets (as xml) the "ResetaMOLidoResult" element
         */
        public void xsetResetaMOLidoResult(org.apache.xmlbeans.XmlString resetaMOLidoResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESETAMOLIDORESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESETAMOLIDORESULT$0);
                }
                target.set(resetaMOLidoResult);
            }
        }
        
        /**
         * Unsets the "ResetaMOLidoResult" element
         */
        public void unsetResetaMOLidoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESETAMOLIDORESULT$0, 0);
            }
        }
    }
}
