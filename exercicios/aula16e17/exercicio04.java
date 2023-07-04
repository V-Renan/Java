package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        int popA = 200000;
        int popB = 80000;
        int cont = 0;

        while (popB < popA){

            popA += (popA * 3) / 100;
            popB += (popB * 1.5) / 100;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantida de anos: " + cont);

    }
}
