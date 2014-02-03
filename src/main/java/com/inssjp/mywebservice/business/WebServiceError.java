/*
 * XML Type:  webServiceError
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.WebServiceError
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business;


/**
 * An XML webServiceError(@http://business.mywebservice.inssjp.com/).
 *
 * This is a complex type.
 */
public interface WebServiceError extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebServiceError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BFE837F2A3DE9C801E519DB3CAAAC57").resolveHandle("webserviceerror800etype");
    
    /**
     * Gets the "_c_error" element
     */
    java.lang.String getCError();
    
    /**
     * Gets (as xml) the "_c_error" element
     */
    org.apache.xmlbeans.XmlString xgetCError();
    
    /**
     * True if has "_c_error" element
     */
    boolean isSetCError();
    
    /**
     * Sets the "_c_error" element
     */
    void setCError(java.lang.String cError);
    
    /**
     * Sets (as xml) the "_c_error" element
     */
    void xsetCError(org.apache.xmlbeans.XmlString cError);
    
    /**
     * Unsets the "_c_error" element
     */
    void unsetCError();
    
    /**
     * Gets the "_d_error" element
     */
    java.lang.String getDError();
    
    /**
     * Gets (as xml) the "_d_error" element
     */
    org.apache.xmlbeans.XmlString xgetDError();
    
    /**
     * True if has "_d_error" element
     */
    boolean isSetDError();
    
    /**
     * Sets the "_d_error" element
     */
    void setDError(java.lang.String dError);
    
    /**
     * Sets (as xml) the "_d_error" element
     */
    void xsetDError(org.apache.xmlbeans.XmlString dError);
    
    /**
     * Unsets the "_d_error" element
     */
    void unsetDError();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.inssjp.mywebservice.business.WebServiceError newInstance() {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.inssjp.mywebservice.business.WebServiceError parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.WebServiceError parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.WebServiceError parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.WebServiceError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
