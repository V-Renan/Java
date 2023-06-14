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

        if (letra.length() > 1){
            System.out.println("ERRO! Verifique se digitou corretamente.");
        } else {
            switch (letra) {
                case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> System.out.println("(" + letra + ") Vogal.");
                default -> System.out.println("(" + letra + ") Consoante.");
            }
        }


    }
}
