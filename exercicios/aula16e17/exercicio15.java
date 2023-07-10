package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n-ésimo termo: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        for (int i = 3; i <= n; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }

    }
}
