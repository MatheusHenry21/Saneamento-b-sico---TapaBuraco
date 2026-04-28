package views;

import model.*;
import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {

        ScannerUtil entradas = new ScannerUtil();
        int opcao;

        do {
            System.out.println("Bem-vindo ao Tapa Buraco\n");
            System.out.println("---MENU---");
            System.out.println("1 - Efetuar login");
            System.out.println("2 - Realizar cadastro");
            System.out.println("3 - Sair");

            opcao = entradas.opcao();

        }while(opcao != 3);

    }
}