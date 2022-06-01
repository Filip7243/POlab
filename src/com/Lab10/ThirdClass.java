package com.Lab10;

import java.util.Queue;

public class ThirdClass {

    public void printQueue(Queue<Command> c) {
        while(!c.isEmpty()) {
            c.poll().operation();
        }
    }
}
