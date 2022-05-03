package com.Lab6;

import java.util.ArrayList;

public class Ksiegarnia {

    private ArrayList<Ksiazka> ksiazki;
    private ArrayList<Klient> klienci;

    public Ksiegarnia() {
        this.ksiazki = new ArrayList<>();
        this.klienci = new ArrayList<>();
    }

    public boolean dodajKsiazke(Ksiazka ksiazka) {
        return !this.ksiazki.contains(ksiazka) && this.ksiazki.add(ksiazka);
    }

    public boolean sprzedajKsiazke(Ksiazka ksiazka, Klient klient) {
        if((klient.getPieniadze() >= ksiazka.getCena()) && this.klienci.contains(klient)) {
            System.out.println(ksiazka.opis() + " została sprzedana");
            this.ksiazki.remove(ksiazka);
            klient.setPieniadze(klient.getPieniadze() - ksiazka.getCena());
            return true;
        }

        return false;
    }

    public boolean dodajKilenta(Klient klient) {
        return this.klienci.add(klient);
    }

    public boolean usunKlienta(Klient klient) {
        return this.klienci.contains(klient) && this.klienci.remove(klient);
    }

    public ArrayList<Ksiazka> getKsiazki() {
        return new ArrayList<>(ksiazki);
    }

    public ArrayList<Klient> getKlienci() {
        return new ArrayList<>(klienci);
    }
}
