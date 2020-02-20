/*
 * An XML document type.
 * Localname: EnviaSMSAgeResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one EnviaSMSAgeResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface EnviaSMSAgeResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnviaSMSAgeResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("enviasmsageresponse9988doctype");
    
    /**
     * Gets the "EnviaSMSAgeResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse getEnviaSMSAgeResponse();
    
    /**
     * Sets the "EnviaSMSAgeResponse" element
     */
    void setEnviaSMSAgeResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse enviaSMSAgeResponse);
    
    /**
     * Appends and returns a new empty "EnviaSMSAgeResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse addNewEnviaSMSAgeResponse();
    
    /**
     * An XML EnviaSMSAgeResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface EnviaSMSAgeResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnviaSMSAgeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("enviasmsageresponsed2d0elemtype");
        
        /**
         * Gets the "EnviaSMSAgeResult" element
         */
        java.lang.String getEnviaSMSAgeResult();
        
        /**
         * Gets (as xml) the "EnviaSMSAgeResult" element
         */
        org.apache.xmlbeans.XmlString xgetEnviaSMSAgeResult();
        
        /**
         * True if has "EnviaSMSAgeResult" element
         */
        boolean isSetEnviaSMSAgeResult();
        
        /**
         * Sets the "EnviaSMSAgeResult" element
         */
        void setEnviaSMSAgeResult(java.lang.String enviaSMSAgeResult);
        
        /**
         * Sets (as xml) the "EnviaSMSAgeResult" element
         */
        void xsetEnviaSMSAgeResult(org.apache.xmlbeans.XmlString enviaSMSAgeResult);
        
        /**
         * Unsets the "EnviaSMSAgeResult" element
         */
        void unsetEnviaSMSAgeResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument.EnviaSMSAgeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSAgeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
