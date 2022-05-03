package com.Lab6;

public class Podrecznik extends Ksiazka{

    private String przedmiot; // do jakiego przedmiotu jest dany podrecznik

    public Podrecznik(String tytul, String autor, String wydawnictwo, int rokWydania, int iloscStron, int cena, String przedmiot) {
        super(tytul, autor, wydawnictwo, rokWydania, iloscStron, cena);
        this.przedmiot = przedmiot;
    }

    @Override
    public String opis() {
        return super.opis() + "\n" +
                ", przedmiot: " + this.przedmiot;
    }
}
