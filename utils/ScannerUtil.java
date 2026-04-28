package utils;

import java.util.Scanner;

public class ScannerUtil {
    Scanner sc = new Scanner(System.in);

    public int opcao(){
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();
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
}
