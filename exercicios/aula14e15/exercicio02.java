package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        if (valor > 0){
            System.out.println("O valor (" + valor + ") é positivo!");
        } else if (valor < 0){
            System.out.println("O valor é (" + valor + ") é negativo!");
        }

    }
}
