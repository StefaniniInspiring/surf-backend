/*
 * An XML document type.
 * Localname: BuscaSMSAgendaDataSetResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one BuscaSMSAgendaDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface BuscaSMSAgendaDataSetResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSAgendaDataSetResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsagendadatasetresponsea5c2doctype");
    
    /**
     * Gets the "BuscaSMSAgendaDataSetResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse getBuscaSMSAgendaDataSetResponse();
    
    /**
     * Sets the "BuscaSMSAgendaDataSetResponse" element
     */
    void setBuscaSMSAgendaDataSetResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse buscaSMSAgendaDataSetResponse);
    
    /**
     * Appends and returns a new empty "BuscaSMSAgendaDataSetResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse addNewBuscaSMSAgendaDataSetResponse();
    
    /**
     * An XML BuscaSMSAgendaDataSetResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface BuscaSMSAgendaDataSetResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSAgendaDataSetResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsagendadatasetresponse3e84elemtype");
        
        /**
         * Gets the "BuscaSMSAgendaDataSetResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult getBuscaSMSAgendaDataSetResult();
        
        /**
         * True if has "BuscaSMSAgendaDataSetResult" element
         */
        boolean isSetBuscaSMSAgendaDataSetResult();
        
        /**
         * Sets the "BuscaSMSAgendaDataSetResult" element
         */
        void setBuscaSMSAgendaDataSetResult(br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult buscaSMSAgendaDataSetResult);
        
        /**
         * Appends and returns a new empty "BuscaSMSAgendaDataSetResult" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult addNewBuscaSMSAgendaDataSetResult();
        
        /**
         * Unsets the "BuscaSMSAgendaDataSetResult" element
         */
        void unsetBuscaSMSAgendaDataSetResult();
        
        /**
         * An XML BuscaSMSAgendaDataSetResult(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public interface BuscaSMSAgendaDataSetResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuscaSMSAgendaDataSetResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("buscasmsagendadatasetresult63aaelemtype");
            
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
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult newInstance() {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse.BuscaSMSAgendaDataSetResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument.BuscaSMSAgendaDataSetResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.BuscaSMSAgendaDataSetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}