package views;

import enums.TipoDenuncia;
import utils.Feedbacks;
import utils.ScannerUtil;

public class MainTipoDenuncia {
    private int opcao;
    private TipoDenuncia tipoDenuncia;

    public TipoDenuncia main(){

        do{
            System.out.println("\n---TIPO DA DENUNCIA---");
            System.out.println("1 - BURACO");
            System.out.println("2 - LIXO");
            System.out.println("3 - ESGOTO");
            System.out.println("4 - ILUMINIÇÃO");
            System.out.println("5 - OUTROS");

            opcao = ScannerUtil.multiOpcao();
            tipoDenuncia = TipoDenuncia.escolherTipo(opcao);

            if(tipoDenuncia == null){
                Feedbacks.opcaoInvalida();
                continue;
            }
            return tipoDenuncia;

        }while (opcao != 0);
        Feedbacks.voltando();
        return null;
    }
}
