package com.example.assignmenttdd;

import com.example.assignmenttdd.exception.NoElementException;
import com.example.assignmenttdd.exception.NoEnoughSpaceException;

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
        if (full()) {
            throw new NoEnoughSpaceException("큐가 꽉 차있습닠다.");
        }
    }

    @Override
    public Integer pop() {
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        }
    }

    @Override
    public boolean full() {
        int N = rear - front;
        if (N == -1 || N == MAXSIZE - 1) {
            return true;
        }
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
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        }
    }

    @Override
    public Integer rear() {
        return null;
    }


}
