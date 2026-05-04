package model;

public class Localizacao {
    private String bairro;
    private String rua;
    private String numero;
    private String cep;
    private String referencia;

    public Localizacao(String bairro, String rua, String numero, String cep, String referencia){
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.referencia = referencia;
    }
}