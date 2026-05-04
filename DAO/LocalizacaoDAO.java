package DAO;

import model.Denuncia;
import model.Localizacao;
import model.Pessoa;

public class LocalizacaoDAO {
    Localizacao localizacao;

    public Localizacao cadastrar(String bairro, String rua, String numero, String cep, String referencia){
        return new Localizacao(bairro, rua, numero, cep, referencia);
    }

    public void editar(Denuncia denuncia, String bairro, String rua, String numero, String cep, String referencia){
        localizacao = denuncia.getLocalizacao();
        localizacao.setBairro(bairro);
        localizacao.setRua(rua);
        localizacao.setNumero(numero);
        localizacao.setCep(cep);
        localizacao.setReferencia(referencia);
    }
}
