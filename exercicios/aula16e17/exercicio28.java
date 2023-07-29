package src.com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        boolean nPrimo;

        for (int i = 1; i <= n; i++) {

            nPrimo = true;

            for (int j = 2; j<i; j++){
                if (i % j == 0) {
                    //System.out.println(i + " Não é um número primo- divisível por " + i);
                    nPrimo = false;
                    break;
                }
            }

            if (nPrimo){
                System.out.println(i);
            }

        }
    }
}
