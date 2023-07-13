package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de pessoas na turma: ");
        int qtdPessoas = scan.nextInt();
        int idade;
        int soma = 0;
        int mediaIdade;
        String turma = "";

        // 0 a 25 = turma jovem
        // 26 a 60 = turma adulta
        //>= 60 = turma idosa


        for (int i = 1; i <= qtdPessoas; i++){
            System.out.print("Idade da " + i + "ª pessoa: ");
            idade = scan.nextInt();
            soma += idade;
        }

        mediaIdade = soma / qtdPessoas;

        if (mediaIdade > 0 && mediaIdade <= 25){
            turma = "Turma jovem";
        } else if (mediaIdade >= 26 && mediaIdade < 60){
            turma = "Turma adulta";
        } else if (mediaIdade >= 60){
            turma = "Turma idosa";
        }

        System.out.println("Quantidade de pessoas na turma: " + qtdPessoas);
        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Status: " + turma);
    }
}
