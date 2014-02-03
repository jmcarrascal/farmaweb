/*
 * XML Type:  webServiceResult
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.WebServiceResult
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML webServiceResult(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class WebServiceResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.WebServiceResult
{
    
    public WebServiceResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODIGOTRANSACCION$0 = 
        new javax.xml.namespace.QName("", "codigoTransaccion");
    private static final javax.xml.namespace.QName ERRORES$2 = 
        new javax.xml.namespace.QName("", "errores");
    private static final javax.xml.namespace.QName RESULTADO$4 = 
        new javax.xml.namespace.QName("", "resultado");
    
    
    /**
     * Gets the "codigoTransaccion" element
     */
    public java.lang.String getCodigoTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOTRANSACCION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigoTransaccion" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTRANSACCION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "codigoTransaccion" element
     */
    public boolean isSetCodigoTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODIGOTRANSACCION$0) != 0;
        }
    }
    
    /**
     * Sets the "codigoTransaccion" element
     */
    public void setCodigoTransaccion(java.lang.String codigoTransaccion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOTRANSACCION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOTRANSACCION$0);
            }
            target.setStringValue(codigoTransaccion);
        }
    }
    
    /**
     * Sets (as xml) the "codigoTransaccion" element
     */
    public void xsetCodigoTransaccion(org.apache.xmlbeans.XmlString codigoTransaccion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOTRANSACCION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOTRANSACCION$0);
            }
            target.set(codigoTransaccion);
        }
    }
    
    /**
     * Unsets the "codigoTransaccion" element
     */
    public void unsetCodigoTransaccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODIGOTRANSACCION$0, 0);
        }
    }
    
    /**
     * Gets array of all "errores" elements
     */
    public com.inssjp.mywebservice.business.WebServiceError[] getErroresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRORES$2, targetList);
            com.inssjp.mywebservice.business.WebServiceError[] result = new com.inssjp.mywebservice.business.WebServiceError[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "errores" element
     */
    public com.inssjp.mywebservice.business.WebServiceError getErroresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceError target = null;
            target = (com.inssjp.mywebservice.business.WebServiceError)get_store().find_element_user(ERRORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "errores" element
     */
    public boolean isNilErroresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceError target = null;
            target = (com.inssjp.mywebservice.business.WebServiceError)get_store().find_element_user(ERRORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "errores" element
     */
    public int sizeOfErroresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORES$2);
        }
    }
    
    /**
     * Sets array of all "errores" element
     */
    public void setErroresArray(com.inssjp.mywebservice.business.WebServiceError[] erroresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(erroresArray, ERRORES$2);
        }
    }
    
    /**
     * Sets ith "errores" element
     */
    public void setErroresArray(int i, com.inssjp.mywebservice.business.WebServiceError errores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceError target = null;
            target = (com.inssjp.mywebservice.business.WebServiceError)get_store().find_element_user(ERRORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errores);
        }
    }
    
    /**
     * Nils the ith "errores" element
     */
    public void setNilErroresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceError target = null;
            target = (com.inssjp.mywebservice.business.WebServiceError)get_store().find_element_user(ERRORES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errores" element
     */
    public com.inssjp.mywebservice.business.WebServiceError insertNewErrores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceError target = null;
            target = (com.inssjp.mywebservice.business.WebServiceError)get_store().insert_element_user(ERRORES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errores" element
     */
    public com.inssjp.mywebservice.business.WebServiceError addNewErrores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.WebServiceError target = null;
            target = (com.inssjp.mywebservice.business.WebServiceError)get_store().add_element_user(ERRORES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "errores" element
     */
    public void removeErrores(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORES$2, i);
        }
    }
    
    /**
     * Gets the "resultado" element
     */
    public boolean getResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTADO$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "resultado" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESULTADO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "resultado" element
     */
    public boolean isSetResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTADO$4) != 0;
        }
    }
    
    /**
     * Sets the "resultado" element
     */
    public void setResultado(boolean resultado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTADO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTADO$4);
            }
            target.setBooleanValue(resultado);
        }
    }
    
    /**
     * Sets (as xml) the "resultado" element
     */
    public void xsetResultado(org.apache.xmlbeans.XmlBoolean resultado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESULTADO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESULTADO$4);
            }
            target.set(resultado);
        }
    }
    
    /**
     * Unsets the "resultado" element
     */
    public void unsetResultado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTADO$4, 0);
        }
    }
}
