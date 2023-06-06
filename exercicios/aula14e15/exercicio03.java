package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo [F/M]: ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido!");
        }

    }
}
