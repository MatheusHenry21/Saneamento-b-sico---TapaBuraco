package views;

import model.*;

public class Main {
    public static void main(String[] args) {
        Denunciante denunciante = new Denunciante();
        Denuncia denuncia = new Denuncia();

        denuncia.registrarDenuncia();
        denunciante.enviarDenuncia(denuncia);
    }
}