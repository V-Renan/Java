package com.victor.cursojava.exercicios.aula19;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {

            System.out.print("Digite o " + i + "ª valor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

        /*for (int i=0; i<vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }*/

        System.out.print("Velor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Velor B = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
