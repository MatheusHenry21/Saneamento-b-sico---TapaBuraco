package DAO;

import enums.TipoDenuncia;
import views.MainTipoDenuncia;

public class TipoDenunciaDAO {
    private static MainTipoDenuncia mainTipoDenunciante;

    public static TipoDenuncia escolher(){
        return mainTipoDenunciante.main();
    }
}
