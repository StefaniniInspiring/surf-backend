/*
 * An XML document type.
 * Localname: AlteraSenhaResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one AlteraSenhaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class AlteraSenhaResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlteraSenhaResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERASENHARESPONSE$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "AlteraSenhaResponse");
    
    
    /**
     * Gets the "AlteraSenhaResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse getAlteraSenhaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse)get_store().find_element_user(ALTERASENHARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AlteraSenhaResponse" element
     */
    public void setAlteraSenhaResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse alteraSenhaResponse)
    {
        generatedSetterHelperImpl(alteraSenhaResponse, ALTERASENHARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AlteraSenhaResponse" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse addNewAlteraSenhaResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse)get_store().add_element_user(ALTERASENHARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AlteraSenhaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public static class AlteraSenhaResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AlteraSenhaResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALTERASENHARESULT$0 = 
            new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "AlteraSenhaResult");
        
        
        /**
         * Gets the "AlteraSenhaResult" element
         */
        public boolean getAlteraSenhaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERASENHARESULT$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "AlteraSenhaResult" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetAlteraSenhaResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALTERASENHARESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AlteraSenhaResult" element
         */
        public void setAlteraSenhaResult(boolean alteraSenhaResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERASENHARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERASENHARESULT$0);
                }
                target.setBooleanValue(alteraSenhaResult);
            }
        }
        
        /**
         * Sets (as xml) the "AlteraSenhaResult" element
         */
        public void xsetAlteraSenhaResult(org.apache.xmlbeans.XmlBoolean alteraSenhaResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALTERASENHARESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALTERASENHARESULT$0);
                }
                target.set(alteraSenhaResult);
            }
        }
    }
}
