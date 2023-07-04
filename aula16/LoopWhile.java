package com.victor.cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando até: " + max);

        //A estrutura "while" verifica a condição antes de executar o bloco de código. Se a condição for falsa desde o início, o bloco de código não será executado.
        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println("Valor atual de [i] depois de WHILE: " + i);

        //A estrutura "do-while" executa o bloco de código primeiro e, em seguida, verifica a condição. Isso garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa.
        do {
            i++;
            System.out.println("Valor de [i]: " + i);
        } while (i < 15);

        System.out.println("Valor de [i] depois de DO WHILE: " + i);
    }
}
