package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Fisrt number: ");
        double base = scan.nextDouble();
        System.out.print("Second number: ");
        double expoente = scan.nextDouble();

        double potencia = 0;

        if (expoente >= 0){
            for (int i = 0; i < expoente; i++){
                potencia *= base;
            }
        } else {
            for (int i = 0; i > expoente; i--)
                potencia /= base;
        }

        System.out.println("Potencia: " + potencia);
    }
}
