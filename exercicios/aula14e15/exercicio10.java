package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Em qual turno você trabalha? [M/V/N]");
        String turno = scan.next();

        /*if(turno.equalsIgnoreCase("M")){
            System.out.println("M - Matutino");
            System.out.println("Bom Dia!!");
        } else if (turno.equalsIgnoreCase("V")){
            System.out.println("V - Vespertino");
            System.out.println("Boa Tarde!!");
        }else if (turno.equalsIgnoreCase("N")){
            System.out.println("N - Noturno");
            System.out.println("Boa Noite!!");
        } else {
            System.out.println("Opção inválida!");
        }*/

        switch (turno){
            case "m":
            case "M":
                System.out.println("M - Matutino \nBom Dia!"); break;
            case "v":
            case "V":
                System.out.println("V - Vespertino \nBoa Tarde!"); break;
            case "n":
            case "N":
                System.out.println("N - noturno \nBoa Noite!"); break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}
