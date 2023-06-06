package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área do quadrado: ");
        double quadrado = scan.nextDouble();

        double area = quadrado * quadrado;
        System.out.println("A área do quadrado vale: " + area);

        double dobro = area + area;
        System.out.println("E o dobro vale: " + dobro);


    }

}
