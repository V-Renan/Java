package src.com.victor.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite outro valor: ");
        int valor2 = scan.nextInt();

        int resultado = valor1 + valor2;
        System.out.println("A soma é igual a: " + resultado);
    }

}

