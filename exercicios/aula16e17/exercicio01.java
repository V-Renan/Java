package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Digite sua nota: ");
            nota = scan.nextInt();
            if (nota > 10 || nota < 0){
                System.out.println("Valor inválido!");
            } else {
                System.out.println("A nota digitada foi: " + nota);
                break;
            }
        }

    }
}
