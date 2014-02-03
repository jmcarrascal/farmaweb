/*
 * XML Type:  webServiceError
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.WebServiceError
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML webServiceError(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class WebServiceErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.WebServiceError
{
    
    public WebServiceErrorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CERROR$0 = 
        new javax.xml.namespace.QName("", "_c_error");
    private static final javax.xml.namespace.QName DERROR$2 = 
        new javax.xml.namespace.QName("", "_d_error");
    
    
    /**
     * Gets the "_c_error" element
     */
    public java.lang.String getCError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "_c_error" element
     */
    public org.apache.xmlbeans.XmlString xgetCError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CERROR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "_c_error" element
     */
    public boolean isSetCError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CERROR$0) != 0;
        }
    }
    
    /**
     * Sets the "_c_error" element
     */
    public void setCError(java.lang.String cError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CERROR$0);
            }
            target.setStringValue(cError);
        }
    }
    
    /**
     * Sets (as xml) the "_c_error" element
     */
    public void xsetCError(org.apache.xmlbeans.XmlString cError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CERROR$0);
            }
            target.set(cError);
        }
    }
    
    /**
     * Unsets the "_c_error" element
     */
    public void unsetCError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CERROR$0, 0);
        }
    }
    
    /**
     * Gets the "_d_error" element
     */
    public java.lang.String getDError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DERROR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "_d_error" element
     */
    public org.apache.xmlbeans.XmlString xgetDError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DERROR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "_d_error" element
     */
    public boolean isSetDError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERROR$2) != 0;
        }
    }
    
    /**
     * Sets the "_d_error" element
     */
    public void setDError(java.lang.String dError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DERROR$2);
            }
            target.setStringValue(dError);
        }
    }
    
    /**
     * Sets (as xml) the "_d_error" element
     */
    public void xsetDError(org.apache.xmlbeans.XmlString dError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DERROR$2);
            }
            target.set(dError);
        }
    }
    
    /**
     * Unsets the "_d_error" element
     */
    public void unsetDError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERROR$2, 0);
        }
    }
}
