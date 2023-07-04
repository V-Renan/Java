package com.victor.cursojava.exercicios.aula16e17;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        double wage;
        String sex;
        String maritalStatus;

        do {
            System.out.println("Name: ");
            name = scan.next();
            if (name.length() <= 3) {
                System.out.println("Invalid name. Please enter a name with more than 3 characters.");
            }
        } while (name.length() <= 3);

        do {
            System.out.println("Age:");
            age = scan.nextInt();
            if (age < 0 || age > 150) {
                System.out.println("EEROR! Invalid Age, try again.");
            }
        } while (age < 0 || age > 150);

        do {
            System.out.println("Wage:");
            wage = scan.nextDouble();
            if (wage < 0) {
                System.out.println("ERROR! Invalid Value, try again.");
            }
        } while (wage < 0);

        do {
            System.out.println("Sex:");
            sex = scan.next();
            if (!sex.equalsIgnoreCase("F") && !sex.equalsIgnoreCase("M")) {
                System.out.println("ERROR! Invalid Sex, just [F/M].");
            }
        } while (!sex.equalsIgnoreCase("F") && !sex.equalsIgnoreCase("M"));

        do {
            System.out.println("Marital Status:");
            maritalStatus = scan.next();
            if (!maritalStatus.equalsIgnoreCase("S") && !maritalStatus.equalsIgnoreCase("C")
                    && !maritalStatus.equalsIgnoreCase("V") && !maritalStatus.equalsIgnoreCase("D")) {
                System.out.println("ERROR! Invalid Value, just [S,C,V,D]");
            }
        } while (!maritalStatus.equalsIgnoreCase("S") && !maritalStatus.equalsIgnoreCase("C")
                && !maritalStatus.equalsIgnoreCase("V") && !maritalStatus.equalsIgnoreCase("D"));

        System.out.println("Name: " + name + " >> Amount of letters: " + name.length());
        System.out.println("Age: " + age);
        System.out.println("Wage: R$" + wage);
        System.out.println("Sex: " + sex);
        System.out.println("Marital Status: " + maritalStatus);

    }
}