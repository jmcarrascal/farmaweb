/*
 * XML Type:  sendMedicamentosDHSerie
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosDHSerie
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business;


/**
 * An XML sendMedicamentosDHSerie(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public interface SendMedicamentosDHSerie extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendMedicamentosDHSerie.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BFE837F2A3DE9C801E519DB3CAAAC57").resolveHandle("sendmedicamentosdhserie2b02type");
    
    /**
     * Gets array of all "arg0" elements
     */
    com.inssjp.mywebservice.business.MedicamentosDTODHSerie[] getArg0Array();
    
    /**
     * Gets ith "arg0" element
     */
    com.inssjp.mywebservice.business.MedicamentosDTODHSerie getArg0Array(int i);
    
    /**
     * Returns number of "arg0" element
     */
    int sizeOfArg0Array();
    
    /**
     * Sets array of all "arg0" element
     */
    void setArg0Array(com.inssjp.mywebservice.business.MedicamentosDTODHSerie[] arg0Array);
    
    /**
     * Sets ith "arg0" element
     */
    void setArg0Array(int i, com.inssjp.mywebservice.business.MedicamentosDTODHSerie arg0);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arg0" element
     */
    com.inssjp.mywebservice.business.MedicamentosDTODHSerie insertNewArg0(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arg0" element
     */
    com.inssjp.mywebservice.business.MedicamentosDTODHSerie addNewArg0();
    
    /**
     * Removes the ith "arg0" element
     */
    void removeArg0(int i);
    
    /**
     * Gets the "arg1" element
     */
    java.lang.String getArg1();
    
    /**
     * Gets (as xml) the "arg1" element
     */
    org.apache.xmlbeans.XmlString xgetArg1();
    
    /**
     * True if has "arg1" element
     */
    boolean isSetArg1();
    
    /**
     * Sets the "arg1" element
     */
    void setArg1(java.lang.String arg1);
    
    /**
     * Sets (as xml) the "arg1" element
     */
    void xsetArg1(org.apache.xmlbeans.XmlString arg1);
    
    /**
     * Unsets the "arg1" element
     */
    void unsetArg1();
    
    /**
     * Gets the "arg2" element
     */
    java.lang.String getArg2();
    
    /**
     * Gets (as xml) the "arg2" element
     */
    org.apache.xmlbeans.XmlString xgetArg2();
    
    /**
     * True if has "arg2" element
     */
    boolean isSetArg2();
    
    /**
     * Sets the "arg2" element
     */
    void setArg2(java.lang.String arg2);
    
    /**
     * Sets (as xml) the "arg2" element
     */
    void xsetArg2(org.apache.xmlbeans.XmlString arg2);
    
    /**
     * Unsets the "arg2" element
     */
    void unsetArg2();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie newInstance() {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.SendMedicamentosDHSerie parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.SendMedicamentosDHSerie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
