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

import java.util.ArrayList;

public class MainDenunciante {

    private int opcao;
    private Denuncia novaDenuncia;

    private String dataAtual;
    private Localizacao localizacao;
    private Anexo anexo;
    private TipoDenuncia tipoDenuncia;
    private StatusDenuncia statusDenuncia;

    private LocalizacaoDAO localizacaoDAO = new LocalizacaoDAO();
    private DenunciaDAO denunciaDAO = new DenunciaDAO();
    private TipoDenunciaDAO tipoDenunciaDAO = new TipoDenunciaDAO();
    private AnexoDAO anexoDAO = new AnexoDAO();

    public void inicia(Denunciante denunciante){
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

                    tipoDenuncia = tipoDenunciaDAO.escolher();

                    String bairro = ScannerUtil.bairro();
                    String rua = ScannerUtil.rua();
                    String numero = ScannerUtil.numero();
                    String cep = ScannerUtil.cep();
                    String referencia = ScannerUtil.referencia();
                    localizacao = localizacaoDAO.cadastrar(bairro, rua, numero, cep, referencia);

                    anexo = anexoDAO.escolher();
                    String descricao = ScannerUtil.descricao();

                    novaDenuncia = new Denuncia(denunciante ,dataAtual, localizacao, descricao, anexo, tipoDenuncia, statusDenuncia);
                    denunciaDAO.cadastrar(novaDenuncia);
                    Feedbacks.cadastroSucessoDenuncia();
                    break;
                case 2:
                    AlterarDenuncia.main();
                    break;
                case 3:
                    ArrayList<Denuncia> denunciaArrayList = denunciaDAO.denunciasProximas(denunciante);

                    if (denunciaArrayList.isEmpty()) {
                        System.out.println("Nenhuma denúncia próxima encontrada.");
                    } else {
                        for (Denuncia d : denunciaArrayList) {
                            Feedbacks.exibirDenuncia(d);
                        }
                    }
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