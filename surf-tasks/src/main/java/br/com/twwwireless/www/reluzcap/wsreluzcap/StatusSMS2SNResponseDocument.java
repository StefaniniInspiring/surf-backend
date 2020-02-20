/*
 * An XML document type.
 * Localname: StatusSMS2SNResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one StatusSMS2SNResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface StatusSMS2SNResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusSMS2SNResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("statussms2snresponseeb7bdoctype");
    
    /**
     * Gets the "StatusSMS2SNResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse getStatusSMS2SNResponse();
    
    /**
     * Sets the "StatusSMS2SNResponse" element
     */
    void setStatusSMS2SNResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse statusSMS2SNResponse);
    
    /**
     * Appends and returns a new empty "StatusSMS2SNResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse addNewStatusSMS2SNResponse();
    
    /**
     * An XML StatusSMS2SNResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface StatusSMS2SNResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusSMS2SNResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("statussms2snresponse8f7eelemtype");
        
        /**
         * Gets the "StatusSMS2SNResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult getStatusSMS2SNResult();
        
        /**
         * True if has "StatusSMS2SNResult" element
         */
        boolean isSetStatusSMS2SNResult();
        
        /**
         * Sets the "StatusSMS2SNResult" element
         */
        void setStatusSMS2SNResult(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult statusSMS2SNResult);
        
        /**
         * Appends and returns a new empty "StatusSMS2SNResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult addNewStatusSMS2SNResult();
        
        /**
         * Unsets the "StatusSMS2SNResult" element
         */
        void unsetStatusSMS2SNResult();
        
        /**
         * An XML StatusSMS2SNResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public interface StatusSMS2SNResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusSMS2SNResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("statussms2snresult583felemtype");
            
            /**
             * Gets the "schema" element
             */
            org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema();
            
            /**
             * Sets the "schema" element
             */
            void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema);
            
            /**
             * Appends and returns a new empty "schema" element
             */
            org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult newInstance() {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse.StatusSMS2SNResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument.StatusSMS2SNResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMS2SNResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
