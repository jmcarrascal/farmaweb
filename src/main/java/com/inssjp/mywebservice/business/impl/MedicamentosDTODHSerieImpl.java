/*
 * XML Type:  medicamentosDTODHSerie
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.MedicamentosDTODHSerie
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML medicamentosDTODHSerie(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class MedicamentosDTODHSerieImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.MedicamentosDTODHSerie
{
    
    public MedicamentosDTODHSerieImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEVENTO$0 = 
        new javax.xml.namespace.QName("", "f_evento");
    private static final javax.xml.namespace.QName HEVENTO$2 = 
        new javax.xml.namespace.QName("", "h_evento");
    private static final javax.xml.namespace.QName GLNORIGEN$4 = 
        new javax.xml.namespace.QName("", "gln_origen");
    private static final javax.xml.namespace.QName GLNDESTINO$6 = 
        new javax.xml.namespace.QName("", "gln_destino");
    private static final javax.xml.namespace.QName NREMITO$8 = 
        new javax.xml.namespace.QName("", "n_remito");
    private static final javax.xml.namespace.QName NFACTURA$10 = 
        new javax.xml.namespace.QName("", "n_factura");
    private static final javax.xml.namespace.QName VENCIMIENTO$12 = 
        new javax.xml.namespace.QName("", "vencimiento");
    private static final javax.xml.namespace.QName GTIN$14 = 
        new javax.xml.namespace.QName("", "gtin");
    private static final javax.xml.namespace.QName LOTE$16 = 
        new javax.xml.namespace.QName("", "lote");
    private static final javax.xml.namespace.QName DESDENUMEROSERIAL$18 = 
        new javax.xml.namespace.QName("", "desde_numero_serial");
    private static final javax.xml.namespace.QName HASTANUMEROSERIAL$20 = 
        new javax.xml.namespace.QName("", "hasta_numero_serial");
    private static final javax.xml.namespace.QName IDEVENTO$22 = 
        new javax.xml.namespace.QName("", "id_evento");
    private static final javax.xml.namespace.QName CUITORIGEN$24 = 
        new javax.xml.namespace.QName("", "cuit_origen");
    private static final javax.xml.namespace.QName CUITDESTINO$26 = 
        new javax.xml.namespace.QName("", "cuit_destino");
    private static final javax.xml.namespace.QName IDOBRASOCIAL$28 = 
        new javax.xml.namespace.QName("", "id_obra_social");
    
    
    /**
     * Gets the "f_evento" element
     */
    public java.lang.String getFEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEVENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "f_evento" element
     */
    public org.apache.xmlbeans.XmlString xgetFEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEVENTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "f_evento" element
     */
    public boolean isSetFEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEVENTO$0) != 0;
        }
    }
    
    /**
     * Sets the "f_evento" element
     */
    public void setFEvento(java.lang.String fEvento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEVENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEVENTO$0);
            }
            target.setStringValue(fEvento);
        }
    }
    
    /**
     * Sets (as xml) the "f_evento" element
     */
    public void xsetFEvento(org.apache.xmlbeans.XmlString fEvento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEVENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FEVENTO$0);
            }
            target.set(fEvento);
        }
    }
    
    /**
     * Unsets the "f_evento" element
     */
    public void unsetFEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEVENTO$0, 0);
        }
    }
    
    /**
     * Gets the "h_evento" element
     */
    public java.lang.String getHEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEVENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "h_evento" element
     */
    public org.apache.xmlbeans.XmlString xgetHEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEVENTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "h_evento" element
     */
    public boolean isSetHEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEVENTO$2) != 0;
        }
    }
    
    /**
     * Sets the "h_evento" element
     */
    public void setHEvento(java.lang.String hEvento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEVENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEVENTO$2);
            }
            target.setStringValue(hEvento);
        }
    }
    
    /**
     * Sets (as xml) the "h_evento" element
     */
    public void xsetHEvento(org.apache.xmlbeans.XmlString hEvento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEVENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEVENTO$2);
            }
            target.set(hEvento);
        }
    }
    
    /**
     * Unsets the "h_evento" element
     */
    public void unsetHEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEVENTO$2, 0);
        }
    }
    
    /**
     * Gets the "gln_origen" element
     */
    public java.lang.String getGlnOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLNORIGEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gln_origen" element
     */
    public org.apache.xmlbeans.XmlString xgetGlnOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLNORIGEN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "gln_origen" element
     */
    public boolean isSetGlnOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLNORIGEN$4) != 0;
        }
    }
    
    /**
     * Sets the "gln_origen" element
     */
    public void setGlnOrigen(java.lang.String glnOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLNORIGEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLNORIGEN$4);
            }
            target.setStringValue(glnOrigen);
        }
    }
    
    /**
     * Sets (as xml) the "gln_origen" element
     */
    public void xsetGlnOrigen(org.apache.xmlbeans.XmlString glnOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLNORIGEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLNORIGEN$4);
            }
            target.set(glnOrigen);
        }
    }
    
    /**
     * Unsets the "gln_origen" element
     */
    public void unsetGlnOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLNORIGEN$4, 0);
        }
    }
    
    /**
     * Gets the "gln_destino" element
     */
    public java.lang.String getGlnDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLNDESTINO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gln_destino" element
     */
    public org.apache.xmlbeans.XmlString xgetGlnDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLNDESTINO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "gln_destino" element
     */
    public boolean isSetGlnDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLNDESTINO$6) != 0;
        }
    }
    
    /**
     * Sets the "gln_destino" element
     */
    public void setGlnDestino(java.lang.String glnDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLNDESTINO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLNDESTINO$6);
            }
            target.setStringValue(glnDestino);
        }
    }
    
    /**
     * Sets (as xml) the "gln_destino" element
     */
    public void xsetGlnDestino(org.apache.xmlbeans.XmlString glnDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLNDESTINO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLNDESTINO$6);
            }
            target.set(glnDestino);
        }
    }
    
    /**
     * Unsets the "gln_destino" element
     */
    public void unsetGlnDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLNDESTINO$6, 0);
        }
    }
    
    /**
     * Gets the "n_remito" element
     */
    public java.lang.String getNRemito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NREMITO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "n_remito" element
     */
    public org.apache.xmlbeans.XmlString xgetNRemito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NREMITO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "n_remito" element
     */
    public boolean isSetNRemito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NREMITO$8) != 0;
        }
    }
    
    /**
     * Sets the "n_remito" element
     */
    public void setNRemito(java.lang.String nRemito)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NREMITO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NREMITO$8);
            }
            target.setStringValue(nRemito);
        }
    }
    
    /**
     * Sets (as xml) the "n_remito" element
     */
    public void xsetNRemito(org.apache.xmlbeans.XmlString nRemito)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NREMITO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NREMITO$8);
            }
            target.set(nRemito);
        }
    }
    
    /**
     * Unsets the "n_remito" element
     */
    public void unsetNRemito()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NREMITO$8, 0);
        }
    }
    
    /**
     * Gets the "n_factura" element
     */
    public java.lang.String getNFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NFACTURA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "n_factura" element
     */
    public org.apache.xmlbeans.XmlString xgetNFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NFACTURA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "n_factura" element
     */
    public boolean isSetNFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NFACTURA$10) != 0;
        }
    }
    
    /**
     * Sets the "n_factura" element
     */
    public void setNFactura(java.lang.String nFactura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NFACTURA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NFACTURA$10);
            }
            target.setStringValue(nFactura);
        }
    }
    
    /**
     * Sets (as xml) the "n_factura" element
     */
    public void xsetNFactura(org.apache.xmlbeans.XmlString nFactura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NFACTURA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NFACTURA$10);
            }
            target.set(nFactura);
        }
    }
    
    /**
     * Unsets the "n_factura" element
     */
    public void unsetNFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NFACTURA$10, 0);
        }
    }
    
    /**
     * Gets the "vencimiento" element
     */
    public java.lang.String getVencimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENCIMIENTO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vencimiento" element
     */
    public org.apache.xmlbeans.XmlString xgetVencimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VENCIMIENTO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "vencimiento" element
     */
    public boolean isSetVencimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VENCIMIENTO$12) != 0;
        }
    }
    
    /**
     * Sets the "vencimiento" element
     */
    public void setVencimiento(java.lang.String vencimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENCIMIENTO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENCIMIENTO$12);
            }
            target.setStringValue(vencimiento);
        }
    }
    
    /**
     * Sets (as xml) the "vencimiento" element
     */
    public void xsetVencimiento(org.apache.xmlbeans.XmlString vencimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VENCIMIENTO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VENCIMIENTO$12);
            }
            target.set(vencimiento);
        }
    }
    
    /**
     * Unsets the "vencimiento" element
     */
    public void unsetVencimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VENCIMIENTO$12, 0);
        }
    }
    
    /**
     * Gets the "gtin" element
     */
    public java.lang.String getGtin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GTIN$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gtin" element
     */
    public org.apache.xmlbeans.XmlString xgetGtin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GTIN$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "gtin" element
     */
    public boolean isSetGtin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GTIN$14) != 0;
        }
    }
    
    /**
     * Sets the "gtin" element
     */
    public void setGtin(java.lang.String gtin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GTIN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GTIN$14);
            }
            target.setStringValue(gtin);
        }
    }
    
    /**
     * Sets (as xml) the "gtin" element
     */
    public void xsetGtin(org.apache.xmlbeans.XmlString gtin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GTIN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GTIN$14);
            }
            target.set(gtin);
        }
    }
    
    /**
     * Unsets the "gtin" element
     */
    public void unsetGtin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GTIN$14, 0);
        }
    }
    
    /**
     * Gets the "lote" element
     */
    public java.lang.String getLote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lote" element
     */
    public org.apache.xmlbeans.XmlString xgetLote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOTE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "lote" element
     */
    public boolean isSetLote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTE$16) != 0;
        }
    }
    
    /**
     * Sets the "lote" element
     */
    public void setLote(java.lang.String lote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOTE$16);
            }
            target.setStringValue(lote);
        }
    }
    
    /**
     * Sets (as xml) the "lote" element
     */
    public void xsetLote(org.apache.xmlbeans.XmlString lote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOTE$16);
            }
            target.set(lote);
        }
    }
    
    /**
     * Unsets the "lote" element
     */
    public void unsetLote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTE$16, 0);
        }
    }
    
    /**
     * Gets the "desde_numero_serial" element
     */
    public java.lang.String getDesdeNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESDENUMEROSERIAL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "desde_numero_serial" element
     */
    public org.apache.xmlbeans.XmlString xgetDesdeNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESDENUMEROSERIAL$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "desde_numero_serial" element
     */
    public boolean isSetDesdeNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESDENUMEROSERIAL$18) != 0;
        }
    }
    
    /**
     * Sets the "desde_numero_serial" element
     */
    public void setDesdeNumeroSerial(java.lang.String desdeNumeroSerial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESDENUMEROSERIAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESDENUMEROSERIAL$18);
            }
            target.setStringValue(desdeNumeroSerial);
        }
    }
    
    /**
     * Sets (as xml) the "desde_numero_serial" element
     */
    public void xsetDesdeNumeroSerial(org.apache.xmlbeans.XmlString desdeNumeroSerial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESDENUMEROSERIAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESDENUMEROSERIAL$18);
            }
            target.set(desdeNumeroSerial);
        }
    }
    
    /**
     * Unsets the "desde_numero_serial" element
     */
    public void unsetDesdeNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESDENUMEROSERIAL$18, 0);
        }
    }
    
    /**
     * Gets the "hasta_numero_serial" element
     */
    public java.lang.String getHastaNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASTANUMEROSERIAL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasta_numero_serial" element
     */
    public org.apache.xmlbeans.XmlString xgetHastaNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASTANUMEROSERIAL$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasta_numero_serial" element
     */
    public boolean isSetHastaNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASTANUMEROSERIAL$20) != 0;
        }
    }
    
    /**
     * Sets the "hasta_numero_serial" element
     */
    public void setHastaNumeroSerial(java.lang.String hastaNumeroSerial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASTANUMEROSERIAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASTANUMEROSERIAL$20);
            }
            target.setStringValue(hastaNumeroSerial);
        }
    }
    
    /**
     * Sets (as xml) the "hasta_numero_serial" element
     */
    public void xsetHastaNumeroSerial(org.apache.xmlbeans.XmlString hastaNumeroSerial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASTANUMEROSERIAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASTANUMEROSERIAL$20);
            }
            target.set(hastaNumeroSerial);
        }
    }
    
    /**
     * Unsets the "hasta_numero_serial" element
     */
    public void unsetHastaNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASTANUMEROSERIAL$20, 0);
        }
    }
    
    /**
     * Gets the "id_evento" element
     */
    public java.lang.String getIdEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEVENTO$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id_evento" element
     */
    public org.apache.xmlbeans.XmlString xgetIdEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEVENTO$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "id_evento" element
     */
    public boolean isSetIdEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDEVENTO$22) != 0;
        }
    }
    
    /**
     * Sets the "id_evento" element
     */
    public void setIdEvento(java.lang.String idEvento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDEVENTO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDEVENTO$22);
            }
            target.setStringValue(idEvento);
        }
    }
    
    /**
     * Sets (as xml) the "id_evento" element
     */
    public void xsetIdEvento(org.apache.xmlbeans.XmlString idEvento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDEVENTO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDEVENTO$22);
            }
            target.set(idEvento);
        }
    }
    
    /**
     * Unsets the "id_evento" element
     */
    public void unsetIdEvento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDEVENTO$22, 0);
        }
    }
    
    /**
     * Gets the "cuit_origen" element
     */
    public java.lang.String getCuitOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUITORIGEN$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cuit_origen" element
     */
    public org.apache.xmlbeans.XmlString xgetCuitOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUITORIGEN$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "cuit_origen" element
     */
    public boolean isSetCuitOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUITORIGEN$24) != 0;
        }
    }
    
    /**
     * Sets the "cuit_origen" element
     */
    public void setCuitOrigen(java.lang.String cuitOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUITORIGEN$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUITORIGEN$24);
            }
            target.setStringValue(cuitOrigen);
        }
    }
    
    /**
     * Sets (as xml) the "cuit_origen" element
     */
    public void xsetCuitOrigen(org.apache.xmlbeans.XmlString cuitOrigen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUITORIGEN$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUITORIGEN$24);
            }
            target.set(cuitOrigen);
        }
    }
    
    /**
     * Unsets the "cuit_origen" element
     */
    public void unsetCuitOrigen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUITORIGEN$24, 0);
        }
    }
    
    /**
     * Gets the "cuit_destino" element
     */
    public java.lang.String getCuitDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUITDESTINO$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cuit_destino" element
     */
    public org.apache.xmlbeans.XmlString xgetCuitDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUITDESTINO$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "cuit_destino" element
     */
    public boolean isSetCuitDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUITDESTINO$26) != 0;
        }
    }
    
    /**
     * Sets the "cuit_destino" element
     */
    public void setCuitDestino(java.lang.String cuitDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUITDESTINO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUITDESTINO$26);
            }
            target.setStringValue(cuitDestino);
        }
    }
    
    /**
     * Sets (as xml) the "cuit_destino" element
     */
    public void xsetCuitDestino(org.apache.xmlbeans.XmlString cuitDestino)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUITDESTINO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUITDESTINO$26);
            }
            target.set(cuitDestino);
        }
    }
    
    /**
     * Unsets the "cuit_destino" element
     */
    public void unsetCuitDestino()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUITDESTINO$26, 0);
        }
    }
    
    /**
     * Gets the "id_obra_social" element
     */
    public java.lang.String getIdObraSocial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDOBRASOCIAL$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id_obra_social" element
     */
    public org.apache.xmlbeans.XmlString xgetIdObraSocial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDOBRASOCIAL$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "id_obra_social" element
     */
    public boolean isSetIdObraSocial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDOBRASOCIAL$28) != 0;
        }
    }
    
    /**
     * Sets the "id_obra_social" element
     */
    public void setIdObraSocial(java.lang.String idObraSocial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDOBRASOCIAL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDOBRASOCIAL$28);
            }
            target.setStringValue(idObraSocial);
        }
    }
    
    /**
     * Sets (as xml) the "id_obra_social" element
     */
    public void xsetIdObraSocial(org.apache.xmlbeans.XmlString idObraSocial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDOBRASOCIAL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDOBRASOCIAL$28);
            }
            target.set(idObraSocial);
        }
    }
    
    /**
     * Unsets the "id_obra_social" element
     */
    public void unsetIdObraSocial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDOBRASOCIAL$28, 0);
        }
    }
}
