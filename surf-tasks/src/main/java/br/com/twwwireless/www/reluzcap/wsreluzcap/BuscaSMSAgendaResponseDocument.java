/*
 * An XML document type.
 * Localname: BuscaSMSAgendaResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one BuscaSMSAgendaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface BuscaSMSAgendaResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSAgendaResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsagendaresponseac3adoctype");
    
    /**
     * Gets the "BuscaSMSAgendaResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse getBuscaSMSAgendaResponse();
    
    /**
     * Sets the "BuscaSMSAgendaResponse" element
     */
    void setBuscaSMSAgendaResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse buscaSMSAgendaResponse);
    
    /**
     * Appends and returns a new empty "BuscaSMSAgendaResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse addNewBuscaSMSAgendaResponse();
    
    /**
     * An XML BuscaSMSAgendaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface BuscaSMSAgendaResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSAgendaResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsagendaresponse13deelemtype");
        
        /**
         * Gets the "BuscaSMSAgendaResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult getBuscaSMSAgendaResult();
        
        /**
         * True if has "BuscaSMSAgendaResult" element
         */
        boolean isSetBuscaSMSAgendaResult();
        
        /**
         * Sets the "BuscaSMSAgendaResult" element
         */
        void setBuscaSMSAgendaResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult buscaSMSAgendaResult);
        
        /**
         * Appends and returns a new empty "BuscaSMSAgendaResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult addNewBuscaSMSAgendaResult();
        
        /**
         * Unsets the "BuscaSMSAgendaResult" element
         */
        void unsetBuscaSMSAgendaResult();
        
        /**
         * An XML BuscaSMSAgendaResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public interface BuscaSMSAgendaResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSAgendaResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsagendaresultfe9eelemtype");
            
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
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult newInstance() {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse.BuscaSMSAgendaResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument.BuscaSMSAgendaResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
