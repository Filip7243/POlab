package com.Lab8;

public class Adres {

    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;


    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        if(ulica == null) {
            throw new NieprawidlowyAdresException("Ulica nie moze byc nullem");
        } else {
            this.ulica = ulica;
        }
        if(numerDomu <= 0) {
            throw new NieprawidlowyAdresException("Numer domu nie mzoe byc mniejszy od 0");
        }else {
            this.numerDomu = numerDomu;
        }
        if(kodPocztowy == null) {
            throw new NieprawidlowyAdresException("kod pocztowy nie moze byc nullem");
        } else {
            this.kodPocztowy = kodPocztowy;
        }
        if(miasto == null) {
            throw new NieprawidlowyAdresException("miasto nie moze byc nullem");
        } else {
            this.miasto = miasto;
        }
    }
}
