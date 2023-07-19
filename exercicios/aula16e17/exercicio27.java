package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de temperaturas: ");
        int qtdTemperatura = scan.nextInt();

        double temperatura;
        double soma = 0;
        double media;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 1; i <= qtdTemperatura; i++){
            System.out.print(i + "ª Temperatura: ");
            temperatura = scan.nextDouble();

            if (temperatura > maior){
                maior = temperatura;
            }
            if (temperatura < menor){
                menor = temperatura;
            }

            soma += temperatura;
        }

        media = soma / qtdTemperatura;

        System.out.println("Maior temperatura digitada: " + maior + "º");
        System.out.println("menor temperatura digitada: " + menor + "º");
        System.out.println("Média de temperatura: " + media + "º");
    }
}
