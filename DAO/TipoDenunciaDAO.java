package DAO;

import enums.TipoDenuncia;
import model.Denuncia;
import views.MainTipoDenuncia;

public class TipoDenunciaDAO {
    private static MainTipoDenuncia mainTipoDenunciante;
    private static TipoDenuncia tipoDenuncia;
    private static Denuncia denuncia;

    public static TipoDenuncia escolher(){
        return mainTipoDenunciante.main();
    }

    public static void editar(Denuncia denuncia){
        tipoDenuncia = mainTipoDenunciante.main();
        denuncia.setTipoDenuncia(tipoDenuncia);
    }
}
