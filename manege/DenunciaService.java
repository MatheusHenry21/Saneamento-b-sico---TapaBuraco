package manege;

import enums.StatusDenuncia;
import model.Denuncia;

import java.util.ArrayList;
import java.util.List;

public class DenunciaService {
    public Denuncia registarDenuncia(String dados){
        return new Denuncia();
    }

    public Denuncia atualizarDenuncia(String dados){
        return new Denuncia();
    }

    public void alterarStatus(int id, StatusDenuncia statusDenuncia){
        return;
    }

    public List<Denuncia> listarDenuncias(String filtros){
        return new ArrayList<>();
    }

}
