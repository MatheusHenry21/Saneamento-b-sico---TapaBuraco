package model;

import enums.StatusDenuncia;
import enums.TipoDenuncia;

import java.util.Date;

public class Denuncia {
    private int id;
    private Denunciante denunciante;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private Localizacao localizacao;
    private String descricao;
    private Anexo anexo;
    private TipoDenuncia tipoDenuncia;
    private StatusDenuncia status;

    public void registrarDenuncia() {
        System.out.println("Denúncia registrada!");
    }

    public String toString() {
        return "Denuncia{id=" + id + ", descricao='" + descricao + "', status=" + status + "}";
    }
}