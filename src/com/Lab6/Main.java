package com.Lab6;

public class Main {

    public static void main(String[] args) {

        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(1, 1);
        Punkt p3 = new Punkt(0, 2);

        p1.przesun(1,1);
        p2.opis();
        p3.zeruj();

        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(10,2);
        Trojkat trojkat = new Trojkat(5.0,3.0);

        figura.getKolor();
        figura.opis();

        prostokat.getPowierzchnia();

        prostokat.przesun(3,5);
        prostokat.punkt.opis();

        Kwadrat kwadrat = new Kwadrat("Niebieski", 5);

        System.out.println("************");
        System.out.println(figura.opis());
        System.out.println(prostokat.opis());
        System.out.println(trojkat.opis());
        System.out.println(kwadrat.opis());

        System.out.println("***************************");

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        Samochod samochod = new Samochod();
        Samochod samochod1 = new Samochod("Opel", "Corsa", "Nadwozie", "Niebeieski", 2016, 250000.1);

        samochod.opis();
        samochod1.opis();
        samochodOsobowy.opis();


    }

}
