package com.victor.cursojava.aula12;

import java.util.Scanner;

public class TestandoInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String primeiroNome = scan.nextLine();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();

        System.out.println("Seu primeiro nome: " + primeiroNome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua altura: " + altura);
    }

}
