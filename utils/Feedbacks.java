package utils;

public class Feedbacks {
    public static void opcaoInvalida(){System.out.println("\nOpção inválida, tente novamente.");}

    public static void erroLocalizarEmail(){
        System.out.println("\nErro, email não encontrado.");
    }

    public static void cadastroSucesso(){
        System.out.println("\nCadastro realizado com sucesso.");
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
}
