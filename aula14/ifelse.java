package com.victor.cursojava.aula14;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Idade: ");
        int idade = scan.nextInt();

        if (idade >= 19) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }*/

        //barato <= 10
        //10 <  valor < 15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        //>= 17 - muito caro
        System.out.println("Testando segundo programa com ifelse: ");

        System.out.println("Preço do produto: ");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("O produto está barato, você deveria comprar.");
        } else if (valor > 10 && valor < 15) {
            System.out.println("O preço está ok, mas que tal pedir um desconto?!");
        } else if (valor >= 15 && valor <= 17) {
            System.out.println("Que tal pesquisar mais um pouco?!");
        } else { // valor >= 17
            System.out.println("O produto está muito caro!");
        }
    }

}