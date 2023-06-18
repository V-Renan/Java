package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano:");
        double ano = scan.nextDouble();

        if (ano % 4 == 0){
            System.out.println(ano + " É um ano bissexto!");
        } else {
            System.out.println(ano + " Não é um ano bissexto!");
        }
    }
}
