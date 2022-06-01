package com.Lab10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Filmy {

    private static Map<Integer, Film> films = new HashMap<>();

    public static boolean addFewElements() {
        films.put(1, new Horror(100, true));
        films.put(2, new Horror(66, false));
        films.put(3, new Komedia(120, false));
        films.put(4, new Komedia(99, true));
        return true;
    }

    public static void print() {
//        Iterator i = films.entrySet().iterator();
//        while(i.hasNext()) {
//            Map.Entry film = (Map.Entry) i.next();
//            System.out.println(film);
//        }

        for(Map.Entry<Integer, Film> entry : films.entrySet()) {
//            System.out.println("numer: " + entry.getKey() + " czas trwania: " + entry.getValue().getDuration() + " czy obejrzany: " + entry.getValue().isWatched());
            System.out.println(entry.getValue().info());
        }
    }

    public static void main(String[] args) {
        addFewElements();
        print();
    }
}
