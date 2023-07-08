package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i=1; i <=5; i++){
            System.out.println(i + "ª Value:");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
        }

        System.out.println("The greatest value typed was: " + maior);
    }
}
