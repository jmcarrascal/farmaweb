/*
 * XML Type:  medicamentosDTO
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.MedicamentosDTO
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business.impl;
/**
 * An XML medicamentosDTO(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public class MedicamentosDTOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.inssjp.mywebservice.business.MedicamentosDTO
{
    
    public MedicamentosDTOImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName NUMEROSERIAL$18 = 
        new javax.xml.namespace.QName("", "numero_serial");
    private static final javax.xml.namespace.QName IDOBRASOCIAL$20 = 
        new javax.xml.namespace.QName("", "id_obra_social");
    private static final javax.xml.namespace.QName IDEVENTO$22 = 
        new javax.xml.namespace.QName("", "id_evento");
    private static final javax.xml.namespace.QName CUITORIGEN$24 = 
        new javax.xml.namespace.QName("", "cuit_origen");
    private static final javax.xml.namespace.QName CUITDESTINO$26 = 
        new javax.xml.namespace.QName("", "cuit_destino");
    private static final javax.xml.namespace.QName APELLIDO$28 = 
        new javax.xml.namespace.QName("", "apellido");
    private static final javax.xml.namespace.QName NOMBRES$30 = 
        new javax.xml.namespace.QName("", "nombres");
    private static final javax.xml.namespace.QName TIPODOCUMENTO$32 = 
        new javax.xml.namespace.QName("", "tipo_documento");
    private static final javax.xml.namespace.QName NDOCUMENTO$34 = 
        new javax.xml.namespace.QName("", "n_documento");
    private static final javax.xml.namespace.QName SEXO$36 = 
        new javax.xml.namespace.QName("", "sexo");
    private static final javax.xml.namespace.QName DIRECCION$38 = 
        new javax.xml.namespace.QName("", "direccion");
    private static final javax.xml.namespace.QName NUMERO$40 = 
        new javax.xml.namespace.QName("", "numero");
    private static final javax.xml.namespace.QName PISO$42 = 
        new javax.xml.namespace.QName("", "piso");
    private static final javax.xml.namespace.QName DEPTO$44 = 
        new javax.xml.namespace.QName("", "depto");
    private static final javax.xml.namespace.QName LOCALIDAD$46 = 
        new javax.xml.namespace.QName("", "localidad");
    private static final javax.xml.namespace.QName PROVINCIA$48 = 
        new javax.xml.namespace.QName("", "provincia");
    private static final javax.xml.namespace.QName NPOSTAL$50 = 
        new javax.xml.namespace.QName("", "n_postal");
    private static final javax.xml.namespace.QName FECHANACIMIENTO$52 = 
        new javax.xml.namespace.QName("", "fecha_nacimiento");
    private static final javax.xml.namespace.QName TELEFONO$54 = 
        new javax.xml.namespace.QName("", "telefono");
    private static final javax.xml.namespace.QName NROASOCIADO$56 = 
        new javax.xml.namespace.QName("", "nro_asociado");
    
    
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
     * Gets the "numero_serial" element
     */
    public java.lang.String getNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROSERIAL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numero_serial" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROSERIAL$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "numero_serial" element
     */
    public boolean isSetNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROSERIAL$18) != 0;
        }
    }
    
    /**
     * Sets the "numero_serial" element
     */
    public void setNumeroSerial(java.lang.String numeroSerial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROSERIAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROSERIAL$18);
            }
            target.setStringValue(numeroSerial);
        }
    }
    
    /**
     * Sets (as xml) the "numero_serial" element
     */
    public void xsetNumeroSerial(org.apache.xmlbeans.XmlString numeroSerial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROSERIAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROSERIAL$18);
            }
            target.set(numeroSerial);
        }
    }
    
    /**
     * Unsets the "numero_serial" element
     */
    public void unsetNumeroSerial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROSERIAL$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDOBRASOCIAL$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDOBRASOCIAL$20, 0);
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
            return get_store().count_elements(IDOBRASOCIAL$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDOBRASOCIAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDOBRASOCIAL$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDOBRASOCIAL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDOBRASOCIAL$20);
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
            get_store().remove_element(IDOBRASOCIAL$20, 0);
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
     * Gets the "apellido" element
     */
    public java.lang.String getApellido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellido" element
     */
    public org.apache.xmlbeans.XmlString xgetApellido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "apellido" element
     */
    public boolean isSetApellido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APELLIDO$28) != 0;
        }
    }
    
    /**
     * Sets the "apellido" element
     */
    public void setApellido(java.lang.String apellido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDO$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDO$28);
            }
            target.setStringValue(apellido);
        }
    }
    
    /**
     * Sets (as xml) the "apellido" element
     */
    public void xsetApellido(org.apache.xmlbeans.XmlString apellido)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDO$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDO$28);
            }
            target.set(apellido);
        }
    }
    
    /**
     * Unsets the "apellido" element
     */
    public void unsetApellido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APELLIDO$28, 0);
        }
    }
    
    /**
     * Gets the "nombres" element
     */
    public java.lang.String getNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombres" element
     */
    public org.apache.xmlbeans.XmlString xgetNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "nombres" element
     */
    public boolean isSetNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMBRES$30) != 0;
        }
    }
    
    /**
     * Sets the "nombres" element
     */
    public void setNombres(java.lang.String nombres)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRES$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRES$30);
            }
            target.setStringValue(nombres);
        }
    }
    
    /**
     * Sets (as xml) the "nombres" element
     */
    public void xsetNombres(org.apache.xmlbeans.XmlString nombres)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRES$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRES$30);
            }
            target.set(nombres);
        }
    }
    
    /**
     * Unsets the "nombres" element
     */
    public void unsetNombres()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMBRES$30, 0);
        }
    }
    
    /**
     * Gets the "tipo_documento" element
     */
    public java.lang.String getTipoDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo_documento" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTO$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "tipo_documento" element
     */
    public boolean isSetTipoDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPODOCUMENTO$32) != 0;
        }
    }
    
    /**
     * Sets the "tipo_documento" element
     */
    public void setTipoDocumento(java.lang.String tipoDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTO$32);
            }
            target.setStringValue(tipoDocumento);
        }
    }
    
    /**
     * Sets (as xml) the "tipo_documento" element
     */
    public void xsetTipoDocumento(org.apache.xmlbeans.XmlString tipoDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPODOCUMENTO$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPODOCUMENTO$32);
            }
            target.set(tipoDocumento);
        }
    }
    
    /**
     * Unsets the "tipo_documento" element
     */
    public void unsetTipoDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPODOCUMENTO$32, 0);
        }
    }
    
    /**
     * Gets the "n_documento" element
     */
    public java.lang.String getNDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NDOCUMENTO$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "n_documento" element
     */
    public org.apache.xmlbeans.XmlString xgetNDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NDOCUMENTO$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "n_documento" element
     */
    public boolean isSetNDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NDOCUMENTO$34) != 0;
        }
    }
    
    /**
     * Sets the "n_documento" element
     */
    public void setNDocumento(java.lang.String nDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NDOCUMENTO$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NDOCUMENTO$34);
            }
            target.setStringValue(nDocumento);
        }
    }
    
    /**
     * Sets (as xml) the "n_documento" element
     */
    public void xsetNDocumento(org.apache.xmlbeans.XmlString nDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NDOCUMENTO$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NDOCUMENTO$34);
            }
            target.set(nDocumento);
        }
    }
    
    /**
     * Unsets the "n_documento" element
     */
    public void unsetNDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NDOCUMENTO$34, 0);
        }
    }
    
    /**
     * Gets the "sexo" element
     */
    public java.lang.String getSexo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXO$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sexo" element
     */
    public org.apache.xmlbeans.XmlString xgetSexo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEXO$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "sexo" element
     */
    public boolean isSetSexo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEXO$36) != 0;
        }
    }
    
    /**
     * Sets the "sexo" element
     */
    public void setSexo(java.lang.String sexo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXO$36);
            }
            target.setStringValue(sexo);
        }
    }
    
    /**
     * Sets (as xml) the "sexo" element
     */
    public void xsetSexo(org.apache.xmlbeans.XmlString sexo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEXO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEXO$36);
            }
            target.set(sexo);
        }
    }
    
    /**
     * Unsets the "sexo" element
     */
    public void unsetSexo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEXO$36, 0);
        }
    }
    
    /**
     * Gets the "direccion" element
     */
    public java.lang.String getDireccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECCION$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "direccion" element
     */
    public org.apache.xmlbeans.XmlString xgetDireccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECCION$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "direccion" element
     */
    public boolean isSetDireccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECCION$38) != 0;
        }
    }
    
    /**
     * Sets the "direccion" element
     */
    public void setDireccion(java.lang.String direccion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECCION$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECCION$38);
            }
            target.setStringValue(direccion);
        }
    }
    
    /**
     * Sets (as xml) the "direccion" element
     */
    public void xsetDireccion(org.apache.xmlbeans.XmlString direccion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECCION$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECCION$38);
            }
            target.set(direccion);
        }
    }
    
    /**
     * Unsets the "direccion" element
     */
    public void unsetDireccion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECCION$38, 0);
        }
    }
    
    /**
     * Gets the "numero" element
     */
    public java.lang.String getNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numero" element
     */
    public org.apache.xmlbeans.XmlString xgetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "numero" element
     */
    public boolean isSetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMERO$40) != 0;
        }
    }
    
    /**
     * Sets the "numero" element
     */
    public void setNumero(java.lang.String numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$40);
            }
            target.setStringValue(numero);
        }
    }
    
    /**
     * Sets (as xml) the "numero" element
     */
    public void xsetNumero(org.apache.xmlbeans.XmlString numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERO$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERO$40);
            }
            target.set(numero);
        }
    }
    
    /**
     * Unsets the "numero" element
     */
    public void unsetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMERO$40, 0);
        }
    }
    
    /**
     * Gets the "piso" element
     */
    public java.lang.String getPiso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PISO$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "piso" element
     */
    public org.apache.xmlbeans.XmlString xgetPiso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PISO$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "piso" element
     */
    public boolean isSetPiso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PISO$42) != 0;
        }
    }
    
    /**
     * Sets the "piso" element
     */
    public void setPiso(java.lang.String piso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PISO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PISO$42);
            }
            target.setStringValue(piso);
        }
    }
    
    /**
     * Sets (as xml) the "piso" element
     */
    public void xsetPiso(org.apache.xmlbeans.XmlString piso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PISO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PISO$42);
            }
            target.set(piso);
        }
    }
    
    /**
     * Unsets the "piso" element
     */
    public void unsetPiso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PISO$42, 0);
        }
    }
    
    /**
     * Gets the "depto" element
     */
    public java.lang.String getDepto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTO$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "depto" element
     */
    public org.apache.xmlbeans.XmlString xgetDepto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPTO$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "depto" element
     */
    public boolean isSetDepto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPTO$44) != 0;
        }
    }
    
    /**
     * Sets the "depto" element
     */
    public void setDepto(java.lang.String depto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTO$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPTO$44);
            }
            target.setStringValue(depto);
        }
    }
    
    /**
     * Sets (as xml) the "depto" element
     */
    public void xsetDepto(org.apache.xmlbeans.XmlString depto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPTO$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPTO$44);
            }
            target.set(depto);
        }
    }
    
    /**
     * Unsets the "depto" element
     */
    public void unsetDepto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPTO$44, 0);
        }
    }
    
    /**
     * Gets the "localidad" element
     */
    public java.lang.String getLocalidad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALIDAD$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "localidad" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalidad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALIDAD$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "localidad" element
     */
    public boolean isSetLocalidad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALIDAD$46) != 0;
        }
    }
    
    /**
     * Sets the "localidad" element
     */
    public void setLocalidad(java.lang.String localidad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALIDAD$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALIDAD$46);
            }
            target.setStringValue(localidad);
        }
    }
    
    /**
     * Sets (as xml) the "localidad" element
     */
    public void xsetLocalidad(org.apache.xmlbeans.XmlString localidad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALIDAD$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALIDAD$46);
            }
            target.set(localidad);
        }
    }
    
    /**
     * Unsets the "localidad" element
     */
    public void unsetLocalidad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALIDAD$46, 0);
        }
    }
    
    /**
     * Gets the "provincia" element
     */
    public java.lang.String getProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIA$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "provincia" element
     */
    public org.apache.xmlbeans.XmlString xgetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVINCIA$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "provincia" element
     */
    public boolean isSetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVINCIA$48) != 0;
        }
    }
    
    /**
     * Sets the "provincia" element
     */
    public void setProvincia(java.lang.String provincia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIA$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVINCIA$48);
            }
            target.setStringValue(provincia);
        }
    }
    
    /**
     * Sets (as xml) the "provincia" element
     */
    public void xsetProvincia(org.apache.xmlbeans.XmlString provincia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVINCIA$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVINCIA$48);
            }
            target.set(provincia);
        }
    }
    
    /**
     * Unsets the "provincia" element
     */
    public void unsetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVINCIA$48, 0);
        }
    }
    
    /**
     * Gets the "n_postal" element
     */
    public java.lang.String getNPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPOSTAL$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "n_postal" element
     */
    public org.apache.xmlbeans.XmlString xgetNPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NPOSTAL$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "n_postal" element
     */
    public boolean isSetNPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NPOSTAL$50) != 0;
        }
    }
    
    /**
     * Sets the "n_postal" element
     */
    public void setNPostal(java.lang.String nPostal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPOSTAL$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NPOSTAL$50);
            }
            target.setStringValue(nPostal);
        }
    }
    
    /**
     * Sets (as xml) the "n_postal" element
     */
    public void xsetNPostal(org.apache.xmlbeans.XmlString nPostal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NPOSTAL$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NPOSTAL$50);
            }
            target.set(nPostal);
        }
    }
    
    /**
     * Unsets the "n_postal" element
     */
    public void unsetNPostal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NPOSTAL$50, 0);
        }
    }
    
    /**
     * Gets the "fecha_nacimiento" element
     */
    public java.lang.String getFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHANACIMIENTO$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fecha_nacimiento" element
     */
    public org.apache.xmlbeans.XmlString xgetFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "fecha_nacimiento" element
     */
    public boolean isSetFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FECHANACIMIENTO$52) != 0;
        }
    }
    
    /**
     * Sets the "fecha_nacimiento" element
     */
    public void setFechaNacimiento(java.lang.String fechaNacimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHANACIMIENTO$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHANACIMIENTO$52);
            }
            target.setStringValue(fechaNacimiento);
        }
    }
    
    /**
     * Sets (as xml) the "fecha_nacimiento" element
     */
    public void xsetFechaNacimiento(org.apache.xmlbeans.XmlString fechaNacimiento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FECHANACIMIENTO$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FECHANACIMIENTO$52);
            }
            target.set(fechaNacimiento);
        }
    }
    
    /**
     * Unsets the "fecha_nacimiento" element
     */
    public void unsetFechaNacimiento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FECHANACIMIENTO$52, 0);
        }
    }
    
    /**
     * Gets the "telefono" element
     */
    public java.lang.String getTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFONO$54, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telefono" element
     */
    public org.apache.xmlbeans.XmlString xgetTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFONO$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "telefono" element
     */
    public boolean isSetTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEFONO$54) != 0;
        }
    }
    
    /**
     * Sets the "telefono" element
     */
    public void setTelefono(java.lang.String telefono)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFONO$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEFONO$54);
            }
            target.setStringValue(telefono);
        }
    }
    
    /**
     * Sets (as xml) the "telefono" element
     */
    public void xsetTelefono(org.apache.xmlbeans.XmlString telefono)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEFONO$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEFONO$54);
            }
            target.set(telefono);
        }
    }
    
    /**
     * Unsets the "telefono" element
     */
    public void unsetTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEFONO$54, 0);
        }
    }
    
    /**
     * Gets the "nro_asociado" element
     */
    public java.lang.String getNroAsociado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROASOCIADO$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nro_asociado" element
     */
    public org.apache.xmlbeans.XmlString xgetNroAsociado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NROASOCIADO$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "nro_asociado" element
     */
    public boolean isSetNroAsociado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NROASOCIADO$56) != 0;
        }
    }
    
    /**
     * Sets the "nro_asociado" element
     */
    public void setNroAsociado(java.lang.String nroAsociado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROASOCIADO$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROASOCIADO$56);
            }
            target.setStringValue(nroAsociado);
        }
    }
    
    /**
     * Sets (as xml) the "nro_asociado" element
     */
    public void xsetNroAsociado(org.apache.xmlbeans.XmlString nroAsociado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NROASOCIADO$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NROASOCIADO$56);
            }
            target.set(nroAsociado);
        }
    }
    
    /**
     * Unsets the "nro_asociado" element
     */
    public void unsetNroAsociado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NROASOCIADO$56, 0);
        }
    }
}
