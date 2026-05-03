package DAO;

import model.Denuncia;

import java.util.ArrayList;

public class DenunciaDAO{
    private ArrayList<Denuncia> denuncias;

    public void cadastrar(Denuncia denuncia){
        this.denuncias.add(denuncia);
    }
}
