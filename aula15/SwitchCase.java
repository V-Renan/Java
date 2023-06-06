package com.victor.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIAS DA SEMANA");

        System.out.println("Digite um dia de 1-7:");
        int dia = scan.nextInt();

        /*if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda-feira");
        } else if (dia == 3){
            System.out.println("Terça-feira");
        } else if (dia == 4){
            System.out.println("Quarta-feira");
        } else if (dia == 5){
            System.out.println("Quint-feira");
        } else if (dia == 6){
            System.out.println("Sexta-feira");
        } else if (dia == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Opção inválida!");
        }*/



        // No switch sem o break é execultado o bloco de comando completo, até encontar um break;
        // Usando SwitchCase
        /*switch (dia){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Segunda-feira"); break;
            case 3:
                System.out.println("Terça-feira"); break;
            case 4:
                System.out.println("Quarta-feira"); break;
            case 5:
                System.out.println("Quinta-feira"); break;
            case 6:
                System.out.println("Sexta-feira"); break;
            case 7:
                System.out.println("Sábado"); break;
            default:
                System.out.println("Opção inválida!");
        }*/

        switch (dia){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!"); break;
            case 1:
            case 7:
                System.out.println("Fim de semana!"); break;
            default:
                System.out.println("Opção inválida!");
        }

    }

}
