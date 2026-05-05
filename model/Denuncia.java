package model;

import enums.StatusDenuncia;
import enums.TipoDenuncia;

public class Denuncia {
    private static int num;
    private int id;
    private Denunciante denunciante;
    private String dataCriacao;
    private String dataAtualizacao;
    private Localizacao localizacao;
    private String descricao;
    private Anexo anexo;
    private TipoDenuncia tipoDenuncia;
    private StatusDenuncia statusDenuncia;

    public Denuncia(Denunciante denunciante, String dataCriacao, Localizacao localizacao, String descricao, Anexo anexo, TipoDenuncia tipoDenuncia, StatusDenuncia statusDenuncia){
        this.id = ++ num;
        this.denunciante = denunciante;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataCriacao;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.anexo = anexo;
        this.tipoDenuncia = tipoDenuncia;
        this.statusDenuncia = statusDenuncia;
    }

    public int getId() {
        return id;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public String getData() {
        return dataAtualizacao;
    }

    public TipoDenuncia getTipoDenuncia() {
        return tipoDenuncia;
    }

    public StatusDenuncia getStatusDenuncia() {
        return statusDenuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTipoDenuncia(TipoDenuncia tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}