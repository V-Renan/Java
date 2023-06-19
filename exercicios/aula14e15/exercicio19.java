package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        double num1 = scan.nextInt();
        System.out.println("Segundo número:");
        double num2 = scan.nextInt();

        System.out.println("Entre com uma OP. [+ - / *]");
        String op = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (op){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "/": resultado = num1 / num2; break;
            case "*": resultado = num1 * num2; break;
            default:
                System.out.println("OP inválida!");
                valida = false;
        }

        if (valida){

            System.out.println("Resultado = " + resultado);

            if (resultado >= 0 ){
                System.out.println("Resultado: POSITIVO");
            } else {
                System.out.println("Resultado: NEGATIVO");
            }
            if (resultado % 2 == 0){
                System.out.println("Resultado: PAR");
            } else {
                System.out.println("Resultado: ÍMPAR");
            }
        }
    }
}
