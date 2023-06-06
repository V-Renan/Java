package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Altura: ");
        double altura = scan.nextFloat();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
