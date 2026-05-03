package views;

import DAO.DenunciaDAO;
import enums.StatusDenuncia;
import enums.TipoDenuncia;
import model.*;
import utils.DateTimeUtil;
import utils.ScannerUtil;

public class MainDenunciante {

    private int opcao;
    private Denuncia novaDenuncia;

    private String dataAtual;
    private DenunciaDAO managerPessoa;
    private Localizacao localizacao;
    private String descricao;
    private Anexo anexo;
    private TipoDenuncia tipoDenuncia;
    private StatusDenuncia statusDenuncia;

    private ScannerUtil sc;
    private DateTimeUtil dateTimeUtil;

    public MainDenunciante(){
        sc = new ScannerUtil();
        dateTimeUtil = new DateTimeUtil();
    }

    public void main(Pessoa usuario){
        do{
            System.out.println("\n---MENU---");
            System.out.println("1 - Registrar denúncia");
            System.out.println("2 - Editar denúncia");
            System.out.println("3 - Ver denúncia próximas de você");
            System.out.println("4 - Sair");

            opcao = sc.opcao();

            switch (opcao){
                case 1:
                    dataAtual = dateTimeUtil.formatarData(DateTimeUtil.DATE_TIME_FORMAT);
                    localizacao = new Localizacao("ex", "ex", "ex", "ex", "ex");
                    descricao = sc.descricao();
                    anexo = new Anexo();
                    tipoDenuncia = TipoDenuncia.OUTROS;
                    statusDenuncia = StatusDenuncia.EM_ANALISE;

                    novaDenuncia = new Denuncia(dataAtual, localizacao, descricao, anexo, tipoDenuncia, statusDenuncia);
                    break;
                case 2:
                    break;
                case 3:

            }

        }while (opcao != 4);
        System.out.println("\nVoando...");
        return;

    }
}