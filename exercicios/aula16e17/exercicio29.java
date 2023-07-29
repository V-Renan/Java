package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número para gerar a tabuada: ");
        int num = scan.nextInt();

        boolean invalido = true;
        int numFinal, numInicio;

        do {
            System.out.print("Entre com o início da tabuada: ");
            numInicio = scan.nextInt();

            System.out.print("Entre com o final da tabuada: ");
            numFinal = scan.nextInt();

            if (numFinal > numInicio){
                invalido = false;
            }
        } while (invalido);


        System.out.println("Tabuada de " + num);
        System.out.println("Começar por " + numInicio);
        System.out.println("Terminar em " + numFinal);
        System.out.println();

        for (int i = numInicio; i <= numFinal; i++){
            System.out.println(numInicio + " x " + i + " = " + (num * i));
        }

    }
}
