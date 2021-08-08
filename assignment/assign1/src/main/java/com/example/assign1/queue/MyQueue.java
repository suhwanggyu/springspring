package com.example.assign1.queue;

import com.example.assign1.exception.NoElementException;
import com.example.assign1.exception.NoEnoughSpaceException;

public class MyQueue implements Queue{

    static final int QUEUE_SIZE = 100;

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public void add(Integer value) {

        if (size >= QUEUE_SIZE)
            throw new NoEnoughSpaceException("Queue is full!");

        Node newData = new Node(value);
        if (first == null) {
            first = newData;
            last = first;
        } else {
            last.setNextNode(newData);
            last = newData;
        }
        size++;

    }

    @Override
    public Integer pop() {

        if (first == null) {
            throw new NoElementException("Queue is empty!");
        } else {
            int data = first.getData();
            first = first.getNextNode();
            size--;

            return data;
        }
    }

    @Override
    public boolean full() {
        return size >= QUEUE_SIZE;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Integer front() {
        return first.getData();
    }
}
