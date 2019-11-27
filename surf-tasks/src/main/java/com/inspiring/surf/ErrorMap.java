package com.inspiring.surf;

public enum ErrorMap {

    ERROR_0001("IEP_CLARO_0001", "Usuario ou senha em branco"),
    ERROR_0002("IEP_CLARO_0002", "Mensagem vazia ou em branco"),
    ERROR_0003("IEP_CLARO_0003", "Destinatário vazio ou em branco"),
    ERROR_0004("IEP_CLARO_0004", "Configuração de envio SMS ausente"),
    ERROR_0005("IEP_CLARO_0005", "Sistema não pode acessar a torpedeira"),
    ERROR_0006("IEP_CLARO_0006", "Não foi possível enviar a mensagem");



    private String code;

    private String message;

    ErrorMap(String code, String message) {
        this.code = code;
        this.message = message;
    }

    ErrorMap(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
