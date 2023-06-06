package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroint1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numeroint2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        double numeroReal = scan.nextDouble();

        int dobro = (numeroint1 * 2) * (numeroint2 / 2);
        double triplo = (numeroint1 * 3) + (numeroReal);
        //double cubo =  numeroReal * numeroReal * numeroReal;
        double cubo = Math.pow(numeroReal, 3);

        System.out.println("a. O produto do dobro do primeiro com metade do segundo: " + dobro);
        System.out.println("b. A soma do triplo do primeiro com o terceiro: " + triplo);
        System.out.println("c. O terceiro elevado ao cubo: " + cubo);

    }

}
