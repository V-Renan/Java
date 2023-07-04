package com.victor.cursojava.aula17;

public class LoopFor {

    public static void main(String[] args) {

        //increment.
        for (int i=0; i < 5; i++ ){
            System.out.println("Valor de [i]: " + i);
        }

        //decrement.
        for (int cont=4; cont >= 0; cont--){
            System.out.println("Valor de [cont]: " + cont);
        }

        //FOR com mais de uma variável.
        for (int i=0, j=10; i < j; i++, j--){
            System.out.println("i = " + i + " | j = " + j);
        }

        //FOR com partes ausentes.
        int count = 0;
        for ( ; count < 10 ; ){
            System.out.println("Valor de count: " + count);
            count +=2;
        }
        //que seria a mesma coisa que isto.
        for (int cont=0; cont < 10; cont += 2){
            System.out.println("Valor de cont: " + cont);
        }

        //loop infinito
        /*for (;;);
         */

        //loop sem corpo
        int soma = 0;
        for (int i=1; i < 5; soma += i++);
        System.out.println("Valor da soma é: " + soma);
    }
}
