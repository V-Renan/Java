package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Altura: ");
        double h = scan.nextDouble();

        System.out.println("Sexo [M/F]: ");
        String sexo = scan.nextLine();

        if (sexo == "M"){
            double formula = (72.7 * h) - 58;
        } else if (sexo == "F") {
            double formula = (62.1 * h) - 44.7;
        }

    }
}
