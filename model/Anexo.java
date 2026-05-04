package model;

import enums.TipoMidia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Anexo {
    private int id;
    private Date dataEnvio;
    private Set<TipoMidia> tipoMidias = new HashSet<>();

    public Set<TipoMidia> getTipoMidias() {
        return tipoMidias;
    }
}