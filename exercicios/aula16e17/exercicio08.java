package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        double soma = 0;
        double media = 0;

        for (int i=1; i <= 5; i++){
            System.out.println(i + "ª Valor: ");
            num = scan.nextInt();
            soma += num;
            media = soma / 5;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
