package com.example.assign1.queue;

public class MyQueue {

    private Node first;
    private Node last;

    public void add(int i) {
        Node newData = new Node(i);

        if (first == null) {
            first = newData;
            last = first;
        } else {
            last.setNextNode(newData);
            last = newData;
        }
    }
}
