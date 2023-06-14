package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um letra: ");
        String letra = scan.next();

        /*if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
        letra.equalsIgnoreCase("i") ||
        letra.equalsIgnoreCase("o") ||
        letra.equalsIgnoreCase("u")) {
            System.out.println("(" + letra + ") Volgal.");
        } else {
            System.out.println("(" + letra + ") Consoante.");
        }*/

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("(" + letra + ") Vogal."); break;
            default:
                System.out.println("(" + letra + ") Consoante.");
        }
    }
}
