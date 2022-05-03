package com.Lab6;

class Prostokat extends Figura{
    double wys = 0, szer = 0;

    Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(String kolor, double wys, double szer) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(double x, double y) {
        this.punkt.przesun(x,y);
    }

    @Override
    String opis() {
        return super.opis();
    }
}