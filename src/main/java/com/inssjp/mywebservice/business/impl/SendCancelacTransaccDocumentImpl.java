/*
 * An XML document type.
 * Localname: sendCancelacTransacc
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendCancelacTransaccDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * A document containing one sendCancelacTransacc(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public class SendCancelacTransaccDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendCancelacTransaccDocument
{
    
    public SendCancelacTransaccDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDCANCELACTRANSACC$0 = 
        new javax.xml.namespace.QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransacc");
    
    
    /**
     * Gets the "sendCancelacTransacc" element
     */
    public com.inssjp.mywebservice.business.SendCancelacTransacc getSendCancelacTransacc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendCancelacTransacc target = null;
            target = (com.inssjp.mywebservice.business.SendCancelacTransacc)get_store().find_element_user(SENDCANCELACTRANSACC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendCancelacTransacc" element
     */
    public void setSendCancelacTransacc(com.inssjp.mywebservice.business.SendCancelacTransacc sendCancelacTransacc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendCancelacTransacc target = null;
            target = (com.inssjp.mywebservice.business.SendCancelacTransacc)get_store().find_element_user(SENDCANCELACTRANSACC$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.SendCancelacTransacc)get_store().add_element_user(SENDCANCELACTRANSACC$0);
            }
            target.set(sendCancelacTransacc);
        }
    }
    
    /**
     * Appends and returns a new empty "sendCancelacTransacc" element
     */
    public com.inssjp.mywebservice.business.SendCancelacTransacc addNewSendCancelacTransacc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendCancelacTransacc target = null;
            target = (com.inssjp.mywebservice.business.SendCancelacTransacc)get_store().add_element_user(SENDCANCELACTRANSACC$0);
            return target;
        }
    }
}
