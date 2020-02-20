/*
 * An XML document type.
 * Localname: EnviaSMS
 * Namespace: https://www.twwwireless.com.br/reluzcap/wsreluzcap
 * Java type: br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.twwwireless.www.reluzcap.wsreluzcap;


/**
 * A document containing one EnviaSMS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap) element.
 *
 * This is a complex type.
 */
public interface EnviaSMSDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnviaSMSDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("enviasms7f8edoctype");
    
    /**
     * Gets the "EnviaSMS" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS getEnviaSMS();
    
    /**
     * Sets the "EnviaSMS" element
     */
    void setEnviaSMS(br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS enviaSMS);
    
    /**
     * Appends and returns a new empty "EnviaSMS" element
     */
    br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS addNewEnviaSMS();
    
    /**
     * An XML EnviaSMS(@https://www.twwwireless.com.br/reluzcap/wsreluzcap).
     *
     * This is a complex type.
     */
    public interface EnviaSMS extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnviaSMS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s43AD81D1A6AF2FC2358F1499CF2C91EA").resolveHandle("enviasms589eelemtype");
        
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
         * Gets the "SeuNum" element
         */
        java.lang.String getSeuNum();
        
        /**
         * Gets (as xml) the "SeuNum" element
         */
        org.apache.xmlbeans.XmlString xgetSeuNum();
        
        /**
         * True if has "SeuNum" element
         */
        boolean isSetSeuNum();
        
        /**
         * Sets the "SeuNum" element
         */
        void setSeuNum(java.lang.String seuNum);
        
        /**
         * Sets (as xml) the "SeuNum" element
         */
        void xsetSeuNum(org.apache.xmlbeans.XmlString seuNum);
        
        /**
         * Unsets the "SeuNum" element
         */
        void unsetSeuNum();
        
        /**
         * Gets the "Celular" element
         */
        java.lang.String getCelular();
        
        /**
         * Gets (as xml) the "Celular" element
         */
        org.apache.xmlbeans.XmlString xgetCelular();
        
        /**
         * True if has "Celular" element
         */
        boolean isSetCelular();
        
        /**
         * Sets the "Celular" element
         */
        void setCelular(java.lang.String celular);
        
        /**
         * Sets (as xml) the "Celular" element
         */
        void xsetCelular(org.apache.xmlbeans.XmlString celular);
        
        /**
         * Unsets the "Celular" element
         */
        void unsetCelular();
        
        /**
         * Gets the "Mensagem" element
         */
        java.lang.String getMensagem();
        
        /**
         * Gets (as xml) the "Mensagem" element
         */
        org.apache.xmlbeans.XmlString xgetMensagem();
        
        /**
         * True if has "Mensagem" element
         */
        boolean isSetMensagem();
        
        /**
         * Sets the "Mensagem" element
         */
        void setMensagem(java.lang.String mensagem);
        
        /**
         * Sets (as xml) the "Mensagem" element
         */
        void xsetMensagem(org.apache.xmlbeans.XmlString mensagem);
        
        /**
         * Unsets the "Mensagem" element
         */
        void unsetMensagem();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS newInstance() {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument.EnviaSMS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument newInstance() {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.twwwireless.www.reluzcap.wsreluzcap.EnviaSMSDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
