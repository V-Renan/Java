package com.victor.cursojava.aula13;

public class OperadoresAritimeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Está é";
        String segunNome = " uma String concatenada";
        String terceiroNome = primeiroNome + segunNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);
        resultado++; //Adciona 1
        System.out.println(resultado);
        //Resultado está valendo 5


        System.out.println(resultado++); //com o '++' no POS o valor é printado mas ainda não é adiconado, apenas no proximo print...
        System.out.println(++resultado); // com o '++' no PRÉ o valor anterior é somado e adicionado com o próximo '++' que está no PRÉ...
        System.out.println(resultado += 1); //Estes três resultados funcionam da mesma forma...


        resultado--; //Resultado valendo 8
        System.out.println(resultado); //Passa a valer 7

        System.out.println(resultado--); //Primeiro imprindo a mensagem e depois subtraindo...
        System.out.println(--resultado); //Primeiro subtraindo e depois imprimindo a mensagem...
    }

}
