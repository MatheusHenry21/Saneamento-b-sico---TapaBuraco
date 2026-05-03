package model;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Boolean acesso;

    public Pessoa(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.acesso = false;
    }

    public void setAcesso() {
        this.acesso = !acesso;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}