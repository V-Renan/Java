package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo (MB): ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Velocidade da Internet (Mbps): ");
        double velocidadeNet = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidadeNet;

        System.out.println("Tempo de download: " + tempo + "min.");
    }
}
