package DAO;

import enums.TipoMidia;
import model.Anexo;
import views.MainAnexo;

import java.util.Set;

public class AnexoDAO {
    private static Anexo anexo;
    private static MainAnexo mainAnexo;
    private static Set<TipoMidia> tipoMidias;

    public static Anexo escolher(){
        tipoMidias = mainAnexo.main();
        anexo = new Anexo(tipoMidias);
        return anexo;
    }
}
