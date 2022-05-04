package com.Lab7;

public class Main {

    public static void main(String[] args) {
        Samolot samolot = new Samolot();
        Statek statek = new Statek();
        Samochod samochod = new Samochod();

        samochod.jedz();
        samolot.latanie();
        statek.plynie();

        Wieloryb wieloryb = new Wieloryb();

    }
}
