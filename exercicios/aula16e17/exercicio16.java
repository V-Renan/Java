package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n-ésimo termo: ");
        //int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        while (proximo < 500){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + " ");
        }

    }
}
