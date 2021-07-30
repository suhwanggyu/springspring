package com.example.assignmenttdd;

import com.example.assignmenttdd.exception.NoElementException;
import com.example.assignmenttdd.exception.NoEnoughSpaceException;

public class QueueImpl implements Queue {
    private static final int MAXSIZE = 100;
    private int size = 0;
    private int[] q;
    private int front = 0;
    private int rear = 0;
    private int capacity;

    public QueueImpl(int capacity) {
        this.capacity = capacity;
        this.q = new int[capacity];
    }

    public QueueImpl() {
        this.capacity = MAXSIZE;
        this.q = new int[capacity];
    }

    @Override
    public void add(Integer value) {
        if (full()) {
            throw new NoEnoughSpaceException("큐가 꽉 차있습닠다.");
        }
        this.q[rear] = value;
        this.rear = (this.rear + 1) % capacity;

        size++;
    }

    @Override
    public Integer pop() {
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        }
        int x = this.q[front];
        this.q[front] = 0;
        this.front = (this.front + 1) % capacity;

        size--;
        return x;
    }

    @Override
    public boolean full() {
        return size == capacity;
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
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        }
        return this.q[front];
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        for (int i = 0; i < 90; i++) {
            q.add((int) Math.random() * 100 + 1);
        }
        System.out.println("q.size = " + q.size);
    }

}
