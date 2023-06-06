package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorPi = 3.14159;

        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        //double area = (raio * raio) * valorPi;
        double area = Math.PI * Math.pow (raio, 2);

        System.out.println("A área do círculo vale: " + area);

    }

}
