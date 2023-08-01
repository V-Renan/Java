package com.victor.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        System.out.println("Digite outro número: ");
        int max = scan.nextInt();

        /*for (int i = num; i <= max; i++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break; //Com o break dentro do if a contagem do (for) para no primeiro número que for divisível por 7.
            }
        }*/

        /*for (int i =0; i <= 4; i++){
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                    if (i == 1){
                        break rotulo1;
                    }
                    if (i == 2){
                        break rotulo2;
                    }
                    if (i == 3){
                        break rotulo3;
                    }
                        System.out.println("rotulo 3.");
                    }
                System.out.println("rotulo 2.");
                }
            System.out.println("Esrotulo 1.");
            }
        System.out.println(i);
        }*/

        for (int i = num; i <= max; i++){
            if (i % 7 == 0){
                System.out.print("O valor de i é: " + i + " e é divisivel por 7.\n");
                continue;
            System.out.println("O valor de i é: " + i);
        }
    }
}
