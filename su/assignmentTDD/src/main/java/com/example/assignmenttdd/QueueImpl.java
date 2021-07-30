package com.example.assignmenttdd;

public class QueueImpl implements Queue {
    private static final int MAXSIZE = 100;

    private int[] q;
    private int front;
    private int rear;
    private int size;

    public QueueImpl() {
        this.q = new int[MAXSIZE];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }


    @Override
    public void add(Integer value) {
    }

    @Override
    public Integer pop() {

    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public boolean empty() {
        return front == rear;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Integer front() {
        return null;
    }

    @Override
    public Integer rear() {
        return null;
    }


}
