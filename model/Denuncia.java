package model;

import java.util.Date;

public class Denuncia {
    private int id;
    private Date data;
    private Localizacao localizacao;
    private Anexo anexo;
    private TipoDenuncia tipo;
    private String descricao;
    private Status status;

    public void registrarDenuncia() {
        System.out.println("Denúncia registrada!");
    }

    public String toString() {
        return "Denuncia{id=" + id + ", descricao='" + descricao + "', status=" + status + "}";
    }
}