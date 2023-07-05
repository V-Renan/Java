package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        int media = 0;
        int cont = 0;

        for (int i=1; i <= 5; i++){
            System.out.println(i + "ª Valor: ");
            num = scan.nextInt();
            cont ++;
            soma = num * cont;
            media = soma / cont;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
