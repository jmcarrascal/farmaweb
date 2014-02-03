/*
 * XML Type:  sendMedicamentos
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentos
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML sendMedicamentos(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class SendMedicamentosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.SendMedicamentos
{
    
    public SendMedicamentosImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets array of all "arg0" elements
     */
    public com.inssjp.mywebservice.business.MedicamentosDTO[] getArg0Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARG0$0, targetList);
            com.inssjp.mywebservice.business.MedicamentosDTO[] result = new com.inssjp.mywebservice.business.MedicamentosDTO[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "arg0" element
     */
    public com.inssjp.mywebservice.business.MedicamentosDTO getArg0Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.MedicamentosDTO target = null;
            target = (com.inssjp.mywebservice.business.MedicamentosDTO)get_store().find_element_user(ARG0$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "arg0" element
     */
    public int sizeOfArg0Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG0$0);
        }
    }
    
    /**
     * Sets array of all "arg0" element
     */
    public void setArg0Array(com.inssjp.mywebservice.business.MedicamentosDTO[] arg0Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arg0Array, ARG0$0);
        }
    }
    
    /**
     * Sets ith "arg0" element
     */
    public void setArg0Array(int i, com.inssjp.mywebservice.business.MedicamentosDTO arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.MedicamentosDTO target = null;
            target = (com.inssjp.mywebservice.business.MedicamentosDTO)get_store().find_element_user(ARG0$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arg0);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arg0" element
     */
    public com.inssjp.mywebservice.business.MedicamentosDTO insertNewArg0(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.MedicamentosDTO target = null;
            target = (com.inssjp.mywebservice.business.MedicamentosDTO)get_store().insert_element_user(ARG0$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arg0" element
     */
    public com.inssjp.mywebservice.business.MedicamentosDTO addNewArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.inssjp.mywebservice.business.MedicamentosDTO target = null;
            target = (com.inssjp.mywebservice.business.MedicamentosDTO)get_store().add_element_user(ARG0$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "arg0" element
     */
    public void removeArg0(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG0$0, i);
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
