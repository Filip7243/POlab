package com.company;

public class Lab4 {

    public static void main(String[] args) {

        double[] tab = {4,1,2,3,7,2,8,-1,3,-9,-1,0};
        System.out.println(variancesCalc(tab));
    }

    private static void sumAndAverageOfTabElements(int[] tab) {
        int sum = 0;
        int average = 0;
        //normal for loop
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        average = sum / tab.length;

        //for-each loop
        for (int i : tab) {
            sum += i;
        }

        average = sum / tab.length;

        System.out.println(sum);
        System.out.println(average);
    }

    private static void createBooleanTab() {
        boolean[] tab = new boolean[20];

        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                tab[i] = true;
            } else {
                tab[i] = false;
            }
        }

        for (boolean b : tab) {
            System.out.println(b);
        }
    }

    private static double variancesCalc(double[] tab) {
        double xs = 0; // average of all tab elements
        for (double i : tab) {
            xs += i;
        }

        xs /= tab.length;
        int sum = 0; // sum of (xi-xs)^2

        for (int i = 0; i < tab.length; i++) {
            double xi = tab[i]; // next element of tab
            sum += Math.pow((xi - xs), 2);
        }
        
        return sum / (tab.length - 1.0);
    }
}
