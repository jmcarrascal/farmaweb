/*
 * XML Type:  sendCancelacTransacc
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendCancelacTransacc
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML sendCancelacTransacc(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class SendCancelacTransaccImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendCancelacTransacc
{
    
    public SendCancelacTransaccImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARG0$0 = 
        new javax.xml.namespace.QName("", "arg0");
    private static final javax.xml.namespace.QName ARG1$2 = 
        new javax.xml.namespace.QName("", "arg1");
    private static final javax.xml.namespace.QName ARG2$4 = 
        new javax.xml.namespace.QName("", "arg2");
    
    
    /**
     * Gets the "arg0" element
     */
    public long getArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "arg0" element
     */
    public org.apache.xmlbeans.XmlLong xgetArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ARG0$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "arg0" element
     */
    public boolean isSetArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG0$0) != 0;
        }
    }
    
    /**
     * Sets the "arg0" element
     */
    public void setArg0(long arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG0$0);
            }
            target.setLongValue(arg0);
        }
    }
    
    /**
     * Sets (as xml) the "arg0" element
     */
    public void xsetArg0(org.apache.xmlbeans.XmlLong arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ARG0$0);
            }
            target.set(arg0);
        }
    }
    
    /**
     * Unsets the "arg0" element
     */
    public void unsetArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG0$0, 0);
        }
    }
    
    /**
     * Gets the "arg1" element
     */
    public java.lang.String getArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arg1" element
     */
    public org.apache.xmlbeans.XmlString xgetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "arg1" element
     */
    public boolean isSetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG1$2) != 0;
        }
    }
    
    /**
     * Sets the "arg1" element
     */
    public void setArg1(java.lang.String arg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG1$2);
            }
            target.setStringValue(arg1);
        }
    }
    
    /**
     * Sets (as xml) the "arg1" element
     */
    public void xsetArg1(org.apache.xmlbeans.XmlString arg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG1$2);
            }
            target.set(arg1);
        }
    }
    
    /**
     * Unsets the "arg1" element
     */
    public void unsetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG1$2, 0);
        }
    }
    
    /**
     * Gets the "arg2" element
     */
    public java.lang.String getArg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG2$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arg2" element
     */
    public org.apache.xmlbeans.XmlString xgetArg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG2$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "arg2" element
     */
    public boolean isSetArg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG2$4) != 0;
        }
    }
    
    /**
     * Sets the "arg2" element
     */
    public void setArg2(java.lang.String arg2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG2$4);
            }
            target.setStringValue(arg2);
        }
    }
    
    /**
     * Sets (as xml) the "arg2" element
     */
    public void xsetArg2(org.apache.xmlbeans.XmlString arg2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG2$4);
            }
            target.set(arg2);
        }
    }
    
    /**
     * Unsets the "arg2" element
     */
    public void unsetArg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG2$4, 0);
        }
    }
}
