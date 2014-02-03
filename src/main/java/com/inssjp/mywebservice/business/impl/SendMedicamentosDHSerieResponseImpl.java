/*
 * XML Type:  sendMedicamentosDHSerieResponse
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML sendMedicamentosDHSerieResponse(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class SendMedicamentosDHSerieResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse
{
    
    public SendMedicamentosDHSerieResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURN$0 = 
        new javax.xml.namespace.QName("", "return");
    
    
    /**
     * Gets the "return" element
     */
    public com.inssjp.mywebservice.business.WebServiceResult getReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceResult target = null;
            target = (com.inssjp.mywebservice.business.WebServiceResult)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "return" element
     */
    public boolean isSetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURN$0) != 0;
        }
    }
    
    /**
     * Sets the "return" element
     */
    public void setReturn(com.inssjp.mywebservice.business.WebServiceResult xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceResult target = null;
            target = (com.inssjp.mywebservice.business.WebServiceResult)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.WebServiceResult)get_store().add_element_user(RETURN$0);
            }
            target.set(xreturn);
        }
    }
    
    /**
     * Appends and returns a new empty "return" element
     */
    public com.inssjp.mywebservice.business.WebServiceResult addNewReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceResult target = null;
            target = (com.inssjp.mywebservice.business.WebServiceResult)get_store().add_element_user(RETURN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "return" element
     */
    public void unsetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURN$0, 0);
        }
    }
}
