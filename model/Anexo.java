package model;

import enums.TipoMidia;
import utils.DateTimeUtil;
import java.util.HashSet;
import java.util.Set;

public class Anexo {
    private static int num;
    private int id;
    private String dataEnvio;
    private Set<TipoMidia> tipoMidias;

    public Anexo(Set<TipoMidia> tipoMidia){
        this.id = ++ num;
        dataEnvio = DateTimeUtil.formatarData(DateTimeUtil.DATE_TIME_FORMAT);
        this.tipoMidias = new HashSet<>(tipoMidia);
    }

    public void setTipoMidias(Set<TipoMidia> tipoMidias) {
        this.tipoMidias = new HashSet<>(tipoMidias);
    }

    public Set<TipoMidia> getTipoMidias() {
        return tipoMidias;
    }

    public int getId() {
        return id;
    }
}