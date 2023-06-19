package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scan.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " É um número PAR! ");
        } else {
            System.out.println(n + " É um número IMPAR!");
        }

    }
}
