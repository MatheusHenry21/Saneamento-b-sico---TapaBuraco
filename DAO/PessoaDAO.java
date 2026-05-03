package DAO;

import model.Denunciante;
import model.Pessoa;
import utils.ScannerUtil;
import views.MainDenunciante;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> usuarios;
    private Pessoa novoUsuario;
    private ScannerUtil sc;

    public PessoaDAO(){
        usuarios = new ArrayList<>();
        sc = new ScannerUtil();
    }

    public void cadastrar(String nome, String email, String senha, String celular, String cpf){
        this.novoUsuario = new Denunciante(nome, email, senha, celular, cpf);
        usuarios.add(novoUsuario);
    }

    public Pessoa buscarPorEmail(String email){
        for(Pessoa p: usuarios){
            if(p.getEmail().equals(email)){
               return p;
            }
        }
        return null;
    }

    public void atualizarSenha(String email){
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return;
        }

        String novaSenha = sc.senha();
        p.setSenha(novaSenha);
    }

    public void realizarLogin(String email, String senha){
        MainDenunciante mainDenunciante = new MainDenunciante();
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return;
        }

        if (!p.getSenha().equals(senha)){
            return;
        }
        mainDenunciante.main(p);
    }
}
