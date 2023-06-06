package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        System.out.println("CONVERTENDO FARENHEIT EM CELSIUS");

        Scanner scan = new Scanner(System.in);

        System.out.println("Farenheit: ");
        int farenheit = scan.nextInt();

        int celsius = (5 * (farenheit-32) / 9);

        System.out.print(farenheit + "º Farenheit convertido para Celsius: " + celsius + "º");
    }

}
