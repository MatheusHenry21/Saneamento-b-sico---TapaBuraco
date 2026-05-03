package model;

import enums.StatusDenuncia;
import enums.TipoDenuncia;

import java.util.Date;

public class Denuncia {
    private int id;
    private Denunciante denunciante;
    private String dataCriacao;
    private String dataAtualizacao;
    private Localizacao localizacao;
    private String descricao;
    private Anexo anexo;
    private TipoDenuncia tipoDenuncia;
    private StatusDenuncia statusDenuncia;

    public Denuncia(String dataCriacao, Localizacao localizacao, String descricao, Anexo anexo, TipoDenuncia tipoDenuncia, StatusDenuncia statusDenuncia){
        this.dataCriacao = dataCriacao;
        this.localizacao = localizacao;
        this.descricao = descricao;
        this.anexo = anexo;
        this.tipoDenuncia = tipoDenuncia;
        this.statusDenuncia = statusDenuncia;
    }

    public void registrar(String dados){
        return;
    }

    public void atualizarInformacoes(String dados){
        return;
    }

    public void alterarStatus(StatusDenuncia statusDenuncia){
        return;
    }
}