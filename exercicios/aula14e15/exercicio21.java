package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Álcool ou Gasolina? [G/A]");
        String op = scan.next();

        double gasolina = 2.50;
        double alcool = 1.90;

        //desconto Gasolina >>> até 20L = 4% | Acima de 20L = 6%
        //desconto Álcool >>> até 20L = 3% | Acima de 20L = 5%

        if (op.equalsIgnoreCase("G")) {
            System.out.println("Quantos litros de Gasolina? ");
            double litroG = scan.nextDouble();
            if (litroG <= 20) {
                double desconto = (litroG * gasolina) * 4 / 100;
                double total = (litroG * gasolina) - desconto;
                System.out.println("Total a pagar com 4% de desconto: R$" + total);
            } else if (litroG > 20) {
                double desconto = (litroG * gasolina) * 6 / 100;
                double total = (litroG * gasolina) - desconto;
                System.out.println("Total a pagar com 6% de desconto: R$" + total);
            }
        }
        if (op.equalsIgnoreCase("A")){
            System.out.println("Quantos litros de Álcool? ");
            double litroA = scan.nextDouble();
            if (litroA <= 20){
                double desconto = (litroA * alcool) * 3 / 100;
                double total = (litroA * alcool) - desconto;
                System.out.println("Total a pagar com 3% de desconto: R$" + total);
            } else if (litroA > 20){
                double desconto = (litroA * alcool) * 5 / 100;
                double total = (litroA * alcool) - desconto;
                System.out.println("Total a pagar com 5% de desconto; R$" + total);
            }
        }
    }
}

