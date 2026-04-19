package model;

public class Pessoa {
    protected String nome;
    protected int id;
    protected String senha;

    public void logar() {
        System.out.println("Usuário logado");
    }

    public void cadastrar() {
        System.out.println("Usuário cadastrado");
    }
}