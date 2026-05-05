package DAO;

import enums.TipoMidia;
import model.Anexo;
import model.Denuncia;
import views.MainAnexo;

import java.util.HashSet;
import java.util.Set;

public class AnexoDAO {
    public Anexo escolher(){
        Set<TipoMidia> tipoMidias;
        MainAnexo mainAnexo = new MainAnexo();
        Anexo anexo;

        tipoMidias = mainAnexo.main();
        anexo = new Anexo(tipoMidias);
        return anexo;
    }

    public void editar(Denuncia denuncia){
        MainAnexo mainAnexo = new MainAnexo();
        Anexo anexo;
        Set<TipoMidia> tipoMidias;

        anexo = denuncia.getAnexo();
        tipoMidias = mainAnexo.main();
        anexo.setTipoMidias(tipoMidias);
    }
}
