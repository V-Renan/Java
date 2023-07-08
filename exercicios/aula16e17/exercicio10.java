package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First number:");
        int n1 = scan.nextInt();
        System.out.println("Second number:");
        int n2 = scan.nextInt();

        for (int cont = n1; cont <= n2; cont++){
            System.out.println(cont);
        }

    }
}
