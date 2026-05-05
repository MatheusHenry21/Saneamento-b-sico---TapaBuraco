package model;

public class Localizacao {
    private static int num;
    private int id;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;
    private String referencia;

    public Localizacao(String bairro, String rua, String numero, String cep, String referencia){
        this.id = ++num;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.referencia = referencia;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getRua() {
        return rua;
    }
}