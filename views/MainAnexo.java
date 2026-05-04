package views;

import utils.Feedbacks;
import utils.ScannerUtil;

public class MainAnexo {
    private static int opcao;

    public static void mainAnexo(){

        do{
            System.out.println("\n---TIPOS DA DENUNCIA---");
            System.out.println("1 - IMAGEM");
            System.out.println("2 - VÍDEO");
            System.out.println("3 - AUDIO");
            System.out.println("4 - DOCUMENTOS");
            System.out.println("5 - OUTROS\n");

            opcao = ScannerUtil.multiOpcao();

        }while (opcao != 0);
        Feedbacks.voltando();
    }
}
