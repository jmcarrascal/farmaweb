/*
 * XML Type:  webServiceResult
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.WebServiceResult
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business;


/**
 * An XML webServiceResult(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public interface WebServiceResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebServiceResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BFE837F2A3DE9C801E519DB3CAAAC57").resolveHandle("webserviceresult61c5type");
    
    /**
     * Gets the "codigoTransaccion" element
     */
    java.lang.String getCodigoTransaccion();
    
    /**
     * Gets (as xml) the "codigoTransaccion" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoTransaccion();
    
    /**
     * True if has "codigoTransaccion" element
     */
    boolean isSetCodigoTransaccion();
    
    /**
     * Sets the "codigoTransaccion" element
     */
    void setCodigoTransaccion(java.lang.String codigoTransaccion);
    
    /**
     * Sets (as xml) the "codigoTransaccion" element
     */
    void xsetCodigoTransaccion(org.apache.xmlbeans.XmlString codigoTransaccion);
    
    /**
     * Unsets the "codigoTransaccion" element
     */
    void unsetCodigoTransaccion();
    
    /**
     * Gets array of all "errores" elements
     */
    com.inssjp.mywebservice.business.WebServiceError[] getErroresArray();
    
    /**
     * Gets ith "errores" element
     */
    com.inssjp.mywebservice.business.WebServiceError getErroresArray(int i);
    
    /**
     * Tests for nil ith "errores" element
     */
    boolean isNilErroresArray(int i);
    
    /**
     * Returns number of "errores" element
     */
    int sizeOfErroresArray();
    
    /**
     * Sets array of all "errores" element
     */
    void setErroresArray(com.inssjp.mywebservice.business.WebServiceError[] erroresArray);
    
    /**
     * Sets ith "errores" element
     */
    void setErroresArray(int i, com.inssjp.mywebservice.business.WebServiceError errores);
    
    /**
     * Nils the ith "errores" element
     */
    void setNilErroresArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errores" element
     */
    com.inssjp.mywebservice.business.WebServiceError insertNewErrores(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errores" element
     */
    com.inssjp.mywebservice.business.WebServiceError addNewErrores();
    
    /**
     * Removes the ith "errores" element
     */
    void removeErrores(int i);
    
    /**
     * Gets the "resultado" element
     */
    boolean getResultado();
    
    /**
     * Gets (as xml) the "resultado" element
     */
    org.apache.xmlbeans.XmlBoolean xgetResultado();
    
    /**
     * True if has "resultado" element
     */
    boolean isSetResultado();
    
    /**
     * Sets the "resultado" element
     */
    void setResultado(boolean resultado);
    
    /**
     * Sets (as xml) the "resultado" element
     */
    void xsetResultado(org.apache.xmlbeans.XmlBoolean resultado);
    
    /**
     * Unsets the "resultado" element
     */
    void unsetResultado();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.inssjp.mywebservice.business.WebServiceResult newInstance() {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.WebServiceResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.WebServiceResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.WebServiceResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
