package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n-ésimo termo: ");
        int n = scan.nextInt();
        int fatorial = 1;


        for (int i = n; i > 0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}
