package com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double regulamento = 50;
        double acrescimo = 4.00;


        System.out.println("Digite o peso do peixe: ");
        double pesoPeixe = scan.nextDouble();

        if (pesoPeixe > regulamento) {
            double excesso = pesoPeixe - regulamento;
            double multa = excesso * acrescimo;
            System.out.println("Peso do peixe: " + pesoPeixe + " kg");
            System.out.println("Excesso: " + excesso + "kg");
            System.out.println("Multa: " + multa + " Reais");
        } else {
            double excesso = 0;
            double multa = 0;
            System.out.println("Peso do peixe: " + pesoPeixe + " kg");
            System.out.println("Excesso: " + excesso + " kg");
            System.out.println("Multa: " + multa + " Reais");

        }
    }
}






// ler variavel peso
// ler excesso
// se houver excesso gravar na variavel multa