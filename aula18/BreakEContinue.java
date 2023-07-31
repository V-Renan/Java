package com.victor.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        System.out.println("Digite outro número: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++){
            System.out.println(i);
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break; //Com o break dentro do if a contagem do (for) para no primeiro número que for divisível por 7.
            }
        }
    }
}
