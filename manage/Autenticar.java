package manage;

import model.Denunciante;
import model.Pessoa;
import utils.ScannerUtil;

public class Autenticar {

    ScannerUtil sc = new ScannerUtil();

    public Pessoa login(){
        return new Pessoa();
    }

    public Denunciante cadastrarDenunciante(){
        String nome = sc.nome();
        String email = sc.email();
        String senha = sc.senha();
        String celular = sc.celular();
        String cpf = sc.cpf();

        return new Denunciante(nome, email, senha, celular, cpf);
    }

    public Pessoa recuperarSenha(String email){
        return new Pessoa();
    }
}
