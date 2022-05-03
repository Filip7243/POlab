package com.Lab6;

public class Ksiazka {

    private String tytul;
    private String autor;
    private String wydawnictwo;
    private int rokWydania;

    public Ksiazka(String tytul, String autor, String wydawnictwo, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }

    public String opis() {
        return "Ksiazka {" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", rokWydania=" + rokWydania +
                '}';
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
}
