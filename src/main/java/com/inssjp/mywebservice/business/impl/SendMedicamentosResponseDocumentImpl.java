/*
 * An XML document type.
 * Localname: sendMedicamentosResponse
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * A document containing one sendMedicamentosResponse(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public class SendMedicamentosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendMedicamentosResponseDocument
{
    
    public SendMedicamentosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDMEDICAMENTOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosResponse");
    
    
    /**
     * Gets the "sendMedicamentosResponse" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentosResponse getSendMedicamentosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosResponse target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosResponse)get_store().find_element_user(SENDMEDICAMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendMedicamentosResponse" element
     */
    public void setSendMedicamentosResponse(com.inssjp.mywebservice.business.SendMedicamentosResponse sendMedicamentosResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosResponse target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosResponse)get_store().find_element_user(SENDMEDICAMENTOSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.SendMedicamentosResponse)get_store().add_element_user(SENDMEDICAMENTOSRESPONSE$0);
            }
            target.set(sendMedicamentosResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "sendMedicamentosResponse" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentosResponse addNewSendMedicamentosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosResponse target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosResponse)get_store().add_element_user(SENDMEDICAMENTOSRESPONSE$0);
            return target;
        }
    }
}
