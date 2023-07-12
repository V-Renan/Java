package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        boolean nPrimo = true;

        if (n <= 1){
            nPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    nPrimo = false;
                    break;
                }
            }
        }
        if (nPrimo){
            System.out.println(n + " É um número primo.");
        } else {
            System.out.println(n + " Não é um número primo.");
        }

    }

}
