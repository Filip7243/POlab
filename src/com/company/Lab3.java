package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lab3 {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }

    private static int studentsAverage() {
        System.out.println("Number of students: ");
        int n = scanner.nextInt();
        int suma = 0;

        int i = 0;
        while (i < n) {
            System.out.println("Student's point: ");
            suma += scanner.nextInt();
            i++;
        }

        return suma / n;
    }

    private static void countNumbers() {
        int minusNumbersCounter = 0;
        int plusNumbersCounter = 0;
        int plusNumbersSum = 0;
        int minusNumbersSum = 0;
        int number;
        for (int i = 0; i < 10; i++) {
            number = scanner.nextInt();
            if (number < 0) {
                minusNumbersCounter++;
                minusNumbersSum += number;
            } else {
                plusNumbersCounter++;
                plusNumbersSum += number;
            }
        }

        System.out.println("Plus Numbers: " + plusNumbersCounter + " Sum of Plus Numbers " + plusNumbersSum);
        System.out.println("Minus Numbers: " + minusNumbersCounter + " Sum of Minus Numbers " + minusNumbersSum);
    }

    private static int sumOfEvenNumbers(int n, int lowerBound, int higherBound) {//n - length of sequence
        if (n <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(higherBound - lowerBound) + lowerBound;
            System.out.println("Number = " + number);
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

    //Overloaded method
    private static int sumOfEvenNumbers(int n) {
        if (n <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(45 + 10) - 10;
            System.out.println("Number = " + number);
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

    private static boolean isPalindrome() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        word = word.replaceAll(" ", "");
        reversedWord = reversedWord.replaceAll(" ", "");

        return word.equalsIgnoreCase(reversedWord);

    }


}
