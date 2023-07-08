package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First number:");
        int n1 = scan.nextInt();
        System.out.println("Second number:");
        int n2 = scan.nextInt();
        int soma = 0;


        for (int i = n1; i <= n2; i++){
            System.out.println(i);
            soma += i;
        }

        System.out.println("Sum of values: " + soma);
    }
}
