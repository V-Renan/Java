package com.victor.cursojava.exercicios.aula16e17;


public class exercicio06 {

    public static void main(String[] args) {

        for (int i=1; i <= 20; i++){
            System.out.print(i);
            if (i < 20){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }
}
