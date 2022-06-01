package com.Lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Fill fill = new Fill();
        Queue<Command> c = fill.fillQueue();
        ThirdClass thirdClass = new ThirdClass();
        thirdClass.printQueue(c);
    }
}
