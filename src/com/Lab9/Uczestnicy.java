package com.Lab9;

import java.util.LinkedList;
import java.util.List;

public class Uczestnicy {

    private List<Uczestnik> uczestnicy = new LinkedList<>();

    //identyczne dzialanie jest dla ArrayList
    public boolean addUczestnik(int ID, String imie, int wiek) {
        if(wiek > 18) {
            return this.uczestnicy.add(new Uczestnik(ID, imie, wiek));
        }
        return false;
    }
}
