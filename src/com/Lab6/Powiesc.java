package com.Lab6;

public class Powiesc extends Ksiazka{

    private String gatunek;
    private String epoka;

    public Powiesc(String tytul, String autor, String wydawnictwo,
                   int rokWydania, int iloscStron, int cena, String gatunek, String epoka) {
        super(tytul, autor, wydawnictwo, rokWydania, iloscStron, cena);
        this.gatunek = gatunek;
        this.epoka = epoka;
    }

    @Override
    public String opis() {
        return super.opis() + "\n" +
                ", epoka: " + this.epoka + "\n" +
                ", gatunek: " + this.gatunek;
    }
}
