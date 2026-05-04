package DAO;

import model.Administrador;
import model.Denunciante;
import model.Pessoa;
import utils.Feedbacks;
import utils.ScannerUtil;
import views.MainAdministrador;
import views.MainDenunciante;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> usuarios;
    private Pessoa novoUsuario;

    public PessoaDAO(){
        usuarios = new ArrayList<>();

        Pessoa adm = new Administrador("ADM", "admin123@gmail.com", "admin123");
        usuarios.add(adm);
    }

    public void cadastrar(String nome, String email, String senha, String celular, String cpf, String cep){
        this.novoUsuario = new Denunciante(nome, email, senha, celular, cpf, cep);
        usuarios.add(novoUsuario);
        Feedbacks.cadastroSucesso();
    }

    public Pessoa buscarPorEmail(String email){
        for(Pessoa p: usuarios){
            if(p.getEmail().equals(email)){
               return p;
            }
        }
        Feedbacks.erroLocalizarEmail();
        return null;
    }

    public void atualizarSenha(String email){
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return;
        }

        String novaSenha = ScannerUtil.novaSenha();
        p.setSenha(novaSenha);
        Feedbacks.alteracaoSucesso();
    }

    public void realizarLogin(String email, String senha){
        MainDenunciante mainDenunciante = new MainDenunciante();
        MainAdministrador mainAdministrador = new MainAdministrador();
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return;
        }

        if (!p.getSenha().equals(senha)){
            Feedbacks.senhaIncorreta();
            return;
        }

        if (p.getAcesso()){
            mainAdministrador.main();
        }

        if(!p.getAcesso()){
            mainDenunciante.main((Denunciante) p);
        }
    }
}
