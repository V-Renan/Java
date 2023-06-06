package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("CALCULANDO NOTAS BIMESTRAIS");

        System.out.println("Digite a 1ª nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a s2ª nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a 3ª nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a 4ª nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média é: " + media);

    }

}
