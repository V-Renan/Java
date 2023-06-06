package com.victor.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {

        //Convenção java
        int idade = 23;
        String nome = "Victor";
        String nomeDoMeuCachorro = "Meggie";
        int ano = 2023;

        //Aceito mas não utilizado
        int _idade;
        int $idade;

        //Não é convenção java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("O nome do seu Cachorro/Cadela é: " + nomeDoMeuCachorro);
        System.out.println("Estamos no ano de: " + ano);
        nome = "Renan";
        idade = 24;
        System.out.println("Segundo nome: " + nome);
        System.out.println("Idade que você irá fazer este ano: " + idade);


        //Má prática
        int a = 10;
        String b = "Victor";
    }
}
