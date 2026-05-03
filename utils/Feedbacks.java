package utils;

public class Feedbacks {
    public void opcaoInvalida(){System.out.println("\nOpção inválida, tente novamente.");}

    public void erroLocalizarEmail(){
        System.out.println("\nErro, email não encontrado.");
    }

    public void cadastroSucesso(){
        System.out.println("\nCadastro realizado com sucesso.");
    }

    public void alteracaoSucesso(){
        System.out.println("\nAlteração realizada com sucesso.");
    }

    public void senhaIncorreta(){
        System.out.println("\nSenha incorreta.");
    }
}
