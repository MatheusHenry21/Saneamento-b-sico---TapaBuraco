package views;

import DAO.DenunciaDAO;
import enums.StatusDenuncia;
import enums.TipoDenuncia;
import model.*;
import utils.DateTimeUtil;
import utils.Feedbacks;
import utils.ScannerUtil;

public class MainDenunciante {

    private int opcao;
    private Denuncia novaDenuncia;

    private String dataAtual;
    private DenunciaDAO managerDenuncia;
    private Localizacao localizacao;
    private String descricao;
    private Anexo anexo;
    private TipoDenuncia tipoDenuncia;
    private StatusDenuncia statusDenuncia;

    public void main(Pessoa usuario){
        do{
            System.out.println("\n  ---MENU DENUNCIANTE---");
            System.out.println("1 - Registrar denúncia");
            System.out.println("2 - Editar denúncia");
            System.out.println("3 - Ver denúncia próximas de você");
            System.out.println("4 - Sair\n");

            opcao = ScannerUtil.opcao();

            switch (opcao){
                case 1:
                    dataAtual = DateTimeUtil.formatarData(DateTimeUtil.DATE_TIME_FORMAT);
                    localizacao = new Localizacao("ex", "ex", "ex", "ex", "ex");
                    descricao = ScannerUtil.descricao();
                    anexo = new Anexo();
                    tipoDenuncia = TipoDenuncia.OUTROS;
                    statusDenuncia = StatusDenuncia.EM_ANALISE;

                    novaDenuncia = new Denuncia(dataAtual, localizacao, descricao, anexo, tipoDenuncia, statusDenuncia);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Feedbacks.saindoConta();
                default:
                    Feedbacks.opcaoInvalida();
            }

        }while (opcao != 4);

    }
}