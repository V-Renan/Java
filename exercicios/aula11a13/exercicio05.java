package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        System.out.println("CONVERTENDO METROS EM CENTÍMETROS");

        Scanner scan = new Scanner(System.in);

        System.out.println("METROS: ");
        double metro = scan.nextDouble();

        double centimetros = metro * 100;

        System.out.println(metro + "m metros convertido para cm vale: " + centimetros + "cm");

    }

}
