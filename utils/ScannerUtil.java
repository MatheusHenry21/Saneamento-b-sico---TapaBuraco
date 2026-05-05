package utils;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int id(){
        System.out.print("\nDigite o ID de protocólo: ");
        int id = sc.nextInt();
        sc.nextLine();
        return opcao();
    }

    public static int opcao(){
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public static int multiOpcao(){
        System.out.print("\nDigite a opção(0 para sair): ");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public static String nome(){
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        return nome;
    }

    public static String email(){
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        return email;
    }

    public static String senha(){
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        return senha;
    }

    public static String novaSenha(){
        System.out.print("\nDigite a nova senha: ");
        String senha = sc.nextLine();
        return senha;
    }

    public static String celular(){
        System.out.print("Digite seu celular(ex: (11)99999-9999): ");
        String celular = sc.nextLine();
        return celular;
    }

    public static String cpf(){
        System.out.print("Digite o cpf (ex: 123.456.789-10): ");
        String cpf = sc.nextLine();
        return cpf;
    }

    public static String descricao(){
        System.out.print("Descreva o problema: ");
        String descricao = sc.nextLine();
        return descricao;
    }

    public static String bairro(){
        System.out.print("Digite o nome do bairro: ");
        String bairro = sc.nextLine();
        return bairro;
    }

    public static String rua(){
        System.out.print("Digite o nome da rua: ");
        String rua = sc.nextLine();
        return rua;
    }

    public static String numero(){
        System.out.print("Digite o número da casa: ");
        String numero = sc.nextLine();
        return numero;
    }

    public static String cep(){
        System.out.print("Digite o CEP(ex: 56700-000): ");
        String cep = sc.nextLine();
        return cep;
    }

    public static String referencia(){
        System.out.print("Digite um ponto de referência: ");
        String referencia = sc.nextLine();
        return referencia;
    }
}
