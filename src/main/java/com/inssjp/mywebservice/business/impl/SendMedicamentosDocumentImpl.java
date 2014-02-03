/*
 * An XML document type.
 * Localname: sendMedicamentos
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * A document containing one sendMedicamentos(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public class SendMedicamentosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendMedicamentosDocument
{
    
    public SendMedicamentosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDMEDICAMENTOS$0 = 
        new javax.xml.namespace.QName("http://business.mywebservice.inssjp.com/", "sendMedicamentos");
    
    
    /**
     * Gets the "sendMedicamentos" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentos getSendMedicamentos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentos target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentos)get_store().find_element_user(SENDMEDICAMENTOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendMedicamentos" element
     */
    public void setSendMedicamentos(com.inssjp.mywebservice.business.SendMedicamentos sendMedicamentos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentos target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentos)get_store().find_element_user(SENDMEDICAMENTOS$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.SendMedicamentos)get_store().add_element_user(SENDMEDICAMENTOS$0);
            }
            target.set(sendMedicamentos);
        }
    }
    
    /**
     * Appends and returns a new empty "sendMedicamentos" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentos addNewSendMedicamentos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentos target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentos)get_store().add_element_user(SENDMEDICAMENTOS$0);
            return target;
        }
    }
}
