package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        for (int i=1; i <= 50; i++){
            System.out.print(i);
            if (i < 50){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }


    }
}
