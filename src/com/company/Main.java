package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hier Eurobetrag eingeben: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        convertToDollars(money);
        convertToPounds(money);
        convertToYen(money);
        convertToLira(money);
        convertToFranken(money);
        convertToRubel(money);

    }

    public static void convertToDollars(double eur) {

        System.out.println("Der Betrag in Dollar ist: " + eur * 1.20);
    }

    public static void convertToPounds(double eur) {

        System.out.println("Der Betrag in Pounds ist: " + eur * 0.83);

    }

    public static void convertToYen(double eur) {

        System.out.println("Der Betrag in Yen ist: " + eur * 132.31);
    }

    public static void convertToLira(double eur) {

        System.out.println("Der Bertag in Lira ist: " + eur * 15.42);
    }

    public static void convertToFranken(double eur) {

        System.out.println("Der Betrag in Schweizer Franken ist: " + eur * 1.04);
    }

    public static void convertToRubel(double eur) {

        System.out.println("Der Betrag in Rubel ist: " + eur * 86.27);
    }

}


