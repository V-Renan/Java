package com.victor.cursojava.aula17;

public class LoopFor {
    public LoopFor() {
    }

    public static void main(String[] args) {
        int count;
        for(count = 0; count < 5; ++count) {
            System.out.println("Valor de [i]: " + count);
        }

        for(count = 4; count >= 0; --count) {
            System.out.println("Valor de [cont]: " + count);
        }

        count = 0;

        int soma;
        for(soma = 10; count < soma; --soma) {
            System.out.println("i = " + count + " | j = " + soma);
            ++count;
        }

        for(count = 0; count < 10; count += 2) {
            System.out.println("Valor de count: " + count);
        }

        for(soma = 0; soma < 10; soma += 2) {
            System.out.println("Valor de cont: " + soma);
        }

        soma = 0;

        for(int i = 1; i < 5; soma += i++) {
        }

        System.out.println("Valor da soma é: " + soma);
    }
}