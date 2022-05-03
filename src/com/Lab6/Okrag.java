package com.Lab6;

public class Okrag {

    private Punkt srodek;
    private double promien;

    public Okrag() {
        this.srodek = new Punkt(0,0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public boolean wSrodku(Punkt punkt) {
        return Math.pow((punkt.getX() - this.srodek.getX()),2)
                + Math.pow((punkt.getY() - this.srodek.getY()), 2) <= Math.pow(promien, 2);
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica() {
        return 2*promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }


}
