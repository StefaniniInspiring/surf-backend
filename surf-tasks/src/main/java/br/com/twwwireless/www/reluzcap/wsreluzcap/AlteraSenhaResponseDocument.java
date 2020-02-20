/*
 * An XML document type.
 * Localname: AlteraSenhaResponse
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one AlteraSenhaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface AlteraSenhaResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlteraSenhaResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("alterasenharesponse2029doctype");
    
    /**
     * Gets the "AlteraSenhaResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse getAlteraSenhaResponse();
    
    /**
     * Sets the "AlteraSenhaResponse" element
     */
    void setAlteraSenhaResponse(br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse alteraSenhaResponse);
    
    /**
     * Appends and returns a new empty "AlteraSenhaResponse" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse addNewAlteraSenhaResponse();
    
    /**
     * An XML AlteraSenhaResponse(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface AlteraSenhaResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlteraSenhaResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("alterasenharesponsec152elemtype");
        
        /**
         * Gets the "AlteraSenhaResult" element
         */
        boolean getAlteraSenhaResult();
        
        /**
         * Gets (as xml) the "AlteraSenhaResult" element
         */
        org.apache.xmlbeans.XmlBoolean xgetAlteraSenhaResult();
        
        /**
         * Sets the "AlteraSenhaResult" element
         */
        void setAlteraSenhaResult(boolean alteraSenhaResult);
        
        /**
         * Sets (as xml) the "AlteraSenhaResult" element
         */
        void xsetAlteraSenhaResult(org.apache.xmlbeans.XmlBoolean alteraSenhaResult);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument.AlteraSenhaResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.AlteraSenhaResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
