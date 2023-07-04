package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Usuário:");
            String nome = scan.next();
            System.out.println("Senha:");
            String senha = scan.next();

            if (nome.equals(senha)){
                System.out.println("ERRO! Não utilizar o nome de usuário na senha. Tente novamente!");
            }else {
                System.out.println("Senha e Usuário válidos!");
                break;
            }
        }

    }
}
