package com.Lab10;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

public class Fill {

    private Queue<Command> queue = new LinkedList<>();

    public Queue<Command> fillQueue() {
        queue.add(new Command("abc"));
        queue.add(new Command("def"));
        queue.add(new Command("ghi"));
        queue.add(new Command("jkl"));
        return this.queue;
    }
}
