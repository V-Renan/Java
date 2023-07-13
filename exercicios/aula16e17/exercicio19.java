package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        int qtdNotas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;


        for (int i = 1; i <= qtdNotas; i++){
            System.out.print(i + "ª nota: ");
            nota = scan.nextDouble();
            soma+= nota;
        }
        media = soma / qtdNotas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
