package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Number: ");
        int n1 = scan.nextInt();

        System.out.println("Tabuada de " + n1);

        for (int i = 1; i <= 10; i++){
            System.out.println(n1 + " x " + i + " = " + (n1 * i));

        }
    }
}
