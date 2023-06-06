package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite outro valor: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2){
            System.out.println("O maior valor digitado foi: " + valor1);
        } else if (valor2 > valor1){
            System.out.println("O maior valor digitado foi: " + valor2);
        }
    }
}
