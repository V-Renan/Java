package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Mercador Misterioso");

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double precoProduto;
        double total;
        String output;
        double valorPago;
        double troco;

        do {
            System.out.print("Deseja informar uma nova compra? [S/N]: ");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")){

                output = "Mercador Misterioso\n";

                System.out.print("Digite a quantidade de produtos: ");
                qtdProdutos = scan.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++){
                    System.out.print("Preço do " + i + "ª produto: ");
                    precoProduto = scan.nextDouble();
                    total += precoProduto;
                    output+= i + "ª Produto: R$" + precoProduto + "\n";
                }

                output += "Total: R$" + total + "\n";
                System.out.println("Total: R$" + total);

                System.out.print("Valor pago: ");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$" + valorPago + "\n";

                troco = valorPago - total;

                output += "Troco: R$" + troco;

                System.out.println(output);

            } else {
                sair = true;
            }
        } while (!sair);

    }
}
