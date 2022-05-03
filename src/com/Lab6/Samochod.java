package com.Lab6;

import java.util.Scanner;

public class Samochod {

    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rokProdukcji;
    private double przebieg;
    private static Scanner scanner = new Scanner(System.in);

    public Samochod() {
        System.out.println("Podaj marke: ");
        this.marka = scanner.nextLine();
        System.out.println("Podaj model: ");
        this.model = scanner.nextLine();
        System.out.println("Podaj nadwozie: ");
        this.nadwozie = scanner.nextLine();
        System.out.println("Podaj kolor: ");
        this.kolor = scanner.nextLine();
        System.out.println("Podaj rok produkcji: ");
        this.rokProdukcji = scanner.nextInt();
        do {
            System.out.println("Podaj przebieg: ");
            this.przebieg = scanner.nextDouble();
        } while (this.przebieg < 0);
        scanner.nextLine();
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        if(przebieg < 0) {
            this.przebieg = 0;
        }else {
            this.przebieg = przebieg;
        }
    }

    public void opis() {
        System.out.println("Samochód " + this.marka + " " + this.model + "\n" +
                "Nadwozie: " + this.nadwozie + ", " + "o kolorze: " + this.kolor + "\n" +
                "Z roku: " + this.rokProdukcji + ", z przebiegiem: " + this.przebieg + "km.");
        System.out.println("--------------------------------");
    }


}
