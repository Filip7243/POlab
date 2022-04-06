package com.Lab5;

public class Main {

    public static void main(String[] args) {
        //zad 1:
//        Rectangle rectangle = new Rectangle(10, 2);
//
//        System.out.println("Pole = " + rectangle.getArea());
//        System.out.println("Obwod = " + rectangle.getCircuit());
//        System.out.println("Przekatna = " + rectangle.getDiagonal());
        //zad 2:
//        Building b1 = new Building("ABC", 2002, 4);
//        Building b2 = new Building("DEF", 2000, 18);
//        Building b3 = new Building("GHI", 1944, 10);
//
//        b1.printInfo();
//        System.out.println(b1.getBuildingAge());
//        System.out.println("*******************");
//        b2.printInfo();
//        System.out.println(b2.getBuildingAge());
//        System.out.println("*******************");
//        b3.printInfo();
//        System.out.println(b3.getBuildingAge());

        //zad 3:
        Gatunek gatunek = new Gatunek("ABC", "DEF", 10, 11, "BARDZO FAJNY GATUNEK");
        Gatunek gatunekKopia = gatunek.cloneGatunek();
        System.out.println(gatunekKopia.showAllInfo());
        System.out.println(gatunek.showAllInfo());
        System.out.println(gatunek.getY());
        System.out.println(gatunek.showName());
    }
}
