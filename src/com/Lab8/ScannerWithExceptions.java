package com.Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerWithExceptions {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number: ");
            double number = scanner.nextDouble();
            if(number < 0) {
                throw new IllegalArgumentException("Podaj liczbę większą od 0!");
            } else {
                double sqrtNumber = Math.sqrt(number);
                System.out.println(sqrtNumber);
            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbe nie ciąg znaków");
        }
    }
}
