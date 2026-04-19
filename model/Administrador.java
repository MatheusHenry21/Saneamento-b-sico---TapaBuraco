package model;

public class Administrador extends Pessoa {
    public void gerenciarDenuncia(Denuncia denuncia) {
        System.out.println("Gerenciando denúncia: " + denuncia);
    }
}