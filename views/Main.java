package views;

import manage.Autenticar;
import model.*;
import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {

        ScannerUtil sc = new ScannerUtil();

        Autenticar autenticar = new Autenticar();

        int opcao;

        do {
            System.out.println("Bem-vindo ao Tapa Buraco\n");
            System.out.println("---MENU---");
            System.out.println("1 - Efetuar login");
            System.out.println("2 - Realizar cadastro");
            System.out.println("3 - Sair");

            opcao = sc.opcao();

            switch (opcao){
                case 1:
                    autenticar.login();
                case 2:
                    autenticar.cadastrarPessoa();
            }

        }while(opcao != 3);

    }
}