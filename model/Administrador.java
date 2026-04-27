package model;

public class Administrador extends Pessoa {
    private Boolean nivelAcesso = true;

    public void gerenciarDenuncia(Denuncia denuncia) {
        System.out.println("Gerenciando denúncia: " + denuncia);
    }
}