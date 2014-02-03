/*
 * An XML document type.
 * Localname: sendMedicamentosDHSerieResponse
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * A document containing one sendMedicamentosDHSerieResponse(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public class SendMedicamentosDHSerieResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument
{
    
    public SendMedicamentosDHSerieResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDMEDICAMENTOSDHSERIERESPONSE$0 = 
        new javax.xml.namespace.QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosDHSerieResponse");
    
    
    /**
     * Gets the "sendMedicamentosDHSerieResponse" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse getSendMedicamentosDHSerieResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse)get_store().find_element_user(SENDMEDICAMENTOSDHSERIERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendMedicamentosDHSerieResponse" element
     */
    public void setSendMedicamentosDHSerieResponse(com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse sendMedicamentosDHSerieResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse)get_store().find_element_user(SENDMEDICAMENTOSDHSERIERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse)get_store().add_element_user(SENDMEDICAMENTOSDHSERIERESPONSE$0);
            }
            target.set(sendMedicamentosDHSerieResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "sendMedicamentosDHSerieResponse" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse addNewSendMedicamentosDHSerieResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse)get_store().add_element_user(SENDMEDICAMENTOSDHSERIERESPONSE$0);
            return target;
        }
    }
}
