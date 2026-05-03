package views;

import utils.Feedbacks;
import utils.ScannerUtil;

public class MainAdministrador {

    private int opcao;
    private ScannerUtil sc;
    private Feedbacks feedbacks;


    public MainAdministrador(){
        sc = new ScannerUtil();
        feedbacks = new Feedbacks();
    }

    public void mainAdministrador(){
        do {
            System.out.println("---MENU ADM---");
            System.out.println("1 - ");
            System.out.println("2 - ");
            System.out.println("3 - ");
            System.out.println("4 - Sair");

            opcao = sc.opcao();

            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    feedbacks.opcaoInvalida();
            }

        }while (opcao != 4);
    }
}
