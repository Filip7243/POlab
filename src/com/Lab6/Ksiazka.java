package com.Lab6;

public class Ksiazka {

    private String tytul;
    private String autor;
    private String wydawnictwo;
    private int rokWydania;
    private int iloscStron;
    private int cena;

    public Ksiazka(String tytul, String autor, String wydawnictwo, int rokWydania,
                   int iloscStron, int cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
        this.iloscStron = iloscStron;
        this.cena = cena;
    }

    public String opis() {
        return getClass().getSimpleName() + "\n" +
                "tytul=" + tytul + "\n" +
                ", autor=" + autor + "\n" +
                ", wydawnictwo=" + wydawnictwo + "\n" +
                ", rokWydania=" + rokWydania + "\n" +
                ", iloscStron=" + iloscStron + "\n" +
                ", cena=" + cena;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
