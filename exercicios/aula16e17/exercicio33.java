package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio33 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scan.nextInt();
        double soma = 0;

        for (int i =1; i<=n; i++){

            soma += 1/i;
        }

        System.out.println("Soma: " + soma);
    }
}
