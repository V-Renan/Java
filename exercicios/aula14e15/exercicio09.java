package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1ª número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o 2ª número: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o 3ª número: ");
        int n3 = scan.nextInt();

        if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
            //n1 é maior
            //n3 é maior
            //n1 < n2 < n3
            System.out.println(n3 + "--" + n2 + "--" + n1);
        } else if (n1 <= n2 && n1 <= n3 && n3 <= n2) {
            //n1 maior
            //n2 maior
            //n1 < n3 < n2
            System.out.println(n2 + "--" + n3 + "--" + n1);
        } else if (n2 <= n1 && n2 <= n3 && n1 <= n2) {
            //n2 é menor
            //n3 é maior
            //n2 < n1 < n3
            System.out.println(n3 + "--" + n1 + "--" + n2);
        } else if (n2 <= n1 && n2 <= n3 && n3 <= n1) {
            //n2 é menor
            //n3 é maior
            //n2 < n3 < n1
            System.out.println(n1 + "--" + n3 + "--" + n2);
        } else if (n3 <= n1 && n3 <= n2 && n1 <= n2) {
            //n3 é menor
            //n2 é maior
            //n3 < n1 < n2
            System.out.println(n2 + "--" + n1 + "--" + n3);
        } else if (n2 <= n1 && n2 <= n3 && n2 <= n1) {
            //n3 é menor
            //n1 é maior
            //n3 < n2 < n1
            System.out.println(n1 + "--" + n2 + "--" + n3);
        }
    }
}