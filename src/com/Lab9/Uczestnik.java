package com.Lab9;

import java.util.Objects;

public class Uczestnik {

    private final int ID;
    private String imie;
    private int wiek;

    public Uczestnik(int ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, wiek);
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "ID=" + ID +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public int getID() {
        return ID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
