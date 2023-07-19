package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        System.out.println("Fatorial de " + n);

        System.out.print(n + "! = ");

        int fatorial = 1;
        for (int i = n; i > 1; i--){
            fatorial *= i;
            System.out.print(i + " * ");
        }

        System.out.print("1 = " + fatorial);
    }
}
