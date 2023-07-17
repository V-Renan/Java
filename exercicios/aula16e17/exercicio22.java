package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de CD's");
        int qtdCD = scan.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i <= qtdCD; i++){
            System.out.print("Informe o valor do " + i + "ª cd: ");
            preco = scan.nextDouble();

            soma += preco;
        }

        double mediaValor = soma / qtdCD;

        System.out.println("Média gasta em cada CD: R$" + mediaValor);
    }
}
