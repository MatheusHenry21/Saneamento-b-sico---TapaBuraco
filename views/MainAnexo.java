package views;

import utils.Feedbacks;
import utils.ScannerUtil;

public class MainAnexo {
    private static int opcao;

    public static void mainAnexo(){

        do{
            System.out.println("\n---ANEXOS---");
            System.out.println("1 - IMAGEM");
            System.out.println("2 - VÍDEO");
            System.out.println("3 - AUDIO\n");

            opcao = ScannerUtil.multiOpcao();

        }while (opcao != 0);
        Feedbacks.voltando();
    }
}
