package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //KOD DO OSTATNIEGO ZADANIA Z LAB1:
        Random random = new Random();
        System.out.println("Podaj poczatek przedzialu");
        int poczatekPrzedzialu = scanner.nextInt();
        System.out.println("Podaj koniec przedzialu");
        int koniecPrzedzialu = scanner.nextInt();
        if (koniecPrzedzialu >= poczatekPrzedzialu) {
            int a = random.nextInt(koniecPrzedzialu - poczatekPrzedzialu) + poczatekPrzedzialu;
            int b = random.nextInt(koniecPrzedzialu - poczatekPrzedzialu) + poczatekPrzedzialu;
            int c = random.nextInt(koniecPrzedzialu - poczatekPrzedzialu) + poczatekPrzedzialu;
            System.out.println(triangle(a, b, c));
        } else {
            System.out.println("Koniec przedziału nie moze byc mniejszy od początku!");
        }
    }

    //LAB1:
    private static String nameAndAge() {
        return "Filip, 20 lat";
    }

    private static void miniCalc(double number1, double number2) {
        System.out.println("Suma = " + (number1 + number2) + " " +
                "Iloczyn = " + (number1 * number2) + " " +
                "Roznica = " + (number1 - number2));
    }

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    private static boolean isDivisible(int number) {
        return (number % 3 == 0 && number % 5 == 0);
    }

    private static double powerOf(double number) {
        return Math.pow(number, 3);
    }

    private static double sqrt(double number) {
        return Math.sqrt(number);
    }

    private static boolean triangle(int a, int b, int c) {
        if ((a * a) + (b * b) == (c * c)) {
            return true;
        } else {
            return false;
        }
    }

    //LAB2:
    private static void pierwiastki(double a, double b, double c) {

        double x1;
        double x2;

        double delta = (b * b) - (4 * a * c);
        if (a == 0) {
            System.out.println("Nie jest rowaniniaem kwadratowym");
        } else {
            if (delta < 0) {
                System.out.println("Brak miejsc zerowych");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("x0 = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + " x2 = " + x2);
            }
        }
    }

    private static int a(int x) {

        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }

    private static int b(int x) {
        if (x >= 1) {
            return x * x;
        } else {
            return x;
        }
    }

    private static int c(int x) {
        if (x > 2) {
            return 2 + x;
        } else if (x == 2) {
            return 8;
        } else {
            return x - 4;
        }
    }

    private static void sort(int x, int y, int z) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int average = 0;

        if (max < z) {
            max = z;
            average = Math.max(x, y);
        }
        if (min > z) {
            min = z;
            average = Math.min(x, y);
        }

        System.out.println(min + " " + average + " " + max);

    }

    private static void communicates(boolean isRaining, boolean isBus) {
        if (isRaining && isBus) {
            System.out.println("Weź parasol, dostaniesz sięna uczelnie");
        } else if (isRaining && !(isBus)) {
            System.out.println("Nie dostaniesz sie na uczelnie");
        } else if (!(isRaining) && isBus) {
            System.out.println("Dostaniesz sie na uzlenie, milego dnia");
        }
    }

    private static void cars(boolean isDiscount, boolean isBonus) {

        if ((!isDiscount) || isBonus) {
            System.out.println("Mozesz kupic samochod, ale znizki nie ma");
        }

        if ((!isDiscount) || (!isBonus)) {
            System.out.println("Zakup samochod tezeba odlozyc pozniej, znizki nie ma");
        }

        if (isDiscount || isBonus) {
            System.out.println("Mozesz kupic samochod");
        }
    }

    private static void calc() {
        Scanner scanner = new Scanner(System.in);
        int choice, a, b;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Close");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("A, B:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("a + b = " + (a + b));
                    break;
                case 2:
                    System.out.println("A, B:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("a - b = " + (a - b));
                    break;
                case 3:
                    System.out.println("A, B:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("a * b = " + (a * b));
                    break;
                case 4:
                    System.out.println("A, B:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("a : b = " + (a / b));
                    break;
                case 5:
                    isRunning = false;
                default:
                    continue;
            }
        }
    }

}
