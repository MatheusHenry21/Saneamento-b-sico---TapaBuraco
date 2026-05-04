package views;

import DAO.DenunciaDAO;
import DAO.LocalizacaoDAO;
import DAO.TipoDenunciaDAO;
import model.Denuncia;
import model.Localizacao;
import utils.Feedbacks;
import utils.ScannerUtil;

public class AlterarDenuncia {
    private static int id;

    private static int opcao;
    private static String bairro;
    private static String rua;
    private static String numero;
    private static String cep;
    private static String referncia;
    private static Localizacao localizacao;
    private static Denuncia denuncia;

    private static LocalizacaoDAO localizacaoDAO;

    public static void main(){
        do{
            System.out.println("---EDITE A DENÚNCIA---");
            System.out.println("1 - Localização");
            System.out.println("2 - Tipo");
            System.out.println("3 - Anexo");
            System.out.println("4 - Descrição");
            System.out.println("5 - Voltar");

            opcao = ScannerUtil.opcao();

            switch (opcao){
                case 1:
                    id = ScannerUtil.id();

                    denuncia = DenunciaDAO.buscarPorId(id);
                    if(denuncia == null){
                        Feedbacks.idNaoEncontrado();
                        continue;
                    }

                    bairro = ScannerUtil.bairro();
                    rua = ScannerUtil.rua();
                    numero = ScannerUtil.numero();
                    cep = ScannerUtil.cep();
                    referncia = ScannerUtil.referencia();

                    localizacaoDAO.editar(denuncia, bairro, rua, numero, cep, referncia);
                    Feedbacks.alteracaoSucesso();
                    break;
                case 2:
                    id = ScannerUtil.id();
                    denuncia = DenunciaDAO.buscarPorId(id);
                    if(denuncia == null){
                        Feedbacks.idNaoEncontrado();
                        continue;
                    }

                    TipoDenunciaDAO.editar(denuncia);
                    Feedbacks.alteracaoSucesso();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Feedbacks.voltando();
                    break;
                default:
                    Feedbacks.opcaoInvalida();
                    break;
            }

        }while (opcao != 5);
    }
}
