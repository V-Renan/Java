package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber o dia da semana: ");
        int dia = scan.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo. \nFinal de semana."); break;
            case 2:
                System.out.println("Segunda-Feira. \nDia útil."); break;
            case 3:
                System.out.println("Terça-Feira. \nDia útil."); break;
            case 4:
                System.out.println("Quarta-Feira. \nDia útil."); break;
            case 5:
                System.out.println("Quinta-Feira. \nDia útil."); break;
            case 6:
                System.out.println("Sexta-Feira. \nDia útil."); break;
            case 7:
                System.out.println("Sábado. \nFinal de semana1."); break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
