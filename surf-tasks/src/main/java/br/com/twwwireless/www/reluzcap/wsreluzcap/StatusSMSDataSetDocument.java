/*
 * An XML document type.
 * Localname: StatusSMSDataSet
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one StatusSMSDataSet(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface StatusSMSDataSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusSMSDataSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("statussmsdataset3f71doctype");
    
    /**
     * Gets the "StatusSMSDataSet" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet getStatusSMSDataSet();
    
    /**
     * Sets the "StatusSMSDataSet" element
     */
    void setStatusSMSDataSet(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet statusSMSDataSet);
    
    /**
     * Appends and returns a new empty "StatusSMSDataSet" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet addNewStatusSMSDataSet();
    
    /**
     * An XML StatusSMSDataSet(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface StatusSMSDataSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusSMSDataSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("statussmsdatasetb0beelemtype");
        
        /**
         * Gets the "NumUsu" element
         */
        java.lang.String getNumUsu();
        
        /**
         * Gets (as xml) the "NumUsu" element
         */
        org.apache.xmlbeans.XmlString xgetNumUsu();
        
        /**
         * True if has "NumUsu" element
         */
        boolean isSetNumUsu();
        
        /**
         * Sets the "NumUsu" element
         */
        void setNumUsu(java.lang.String numUsu);
        
        /**
         * Sets (as xml) the "NumUsu" element
         */
        void xsetNumUsu(org.apache.xmlbeans.XmlString numUsu);
        
        /**
         * Unsets the "NumUsu" element
         */
        void unsetNumUsu();
        
        /**
         * Gets the "Senha" element
         */
        java.lang.String getSenha();
        
        /**
         * Gets (as xml) the "Senha" element
         */
        org.apache.xmlbeans.XmlString xgetSenha();
        
        /**
         * True if has "Senha" element
         */
        boolean isSetSenha();
        
        /**
         * Sets the "Senha" element
         */
        void setSenha(java.lang.String senha);
        
        /**
         * Sets (as xml) the "Senha" element
         */
        void xsetSenha(org.apache.xmlbeans.XmlString senha);
        
        /**
         * Unsets the "Senha" element
         */
        void unsetSenha();
        
        /**
         * Gets the "DS" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS getDS();
        
        /**
         * True if has "DS" element
         */
        boolean isSetDS();
        
        /**
         * Sets the "DS" element
         */
        void setDS(br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS ds);
        
        /**
         * Appends and returns a new empty "DS" element
         */
        br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS addNewDS();
        
        /**
         * Unsets the "DS" element
         */
        void unsetDS();
        
        /**
         * An XML DS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
         *
         * This is a complex type.
         */
        public interface DS extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("ds93f3elemtype");
            
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
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS newInstance() {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet.DS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument.StatusSMSDataSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.StatusSMSDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
