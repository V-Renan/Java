package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int even = 0;
        int odd = 0;


        for (int i = 1; i <= 10; i++){
            System.out.print(i + "ª Value: ");
            int n = scan.nextInt();
            if (n % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Amount of ODD numbers: " + odd);
        System.out.println("Amount of EVEN numbers: " + even);
    }
}
