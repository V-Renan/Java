package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cachorroQuente = 1.20;
        double bauruSimples = 1.30;
        double bauruComOvo = 1.50;
        double hamburguer = 1.20;
        double cheeseburguer = 1.30;
        double refri = 1.00;
        double soma = 0;
        double qtd;
        double pedido;

        System.out.println("                       CARDÁPIO");
        System.out.println("--------------------------------------------------------");

        System.out.println("Especificação       |       Código       |        Preço ");
        System.out.println("Cachorro Quente     |        100         |       R$ 1,20");
        System.out.println("Bauru Simples       |        101         |       R$ 1,30");
        System.out.println("Bauru com Ovo       |        102         |       R$ 1,50");
        System.out.println("Hambúrguer          |        103         |       R$ 1,20");
        System.out.println("Cheeseburguer       |        104         |       R$ 1,30");
        System.out.println("Refrigerante        |        105         |       R$ 1,00");

        while (true) {
            System.out.print("Digite o código do seu pedido: ");
            pedido = scan.nextInt();
            double preco;
            if (pedido == 100){
                preco = cachorroQuente;
            } else if (pedido == 101){
                preco = bauruSimples;
            } else if (pedido == 102){
                preco = bauruComOvo;
            } else if (pedido == 103){
                preco = hamburguer;
            } else if (pedido == 104){
                preco = cheeseburguer;
            } else if (pedido == 105){
                preco = refri;
            } else {
                System.out.println("Pedido inválido, Tente novamente!");
                continue;
            }
            while (true) {
                System.out.print("Digite a quantidade: ");
                qtd = scan.nextInt();
                if (qtd > 0){
                    break;
                } else {
                    System.out.println("Quantidade inválida. Tente novamente!");
                }
            }

            soma += qtd * preco;

            System.out.print("Deseja adicionar mais algum item? [S/N]");
            String op = scan.next();
            if (op.equalsIgnoreCase("N")){
                break;
            }
        }

        System.out.println("Total a ser pago: R$" + soma);
    }
}
