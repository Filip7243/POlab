package com.Lab6;

public class Podrecznik extends Ksiazka{

    private String przedmiot; // do jakiego przedmiotu jest dany podrecznik

    public Podrecznik(String tytul, String autor, String wydawnictwo, int rokWydania) {
        super(tytul, autor, wydawnictwo, rokWydania);
    }
}
