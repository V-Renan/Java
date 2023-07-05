package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Frutas a venda: Morango e Maçã.");

        System.out.println("Quantos Kg de Morango?");
        double qtdMorango = scan.nextDouble();
        System.out.println("Quantos Kg de Maçã?");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango;
        if (qtdMorango <= 5){
            precoKgMorango = 2.50;
        } else {
            precoKgMorango = 2.20;
        }

        double precoKgMaca;
        if (qtdMaca <= 5){
            precoKgMaca = 1.80;
        } else {
            precoKgMaca = 1.50;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if (precoParcial > 25 || qtdMorango + qtdMaca > 8) {
            double desconto = (precoParcial * 10) / 100;
            precoTotal = precoParcial - desconto;
        }
        System.out.println("Pedido: " + qtdMorango + "Kg de Morango e " + qtdMaca + "Kg de Maçã.");
        System.out.println("Total a ser pago: R$" + precoTotal);
    }
}
