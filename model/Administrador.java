package model;

import enums.StatusDenuncia;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Pessoa {
    private Boolean nivelAcesso = true;

    public Boolean validarDenuncia(Denuncia denuncia){
        return true;
    }

    public void alterarStatus(Denuncia denuncia, StatusDenuncia statusDenuncia){
        return;
    }

    public List<Denuncia> listarDenuncia(String filtro){
        return new ArrayList<>();
    }
}