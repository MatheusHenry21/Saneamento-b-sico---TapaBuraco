package model;

public class Administrador extends Pessoa {
    public Administrador(String nome, String email, String senha){
        super(nome, email, senha);
        setAcesso();
    }
}