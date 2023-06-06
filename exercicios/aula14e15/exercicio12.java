package com.victor.cursojava.exercicios.aula14e15;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor da hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantidade de horas trabalhadas no mês: ");
        double qtdHoras = scan.nextDouble();

        double salario = qtdHoras * valorHora;

        double sindicato = (salario * 3) / 100;
        double fgts = (salario * 11) / 100;
        double inss = (salario * 10) / 100;

        System.out.println("Salário Bruto: R$" + salario);
        if (salario <= 900){
            System.out.println("Isento de IR.");
        } else if (salario > 900 && salario <= 1500){
            double ir = (salario * 5) / 100;
            double totalDescontos = inss + ir;
            double valorLiquido = salario - totalDescontos;
            System.out.println("Imposto de renda: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total de Descontos: R$" + totalDescontos);
            System.out.println("Valor Liquido: " + valorLiquido);
        } else if (salario > 1500 && salario <= 2500){
            double ir = (salario * 10) / 100;
            double totalDescontos = inss + ir;
            double valorLiquido = salario - totalDescontos;
            System.out.println("Imposto de renda: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total de Descontos: R$" + totalDescontos);
            System.out.println("Valor Liquido: " + valorLiquido);
        } else if (salario > 2500){
            double ir = (salario * 20) / 100;
            double totalDescontos = inss + ir;
            double valorLiquido = salario - totalDescontos;
            System.out.println("Imposto de renda: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total de Descontos: R$" + totalDescontos);
            System.out.println("Valor Liquido: " + valorLiquido);
        }

    }
}
