package com.Lab10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Fill fill = new Fill();
//        Queue<Command> c = fill.fillQueue();
//        ThirdClass thirdClass = new ThirdClass();
//        thirdClass.printQueue(c);

        // dla kalsy Kangur

//        List<Kangur> kangury = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            kangury.add(new Kangur(i));
//        }

//        for(int i = 0; i < kangury.size(); i++) {
//            kangury.get(i).skok();
//        }

//        Iterator<Kangur> i = kangury.listIterator();
//        while(i.hasNext()){
//            i.next().skok();
//        }

//        Map<String, Kangur> kangurMap = new HashMap<>();
//        int j = 0;
//        for (Kangur k : kangury) {
//            kangurMap.put("Jan" + j, k);
//            j++;
//        }
//        kangurMap.put("Ala0", new Kangur(1111));

//        Iterator<String> iMap = kangurMap.keySet().iterator();
//        while(iMap.hasNext()) {
//            String name = iMap.next();
//            System.out.println("imie " + name);
//            kangurMap.get(name).skok();
//        }

//        TreeMap<String, Kangur> treeKangur = new TreeMap<>(kangurMap);
//        LinkedHashMap<String, Kangur> kangurLinkedHashMap = new LinkedHashMap<>();
//
//        for(Map.Entry<String, Kangur> entry : treeKangur.entrySet()) {
//            String name = entry.getKey();
//            Kangur kangur = entry.getValue();
//            kangurLinkedHashMap.put(name, kangur);
//        }

        // dla klasy Stos

        Stos<String> stos = new Stos<>();
        String s = "+B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        String[] sTab = s.split("");
        for (int i = sTab.length - 1; i >= 0; i--) {
            stos.push(sTab[i]);
        }

        int pluses = 0;
        int minuses = 0;
        while (!stos.isEmpty()) {
            if(stos.peek().equals("+")) {
                pluses += 1;
                stos.pop();
                continue;
            }
            for(int i = 0; i < pluses; i++) {
                System.out.println(stos.pop());
            }
            if(stos.peek().equals("-")) {
                minuses += 1;
                stos.pop();
                continue;
            }
            for(int i = 0; i < minuses; i++) {
                System.out.println(stos.pop());
            }
        }


    }


}
