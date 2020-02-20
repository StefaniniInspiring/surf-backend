/*
 * An XML document type.
 * Localname: MONLIDOQUANT
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANTDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap.impl;
/**
 * A document containing one MONLIDOQUANT(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public class MONLIDOQUANTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANTDocument
{
    private static final long serialVersionUID = 1L;
    
    public MONLIDOQUANTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONLIDOQUANT$0 = 
        new javax.xml.namespace.QName("https://www.twwwireless.com.br/reluzcap/wsreluzcap", "MONLIDOQUANT");
    
    
    /**
     * Gets the "MONLIDOQUANT" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT getMONLIDOQUANT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT)get_store().find_element_user(MONLIDOQUANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MONLIDOQUANT" element
     */
    public void setMONLIDOQUANT(br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT monlidoquant)
    {
        generatedSetterHelperImpl(monlidoquant, MONLIDOQUANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MONLIDOQUANT" element
     */
    public br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT addNewMONLIDOQUANT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT target = null;
            target = (br.com.twwwireless.www.reluzcap.wsreluzcap.MONLIDOQUANT)get_store().add_element_user(MONLIDOQUANT$0);
            return target;
        }
    }
}
