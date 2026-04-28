package model;

public class Denunciante extends Pessoa {
    private String celular;
    private String cpf;

    public Denunciante(String nome, String email, String senha, String celular, String cpf){
        super(nome, email, senha);
        this.celular = celular;
        this.cpf = cpf;
    }
}