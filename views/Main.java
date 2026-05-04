package views;

import DAO.PessoaDAO;
import model.*;
import utils.Feedbacks;
import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        PessoaDAO managerPessoa = new PessoaDAO();

        int opcao;
        String nome;
        String email;
        String senha;
        String celular;
        String cpf;
        String cep;

        do {
            System.out.println("\n  ---MENU PRINCIPAL---");
            System.out.println("1 - Efetuar login");
            System.out.println("2 - Realizar cadastro");
            System.out.println("3 - Esqueci a senha");
            System.out.println("4 - Sair\n");

            opcao = ScannerUtil.opcao();
            System.out.println("");

            switch (opcao){
                case 1:
                    email = ScannerUtil.email();
                    senha = ScannerUtil.senha();

                    managerPessoa.realizarLogin(email, senha);
                    break;
                case 2:
                    nome = ScannerUtil.nome();
                    email = ScannerUtil.email();
                    senha = ScannerUtil.senha();
                    celular = ScannerUtil.celular();
                    cpf = ScannerUtil.cpf();
                    cep = ScannerUtil.cep();

                    managerPessoa.cadastrar(nome, email, senha, celular, cpf, cep);
                    break;
                case 3:
                    email = ScannerUtil.email();

                    managerPessoa.atualizarSenha(email);
                    break;
                case 4:
                    System.out.println("\nSaindo... até logo!");
                    break;
                default:
                    Feedbacks.opcaoInvalida();
            }

        }while(opcao != 4);

    }
}