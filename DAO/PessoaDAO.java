package DAO;

import model.Denunciante;
import model.Pessoa;
import utils.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaDAO {
    ArrayList<Pessoa> usuarios;
    Pessoa novoUsuario;
    ScannerUtil sc;

    public void cadastrar(String nome, String email, String senha, String celular, String cpf){
        this.novoUsuario = new Denunciante(nome, email, senha, celular, cpf);
        usuarios.add(novoUsuario);
    }

    public Pessoa buscarPorEmail(String email){
        for(Pessoa p: usuarios){
            if(!p.getEmail().equals(email)){
               return null;
            }
            return p;
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

    public Pessoa realizarLogin(String email, String senha){
        Pessoa p = buscarPorEmail(email);
        if (p == null){
            return null;
        }

        if (!p.getSenha().equals(senha)){
            return null;
        }

        return p;
    }
}
