package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 9 ){
            System.out.print("Aprovado!");
        } else if (media == 10){
            System.out.print("Aprovado com Distinção!");
        } else {
            System.out.print("Reprovado!");
        }
        System.out.println(" Sua média foi de: " + media);
    }
}
