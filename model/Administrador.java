package model;

import enums.StatusDenuncia;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Pessoa {
    public Administrador(String nome, String email, String senha){
        super(nome, email, senha);
        setAcesso();
    }

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