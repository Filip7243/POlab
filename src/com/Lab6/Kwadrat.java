package com.Lab6;

public class Kwadrat extends Prostokat{

    private double a; //bok

    public Kwadrat(String kolor, double a) {
        super(kolor, a, a);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    String opis() {
        return super.opis();
    }
}
