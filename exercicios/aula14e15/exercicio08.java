package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double valor1 = scan.nextDouble();

        System.out.println("Digite o preço do segundo produto: ");
        double valor2 = scan.nextDouble();

        System.out.println("Digite o preço do terceiro produto: ");
        double valor3 = scan.nextDouble();

        if (valor1 < valor2 && valor1 < valor3){
            System.out.println("Você deve comprar o primeiro produto, é o mais barato dentre as opções custando apenas: R$" + valor1);
        } else if (valor2 < valor1 && valor2 < valor3){
            System.out.println("Você deve comprar o segundo produto, é o mais barato dentre as opções custando apenas: R$" + valor2);
        } else if (valor3 < valor1 && valor3 < valor2){
            System.out.println("Você deve comprar o terceiro produto, é o mais barato dentre as opçoes custando apenas: R$" + valor3);
        }
    }
}
