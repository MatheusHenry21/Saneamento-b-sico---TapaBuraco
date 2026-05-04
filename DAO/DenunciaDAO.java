package DAO;

import model.Denuncia;
import utils.Feedbacks;

import java.util.ArrayList;

public class DenunciaDAO{
    private static ArrayList<Denuncia> denuncias;

    public void cadastrar(Denuncia denuncia){
        this.denuncias.add(denuncia);
    }

    public static Denuncia buscarPorId(int id){
        for(Denuncia d: denuncias){
            if(d.getId() == id){
                return d;
            }
        }
        return null;
    }
}
