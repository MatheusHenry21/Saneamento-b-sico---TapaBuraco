package DAO;

import enums.TipoDenuncia;
import model.Denuncia;
import views.MainTipoDenuncia;

public class TipoDenunciaDAO {

    public TipoDenuncia escolher(){
        MainTipoDenuncia mainTipoDenunciante = new MainTipoDenuncia();
        return mainTipoDenunciante.inicia();
    }

    public void editar(Denuncia denuncia){
        MainTipoDenuncia mainTipoDenunciante = new MainTipoDenuncia();
        TipoDenuncia tipo = mainTipoDenunciante.inicia();
        denuncia.setTipoDenuncia(tipo);
    }
}
