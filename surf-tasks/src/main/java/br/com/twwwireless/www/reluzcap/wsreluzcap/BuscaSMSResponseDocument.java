/*
 * An XML document type.
 * Localname: BuscaSMSResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one BuscaSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface BuscaSMSResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsresponsea8e6doctype");
    
    /**
     * Gets the "BuscaSMSResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse getBuscaSMSResponse();
    
    /**
     * Sets the "BuscaSMSResponse" element
     */
    void setBuscaSMSResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse buscaSMSResponse);
    
    /**
     * Appends and returns a new empty "BuscaSMSResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse addNewBuscaSMSResponse();
    
    /**
     * An XML BuscaSMSResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface BuscaSMSResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsresponse0a9eelemtype");
        
        /**
         * Gets the "BuscaSMSResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult getBuscaSMSResult();
        
        /**
         * True if has "BuscaSMSResult" element
         */
        boolean isSetBuscaSMSResult();
        
        /**
         * Sets the "BuscaSMSResult" element
         */
        void setBuscaSMSResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult buscaSMSResult);
        
        /**
         * Appends and returns a new empty "BuscaSMSResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult addNewBuscaSMSResult();
        
        /**
         * Unsets the "BuscaSMSResult" element
         */
        void unsetBuscaSMSResult();
        
        /**
         * An XML BuscaSMSResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public interface BuscaSMSResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsresult30caelemtype");
            
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
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult newInstance() {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse.BuscaSMSResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument.BuscaSMSResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}