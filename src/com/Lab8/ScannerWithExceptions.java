package com.Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerWithExceptions {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws BlednaWartoscDlaSilniException, NieprawidlowyAdresException {

        //zad 1
        try {
            ;
            System.out.println("Number: ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                throw new IllegalArgumentException("Podaj liczbę większą od 0!");
            } else {
                double sqrtNumber = Math.sqrt(number);
                System.out.println(sqrtNumber);
            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbe nie ciąg znaków");
        }

        factorial(2);

        Adres adres = new Adres("ESSA", 1, "czxsa", "ees");

    }

    //zad 2
    public static int factorial(int a) throws BlednaWartoscDlaSilniException {
        int result = 1;
        if (a <= 0) {
            throw new BlednaWartoscDlaSilniException("Podaj liczbe wieksza od 0");
        } else {
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
        }

        return result;
    }
}
