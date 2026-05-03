package DAO;

import model.Administrador;
import model.Denunciante;
import model.Pessoa;
import utils.Feedbacks;
import utils.ScannerUtil;
import views.MainDenunciante;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> usuarios;
    private Pessoa novoUsuario;
    private ScannerUtil sc;
    private Feedbacks feedbacks;

    public PessoaDAO(){
        usuarios = new ArrayList<>();

        Pessoa adm = new Administrador("ADM", "admin123@gmail.com", "admin123");
        usuarios.add(adm);

        sc = new ScannerUtil();
        feedbacks = new Feedbacks();
    }

    public void cadastrar(String nome, String email, String senha, String celular, String cpf){
        this.novoUsuario = new Denunciante(nome, email, senha, celular, cpf);
        usuarios.add(novoUsuario);
        feedbacks.cadastroSucesso();
    }

    public Pessoa buscarPorEmail(String email){
        for(Pessoa p: usuarios){
            if(p.getEmail().equals(email)){
               return p;
            }
        }
        feedbacks.erroLocalizarEmail();
        return null;
    }

    public void atualizarSenha(String email){
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return;
        }

        String novaSenha = sc.novaSenha();
        p.setSenha(novaSenha);
        feedbacks.alteracaoSucesso();
    }

    public void realizarLogin(String email, String senha){
        MainDenunciante mainDenunciante = new MainDenunciante();
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return;
        }

        if (!p.getSenha().equals(senha)){
            feedbacks.senhaIncorreta();
            return;
        }
        mainDenunciante.main(p);
    }
}
