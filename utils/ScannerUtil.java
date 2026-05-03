package utils;

import java.util.Scanner;

public class ScannerUtil {
    Scanner sc = new Scanner(System.in);

    public int opcao(){
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public String nome(){
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        return nome;
    }

    public String email(){
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        return email;
    }

    public String senha(){
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        return senha;
    }

    public String celular(){
        System.out.print("Digite seu celular(ex: 1199999999): ");
        String celular = sc.nextLine();
        return celular;
    }

    public String cpf(){
        System.out.print("Digite o cpf (ex: 12345678910): ");
        String cpf = sc.nextLine();
        return cpf;
    }

    public String descricao(){
        System.out.print("Descreva o problema: ");
        String descricao = sc.nextLine();
        return descricao;
    }
}
