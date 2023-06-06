package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double hora = scan.nextDouble();

        System.out.println("Qual a quantidade de horas trabalhadas no mês? ");
        double qtdHora = scan.nextDouble();

        double salario = hora * qtdHora;

        System.out.print("Você receberá " + salario);
        System.out.println("R$ na sua folha de pagamento.\r");

    }


}
