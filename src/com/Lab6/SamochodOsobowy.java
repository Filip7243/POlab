package com.Lab6;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod{

    private double waga;
    private double pojemnoscSilnika;
    private int iloscOsob;
    private static Scanner scanner = new Scanner(System.in);

    public SamochodOsobowy() {
        super();
        do{
            System.out.println("Podaj wage: (tony)");
            this.waga = scanner.nextInt();
        } while (this.waga < 2.0 || this.waga > 4.5);

        do{
            System.out.println("Podaj pojemnosc silnika: ");
            this.pojemnoscSilnika = scanner.nextDouble();
        } while (this.pojemnoscSilnika < 0.8 || this.pojemnoscSilnika > 3.0);

        System.out.println("Podaj ilosc osob: ");
        this.iloscOsob = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void opis() {
        super.opis();
    }
}
