package views;

import DAO.PessoaDAO;
import model.*;
import utils.Feedbacks;
import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {

        ScannerUtil sc = new ScannerUtil();
        PessoaDAO managerPessoa = new PessoaDAO();
        Feedbacks feedbacks = new Feedbacks();

        int opcao;
        String nome;
        String email;
        String senha;
        String celular;
        String cpf;

        do {
            System.out.println("\n  ---MENU PRINCIPAL---");
            System.out.println("1 - Efetuar login");
            System.out.println("2 - Realizar cadastro");
            System.out.println("3 - Esqueci a senha");
            System.out.println("4 - Sair\n");

            opcao = sc.opcao();
            System.out.println("");

            switch (opcao){
                case 1:
                    email = sc.email();
                    senha = sc.senha();

                    managerPessoa.realizarLogin(email, senha);
                    break;
                case 2:
                    nome = sc.nome();
                    email = sc.email();
                    senha = sc.senha();
                    celular = sc.celular();
                    cpf = sc.cpf();

                    managerPessoa.cadastrar(nome, email, senha, celular, cpf);
                    break;
                case 3:
                    email = sc.email();

                    managerPessoa.atualizarSenha(email);
                    break;
                case 4:
                    System.out.println("\nSaindo... até logo!");
                    break;
                default:
                    feedbacks.opcaoInvalida();
            }

        }while(opcao != 4);

    }
}