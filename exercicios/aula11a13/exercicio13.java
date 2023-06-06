package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double horaValor = scan.nextDouble();

        System.out.println("Horas trabalhas: ");
        double qtdHoras = scan.nextDouble();

        double salario = horaValor * qtdHoras;
        double impostoDeRenda = salario * 11 / 100;
        double descontoInss = salario * 8 / 100;
        double sindicato = salario * 5 / 100;
        double totalDescontos = impostoDeRenda + descontoInss + sindicato;
        double salarioLiquido = salario - totalDescontos;

        System.out.println("Salário bruto: " + salario + "R$");
        System.out.println("Pago ao INSS: " + descontoInss + "R$");
        System.out.println("Pago ao sindicato: " + sindicato + "R$");
        System.out.println("Imposto de rendas: " + impostoDeRenda + "R$");
        System.out.println("Total de descontos: " + totalDescontos + "R$");
        System.out.println("Salário líquido: " + salarioLiquido + "R$");
    }

}
