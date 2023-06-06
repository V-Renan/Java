package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        System.out.println("CONVERTENDO CELSIUS PARA FAHRENHEIT");

        Scanner scan = new Scanner(System.in);

        System.out.println("Celsius: ");
        int celsius = scan.nextInt();

        int fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "º Celsius convertiro para Fahrenheit: " + fahrenheit + "º");
    }

}
