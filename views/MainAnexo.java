package views;

import enums.TipoMidia;
import utils.Feedbacks;
import utils.ScannerUtil;

import java.util.Set;

public class MainAnexo {
    private int opcao;
    private Set<TipoMidia> tipoMidias;
    private TipoMidia tipoMidia;

    public Set<TipoMidia> main(){
        do {
            System.out.println("\n---TIPOS DE MIDIA(OBS: Pode marcar mais de um)---");
            System.out.println("1 - IMAGEM");
            System.out.println("2 - VÍDEO");
            System.out.println("3 - DOCUMENTO\n");

            opcao = ScannerUtil.multiOpcao();

            if(opcao > 3 | opcao < 1){
                Feedbacks.opcaoInvalida();
                continue;
            }

            tipoMidia = TipoMidia.escolherTipo(opcao);
            tipoMidias.add(tipoMidia);

        }while (opcao != 0);
        return null;
    }
}
