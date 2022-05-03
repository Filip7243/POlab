package com.Lab6;

public class Klient {

    private String imie;
    private String nazwisko;
    private double pieniadze;

    public Klient(String imie, String nazwisko, double pieniadze) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pieniadze = pieniadze;
    }

    public double getPieniadze() {
        return pieniadze;
    }

    public void setPieniadze(double pieniadze) {
        this.pieniadze = pieniadze;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
