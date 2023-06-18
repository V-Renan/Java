package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1ª lado do triângulo: ");
        double l1 = scan.nextDouble();
        System.out.println("2ª lado do triângulo: ");
        double l2 = scan.nextDouble();
        System.out.println("3ª lado do triângulo: ");
        double l3 = scan.nextDouble();

        if (l1 + l2 > l3 || l2 + l3 > l1 || l1 + l3 > l2) {
            System.out.println("Sim, é possível formar um triângulo com os seguintes valores: " + l1 + " " + l2 + " " + l3);
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo Equilátero!");
            } else if (l1 == l2 || l1 == l3 || l3 == l2) {
                System.out.println("Triângulo Isósceles!");
            } else if (l1 != l2 && l2 != l3 && l3 != l1) {
                System.out.println("Triângulo Escaleno!");
            }
        else {
                System.out.println("Não é possível formar um Triângulo!");
            }
        }
    }
}