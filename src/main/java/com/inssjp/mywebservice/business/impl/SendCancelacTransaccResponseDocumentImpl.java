/*
 * An XML document type.
 * Localname: sendCancelacTransaccResponse
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * A document containing one sendCancelacTransaccResponse(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public class SendCancelacTransaccResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument
{
    
    public SendCancelacTransaccResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDCANCELACTRANSACCRESPONSE$0 = 
        new javax.xml.namespace.QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransaccResponse");
    
    
    /**
     * Gets the "sendCancelacTransaccResponse" element
     */
    public com.inssjp.mywebservice.business.SendCancelacTransaccResponse getSendCancelacTransaccResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendCancelacTransaccResponse target = null;
            target = (com.inssjp.mywebservice.business.SendCancelacTransaccResponse)get_store().find_element_user(SENDCANCELACTRANSACCRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendCancelacTransaccResponse" element
     */
    public void setSendCancelacTransaccResponse(com.inssjp.mywebservice.business.SendCancelacTransaccResponse sendCancelacTransaccResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendCancelacTransaccResponse target = null;
            target = (com.inssjp.mywebservice.business.SendCancelacTransaccResponse)get_store().find_element_user(SENDCANCELACTRANSACCRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.SendCancelacTransaccResponse)get_store().add_element_user(SENDCANCELACTRANSACCRESPONSE$0);
            }
            target.set(sendCancelacTransaccResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "sendCancelacTransaccResponse" element
     */
    public com.inssjp.mywebservice.business.SendCancelacTransaccResponse addNewSendCancelacTransaccResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendCancelacTransaccResponse target = null;
            target = (com.inssjp.mywebservice.business.SendCancelacTransaccResponse)get_store().add_element_user(SENDCANCELACTRANSACCRESPONSE$0);
            return target;
        }
    }
}
