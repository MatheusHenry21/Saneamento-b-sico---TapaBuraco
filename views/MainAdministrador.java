package views;

import utils.Feedbacks;
import utils.ScannerUtil;

public class MainAdministrador {

    private int opcao;

    public void main(){
        do {
            System.out.println("\n---MENU ADM---");
            System.out.println("1 - ");
            System.out.println("2 - ");
            System.out.println("3 - ");
            System.out.println("4 - Sair\n");

            opcao = ScannerUtil.opcao();

            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Feedbacks.saindoConta();
                    break;
                default:
                    Feedbacks.opcaoInvalida();
                    break;
            }

        }while (opcao != 4);
    }
}
