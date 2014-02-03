/*
 * An XML document type.
 * Localname: sendMedicamentosResponse
 * Namespace: http://business.mywebservice.inssjp.com/
 * Java type: com.inssjp.mywebservice.business.SendMedicamentosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.inssjp.mywebservice.business;


/**
 * A document containing one sendMedicamentosResponse(@http://business.mywebservice.inssjp.com/) element.
 *
 * This is a complex type.
 */
public interface SendMedicamentosResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendMedicamentosResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BFE837F2A3DE9C801E519DB3CAAAC57").resolveHandle("sendmedicamentosresponse502ddoctype");
    
    /**
     * Gets the "sendMedicamentosResponse" element
     */
    com.inssjp.mywebservice.business.SendMedicamentosResponse getSendMedicamentosResponse();
    
    /**
     * Sets the "sendMedicamentosResponse" element
     */
    void setSendMedicamentosResponse(com.inssjp.mywebservice.business.SendMedicamentosResponse sendMedicamentosResponse);
    
    /**
     * Appends and returns a new empty "sendMedicamentosResponse" element
     */
    com.inssjp.mywebservice.business.SendMedicamentosResponse addNewSendMedicamentosResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument newInstance() {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.inssjp.mywebservice.business.SendMedicamentosResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.inssjp.mywebservice.business.SendMedicamentosResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
