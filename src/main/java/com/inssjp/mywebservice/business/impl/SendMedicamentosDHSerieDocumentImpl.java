/*
 * An XML document type.
 * Localname: sendMedicamentosDHSerie
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * A document containing one sendMedicamentosDHSerie(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public class SendMedicamentosDHSerieDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument
{
    
    public SendMedicamentosDHSerieDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDMEDICAMENTOSDHSERIE$0 = 
        new javax.xml.namespace.QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosDHSerie");
    
    
    /**
     * Gets the "sendMedicamentosDHSerie" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentosDHSerie getSendMedicamentosDHSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosDHSerie target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerie)get_store().find_element_user(SENDMEDICAMENTOSDHSERIE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendMedicamentosDHSerie" element
     */
    public void setSendMedicamentosDHSerie(com.inssjp.mywebservice.business.SendMedicamentosDHSerie sendMedicamentosDHSerie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosDHSerie target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerie)get_store().find_element_user(SENDMEDICAMENTOSDHSERIE$0, 0);
            if (target == null)
            {
                target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerie)get_store().add_element_user(SENDMEDICAMENTOSDHSERIE$0);
            }
            target.set(sendMedicamentosDHSerie);
        }
    }
    
    /**
     * Appends and returns a new empty "sendMedicamentosDHSerie" element
     */
    public com.inssjp.mywebservice.business.SendMedicamentosDHSerie addNewSendMedicamentosDHSerie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.SendMedicamentosDHSerie target = null;
            target = (com.inssjp.mywebservice.business.SendMedicamentosDHSerie)get_store().add_element_user(SENDMEDICAMENTOSDHSERIE$0);
            return target;
        }
    }
}
