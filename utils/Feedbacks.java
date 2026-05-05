package utils;

import enums.TipoMidia;
import model.Anexo;
import model.Denuncia;
import model.Localizacao;

public class Feedbacks {
    public static void opcaoInvalida(){System.out.println("\nOpção inválida, tente novamente.");}

    public static void erroLocalizarEmail(){
        System.out.println("\nErro, email não encontrado.");
    }

    public static void cadastroSucesso(){
        System.out.println("\nCadastro realizado com sucesso.");
    }

    public static void cadastroSucessoDenuncia(){
        System.out.print("\nDenúncia cadastra com sucesso.");
    }

    public static void alteracaoSucesso(){
        System.out.println("\nAlteração realizada com sucesso.");
    }

    public static void senhaIncorreta(){
        System.out.println("\nSenha incorreta.");
    }

    public static void saindoConta(){
        System.out.println("\nSaindo da conta...");
    }

    public static void voltando(){
        System.out.println("\nVoltando...");
    }

    public static void idNaoEncontrado(){
        System.out.println("\nID não encontrado.");
    }

    public static void exibirDenuncia(Denuncia denuncia){
        Localizacao localizacao = denuncia.getLocalizacao();
        Anexo anexo = denuncia.getAnexo();

        System.out.println("\n------ DENÚNCIA ------");
        System.out.println("Data: " + denuncia.getData());
        System.out.println("Tipo: " + denuncia.getTipoDenuncia());
        System.out.println("Status: " + denuncia.getStatusDenuncia());
        System.out.println("Descrição: " + denuncia.getDescricao());

        System.out.print("Localização: ");
        exibirLocalizacao(localizacao);

        System.out.println("Anexos: ");
        exibirAnexo(anexo);

        System.out.println("----------------------");
    }

    public static void exibirLocalizacao(Localizacao localizacao){
        System.out.println(localizacao.getRua() + ", Nº " + localizacao.getNumero() + " - " + localizacao.getBairro() + " | CEP: " + localizacao.getCep() + " | Ref: " + localizacao.getReferencia());
    }

    public static void exibirAnexo(Anexo anexo){
        System.out.println("ID do Anexo: " + anexo.getId());
        System.out.print("Mídias: ");
        for (TipoMidia t : anexo.getTipoMidias()){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
