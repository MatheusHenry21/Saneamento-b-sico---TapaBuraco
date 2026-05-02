package views;

import DAO.PessoaDAO;
import model.*;
import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {

        ScannerUtil sc = new ScannerUtil();
        PessoaDAO daoPessoa = new PessoaDAO();

        int opcao;
        String nome;
        String email;
        String senha;
        String celular;
        String cpf;

        Administrador adm = new Administrador("ADM", "admin123@gmail.com", "admin123");

        do {
            System.out.println("Bem-vindo ao Tapa Buraco\n");
            System.out.println("1 - Efetuar login");
            System.out.println("2 - Realizar cadastro");
            System.out.println("3 - Esqueci a senha");
            System.out.println("4 - Sair");

            opcao = sc.opcao();

            switch (opcao){
                case 1:
                    email = sc.email();
                    senha = sc.senha();

                    daoPessoa.realizarLogin(email, senha);
                case 2:
                    nome = sc.nome();
                    email = sc.email();
                    senha = sc.senha();
                    celular = sc.celular();
                    cpf = sc.cpf();

                    daoPessoa.cadastrar(nome, email, senha, celular, cpf);
                case 3:
                    email = sc.email();

                    daoPessoa.atualizarSenha(email);
            }

        }while(opcao != 3);
        System.out.println("\nSaindo... até logo!");

    }
}