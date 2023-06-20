package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Frutas a venda: Morango e Maçã.");

        System.out.println("Quantos Kg de Morango?");
        double morango = scan.nextDouble();
        System.out.println("Quantos Kg de Maçã?");
        double maca = scan.nextDouble();

        double totalKg = morango + maca;
        if (totalKg > 8){
            double precoMorango = 2.20;
            double precoMaca = 1.50;
            double valor = totalKg * (precoMorango + precoMaca);
            double desconto = valor * 10 / 100;
            double total = valor - desconto;
            System.out.println("Pedido: " + morango + "Kg de Morango e " + maca + "Kg de Maçã.");
            System.out.println("Valor total a ser pago com 10% de desconto: R$" + total);
        } else if (totalKg <= 8){
            double precoMorango = 2.50;
            double precoMaca = 1.80;
            double total = totalKg * (precoMorango + precoMaca);
            System.out.println("Pedido: " + morango + "Kg de Morango e " + maca + "Kg de Maçã.");
            System.out.println("Valor total a ser pago: R$" + total);
        }

    }
}


