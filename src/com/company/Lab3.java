package com.company;

import java.util.Scanner;

public class Lab3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        countNumbers();
    }

    private static int studentsAverage() {
        System.out.println("Number of students: ");
        int n = scanner.nextInt();
        int suma = 0;

        int i = 0;
        while(i < n) {
            System.out.println("Student's point: ");
            suma += scanner.nextInt();
            i++;
        }

        return suma/n;
    }

    private static void countNumbers() {
        int minusNumbersCounter = 0;
        int plusNumbersCounter = 0;
        int plusNumbersSum = 0;
        int minusNumbersSum = 0;
        int number;
        for(int i = 0; i < 10; i++) {
            number = scanner.nextInt();
            if(number < 0) {
                 minusNumbersCounter++;
                 minusNumbersSum += number;
            }else {
                plusNumbersCounter++;
                plusNumbersSum += number;
            }
        }

        System.out.println("Plus Numbers: " + plusNumbersCounter + " Sum of Plus Numbers " + plusNumbersSum);
        System.out.println("Minus Numbers: " + minusNumbersCounter + " Sum of Minus Numbers " + minusNumbersSum);
    }
}
