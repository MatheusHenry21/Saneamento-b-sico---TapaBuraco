package DAO;

import model.Denuncia;
import model.Denunciante;
import model.Localizacao;

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

    public ArrayList<Denuncia> denunciasProximas(Denunciante denunciante){
        ArrayList<Denuncia> denunciasProximas = new ArrayList<>();
        String cepParametro = denunciante.getCep();

        for(Denuncia d : denuncias){
            Localizacao localizacao = d.getLocalizacao();

            if(localizacao.getCep().equals(cepParametro)){
                denunciasProximas.add(d);
            }
        }
        return denunciasProximas;
    }
}
