package model;

public class Denunciante extends Pessoa {
    private String celular;
    private String cpf;
    private String cep;

    public Denunciante(String nome, String email, String senha, String celular, String cpf, String cep){
        super(nome, email, senha);
        this.celular = celular;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
}