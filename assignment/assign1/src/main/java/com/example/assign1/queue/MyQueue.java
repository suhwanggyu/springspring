package com.example.assign1.queue;

import com.example.assign1.exception.NoElementException;

public class MyQueue implements Queue{

    private Node first;
    private Node last;

    @Override
    public void add(Integer value) {
        Node newData = new Node(value);

        if (first == null) {
            first = newData;
            last = first;
        } else {
            last.setNextNode(newData);
            last = newData;
        }
    }

    @Override
    public Integer pop() throws NoElementException {
        if (first == null) {
            throw new NoElementException("Queue is empty");
        }

        int data = first.getData();
        first = first.getNextNode();

        return data;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Integer front() {
        return null;
    }
}
