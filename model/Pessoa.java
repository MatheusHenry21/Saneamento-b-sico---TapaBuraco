package model;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public void logar() {
        System.out.println("Usuário logado");
    }

    public void cadastrar() {
        System.out.println("Usuário cadastrado");
    }
}