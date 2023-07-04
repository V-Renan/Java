package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nameUser;
        String password;

        while (true){
            System.out.println("Usuário:");
            nameUser = scan.next();
            System.out.println("Senha:");
            password = scan.next();

            if (nameUser.equals(password)){
                System.out.println("ERRO! Não utilizar o nome de usuário na senha. Tente novamente!");
            }else {
                System.out.println("Senha e Usuário válidos!");
                break;
            }
        }

    }
}
