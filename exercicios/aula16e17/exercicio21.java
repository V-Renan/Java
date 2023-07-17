package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de turmas: ");
        int qtdTurma = scan.nextInt();
        int qtdAlunos;
        double soma = 0;
        boolean invalido;


        for (int i = 1; i <= qtdTurma; i++){

            invalido = true;
            do {
                System.out.print("Quantidade de alunos da " + i + "ª turma: ");
                qtdAlunos = scan.nextInt();
                if (qtdAlunos <= 40){
                    invalido = false;
                } else {
                    System.out.println("ERRO! A quantidade de alunos precisa ser menor do que 40.");
                }
            } while (invalido);

            soma += qtdAlunos;
        }

        double mediaAlunos = soma / qtdTurma;

        System.out.println("Quantidade média de alunos: " + mediaAlunos);
    }

}
