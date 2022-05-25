package com.Lab9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Uczestnicy uczestnicy = new Uczestnicy();
        uczestnicy.addUczestnik(1, "Maciek", 16);

        System.out.println(uczestnicy);

        //zad 2
        Samochod[] s = new Samochod[10];

        for(int i = 0; i < s.length; i++) {
            s[i] = new Samochod(i);
        }
        List<Samochod> lista = new LinkedList<>();
        for(Samochod sa : s) {
            lista.add(sa);
        }
        lista.subList(0, 5).clear();

        // zad3
        List<Integer> numbers = new LinkedList<>();
        List<Integer> numbers2 = new LinkedList<>();
        for(int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        ListIterator<Integer> i = numbers.listIterator(numbers.size());
        while(i.hasPrevious()) {
            numbers2.add(i.previous());
        }
        
    }
}
