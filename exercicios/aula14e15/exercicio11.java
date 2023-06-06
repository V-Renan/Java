package com.victor.cursojava.exercicios.aula14e15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculando porcentagem de aumento.");
        System.out.println("Digite seu salário para descobrir a porcentagem de reajuste!");
        double salario = scan.nextDouble();

        //20%
        //

        if (salario <= 280){
            double aumento = (salario * 20) / 100;
            double salarioComAumento = salario + aumento;
            System.out.println("Com o salário de R$" + salario + " o reajuste será de 20%. Equivalente a: R$" + aumento);
            System.out.println("Você passa a receber R$" + salarioComAumento);
        } else if (salario > 280 && salario < 700){
            double aumento = (salario * 15) / 100;
            double salarioComAumento = salario + aumento;
            System.out.println("Com o salário de R$" + salario + " o reajuste será de 15%. Equivalente a: R$" + aumento);
            System.out.println("Você passa a receber R$" + salarioComAumento);
        } else if (salario >= 700 && salario < 1500){
            double aumento = (salario * 10) / 100;
            double salarioComAumento = salario + aumento;
            System.out.println("Com o salário de R$" + salario + " o reajuste será de 10%. Equivalente a: R$" + aumento);
            System.out.println("Você passa a receber R$" + salarioComAumento);
        } else if (salario >= 1500){
            double aumento = (salario * 5) / 100;
            double salarioComAumento = salario + aumento;
            System.out.println("Com o salário de R$" + salario + " o reajuste será de 5%. Equivalente a: R$" + aumento);
            System.out.println("Você passa a receber R$" + salarioComAumento);
        }


    }
}
