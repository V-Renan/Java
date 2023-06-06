package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 9 && media <= 10.0){
            String conceito = "A";
            System.out.println("Média: "+ media + "\nAPROVADO(A)! " + "Conceito: " + conceito);
        } else if (media > 7.5 && media <= 9.0){
            String conceito = "B";
            System.out.println("Média: "+ media + "\nAPROVADO(A)! " + "Conceito: " + conceito);
        } else if (media > 6 && media <= 7.5){
            String conceito = "C";
            System.out.println("Média: "+ media + "\nAPROVADO(A)! " + "Conceito: " + conceito);
        } else if (media > 4.0 && media <= 6.0){
            String conceito = "D";
            System.out.println("Média: "+ media + "\nREPROVADO(A)! " + "Conceito: " + conceito);
        } else if (media > 0 & media <= 4.0){
            String conceito = "E";
            System.out.println("Média: "+ media + "\nREPROVADO(A)! " + "Conceito: " + conceito);
        }

    }
}
