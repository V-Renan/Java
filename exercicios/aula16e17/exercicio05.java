package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int popA;
        float taxaPopA;
        int popB;
        float taxaPopB;
        int cont = 0;

        do {
            System.out.println("PopA: ");
            popA = scan.nextInt();
            if (popA < 0) {
                System.out.println("O valor precisa ser maior do que 0.");
            }
        } while (popA < 0);

        do {
            System.out.println("Taxa PopA: ");
            taxaPopA = scan.nextFloat();
            if (taxaPopA < 0){
                System.out.println("O valor precisa ser maior do que 0.");
            }
        } while (taxaPopA < 0);

        do {
            System.out.println("PopB: ");
            popB = scan.nextInt();
            if (popB < 0){
                System.out.println("O valor precisa ser maior do que 0.");
            }
        } while (popB < 0);

        do {
            System.out.println("Taxa PopB: ");
            taxaPopB = scan.nextFloat();
            if (taxaPopB < 0){
                System.out.println("O valor precisa ser maior do que 0.");
            }
        } while (taxaPopB < 0);

        while (popA < popB) {
            popA += (popA * taxaPopA) / 100;
            popB += (popB * taxaPopB) / 100;
            cont++;
        }
        System.out.println("População A : " + popA);
        System.out.println("População B : " + popB);
        System.out.println("Qauntidade de anos: " + cont);
    }
}
