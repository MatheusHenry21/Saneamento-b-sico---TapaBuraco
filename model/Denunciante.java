package model;

public class Denunciante extends Pessoa {
    private String celular;
    private String cpf;
    private String email;

    public void enviarDenuncia(Denuncia denuncia) {
        System.out.println("Denúncia enviada: " + denuncia);
    }
}