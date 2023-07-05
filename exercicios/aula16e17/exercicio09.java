package com.victor.cursojava.exercicios.aula16e17;

public class exercicio09 {

    public static void main(String[] args) {

        for (int i=1; i <= 50; i++){

            if (i % 2 != 0){
                if (i < 10){
                    System.out.print("0");
                }
            System.out.println(i + " ODD NUMBER.");
            }
        }
    }
}
