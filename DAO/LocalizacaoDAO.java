package DAO;

import model.Localizacao;
import model.Pessoa;

public class LocalizacaoDAO {

    public Localizacao cadastrar(String bairro, String rua, String numero, String cep, String referencia){
        return new Localizacao(bairro, rua, numero, cep, referencia);
    }
}
