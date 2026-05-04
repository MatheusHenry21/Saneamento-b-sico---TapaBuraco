package views;

import DAO.AnexoDAO;
import DAO.DenunciaDAO;
import DAO.LocalizacaoDAO;
import DAO.TipoDenunciaDAO;
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
    private String bairro;
    private String rua;
    private String numero;
    private String cep;
    private String referncia;

    private AnexoDAO anexoDAO;
    private TipoDenunciaDAO tipoDenunciaDAO;
    private LocalizacaoDAO localizacaoDAO;

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
                    statusDenuncia = StatusDenuncia.EM_ANALISE;

                    tipoDenuncia = TipoDenunciaDAO.escolher();

                    bairro = ScannerUtil.bairro();
                    rua = ScannerUtil.rua();
                    numero = ScannerUtil.numero();
                    cep = ScannerUtil.cep();
                    referncia = ScannerUtil.referencia();
                    localizacao = localizacaoDAO.cadastrar(bairro, rua, numero, cep, referncia);

                    anexo = AnexoDAO.escolher();
                    descricao = ScannerUtil.descricao();

                    novaDenuncia = new Denuncia(dataAtual, localizacao, descricao, anexo, tipoDenuncia, statusDenuncia);
                    Feedbacks.cadastroSucessoDenuncia();
                    break;
                case 2:
                    AlterarDenuncia.main();
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