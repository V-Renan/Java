package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tipo de carne? temos: [1 = Filé Duplo] [2 = Alcatra] [3 = Picanha]");
        int op = scan.nextInt();
        System.out.println("Quantidade de carne [kg]:");
        double qtdCarne = scan.nextDouble();

        double precoKg = 0;
        String tipoCarne = " ";

        if (op == 1) {
            tipoCarne = "Filé Duplo";
            if (qtdCarne <= 5) ;
            precoKg = 4.90;
        }
            if (qtdCarne > 5){
                precoKg = 5.80;
            }

        if (op == 2) {
            tipoCarne = "Alcatra";
            if (qtdCarne <= 5) {
                precoKg = 5.90;
            }
            if (qtdCarne > 5) {
                precoKg = 6.80;
            }
        }
        if (op == 3){
            tipoCarne = "FPicanha";
            if (qtdCarne <= 5){
                precoKg = 6.90;
            }
            if (qtdCarne > 5){
                precoKg = 7.80;
            }
        }

        double valorParcial = precoKg * qtdCarne;
        double valorTotal = valorParcial;
        double desconto = 0;

        System.out.println("Qual o método de pagamento? [C - Cartão | D - Dinheiro]");
        String opPagamento = scan.next();

        if (opPagamento.equalsIgnoreCase("C")){
            opPagamento = "Cartão";
            desconto = valorParcial * 5 / 100;
            valorTotal = valorParcial - desconto;
        } else if (opPagamento.equalsIgnoreCase("D")){
            desconto = 0;
            valorTotal = valorParcial;
        }

        System.out.println("Tipo de carne: " + tipoCarne + " | Quantidade de carne: " + qtdCarne + "Kg");
        System.out.println("Preço total: R$" + valorParcial + " | Tipo de pagamento:" + opPagamento + "\nValor do desconto: R$" + desconto);
        System.out.println("Valor total: R$" + valorTotal);
    }


}
