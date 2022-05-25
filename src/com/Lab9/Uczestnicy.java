package com.Lab9;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Uczestnicy {

    private List<Uczestnik> uczestnicy = new LinkedList<>();

    //identyczne dzialanie jest dla ArrayList
    public boolean addUczestnik(int ID, String imie, int wiek) {
        if(wiek > 18) {
            return this.uczestnicy.add(new Uczestnik(ID, imie, wiek));
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnicy that = (Uczestnicy) o;
        return Objects.equals(uczestnicy, that.uczestnicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uczestnicy);
    }

    @Override
    public String toString() {
        return "Uczestnicy{" +
                "uczestnicy=" + uczestnicy +
                '}';
    }
}
