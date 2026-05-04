package model;

import enums.TipoMidia;
import utils.DateTimeUtil;
import utils.Feedbacks;
import utils.ScannerUtil;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Anexo {
    private int id;
    private String dataEnvio;
    private Set<TipoMidia> tipoMidias;

    public Anexo(Set<TipoMidia> tipoMidia){
        dataEnvio = DateTimeUtil.formatarData(DateTimeUtil.DATE_TIME_FORMAT);
        this.tipoMidias = new HashSet<>(tipoMidia);
    }
}