package com.Lab5;

public class Gatunek {

    private String nazwaRodzaju;
    private String nazwaGatunku;
    private int y; // liczba chromowomow 2n
    private int x; // podstawowoa liczba chromowsomow
    private String opis;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, int y, int x, String opis) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.y = y;
        this.x = x;
        this.opis = opis;
    }

    public Gatunek cloneGatunek() {
        return this;
    }

    public String showName() {
        return this.nazwaRodzaju + this.nazwaGatunku;
    }

    public int getY() {
        return this.y;
    }

    public String showAllInfo() {
        return "Nazwa Gatunku = " + this.nazwaGatunku + " Nazwa Rodzaju = " + this.nazwaRodzaju +
                " liczba chromosomow 2n = " + this.y + "" +
                " podstawowa liczba chromosowmow = " + this.x + " OPIS: " + this.opis;
    }




}
