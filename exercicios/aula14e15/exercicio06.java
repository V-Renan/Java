package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1ª número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o 2ª número: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o 3ª número: ");
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3){
            int maior = n1;
            System.out.println("O maior valor digitado foi: " + maior);
        } else if (n2 > n1 && n2 > n3){
            int maior = n2;
            System.out.println("O maior valor digitado foi: " + maior);
        } else if (n3 > n1 && n3 > n2){
            int maior = n3;
            System.out.println("O maior valor digitado foi: " + maior);
        }


    }
}
