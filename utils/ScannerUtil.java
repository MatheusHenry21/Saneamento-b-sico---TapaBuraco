package utils;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int opcao(){
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public static int multiOpcao(){
        System.out.print("Digite a opção(0 para sair): ");
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
        System.out.print("Digite seu celular(ex: 1199999999): ");
        String celular = sc.nextLine();
        return celular;
    }

    public static String cpf(){
        System.out.print("Digite o cpf (ex: 12345678910): ");
        String cpf = sc.nextLine();
        return cpf;
    }

    public static String descricao(){
        System.out.print("Descreva o problema: ");
        String descricao = sc.nextLine();
        return descricao;
    }
}
