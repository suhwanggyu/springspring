package com.example.assignmenttdd;

import com.example.assignmenttdd.exception.NoElementException;
import com.example.assignmenttdd.exception.NoEnoughSpaceException;

public class QueueImpl implements Queue {
    private static final int MAXSIZE = 100;
    private int size;
    private int[] q;
    private int front;
    private int rear;

    public QueueImpl(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        q = new int[size];
    }


    @Override
    public void add(Integer value) {
        if (full()) {
            throw new NoEnoughSpaceException("큐가 꽉 차있습닠다.");
        } else {
            q[++rear] = value;
        }
    }

    @Override
    public Integer pop() {
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        } else {
            front = (front + 1) % size;
            return q[front];
        }
    }

    @Override
    public boolean full() {
        return (rear == this.size - 1);
    }

    @Override
    public boolean empty() {
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return front == rear;
    }

    @Override
    public int size() {
        if (rear > front) {
            return rear - front;
        } else {
            return size - front + rear;
        }
    }

    @Override
    public Integer front() {
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        } else {
            return q[front + 1];
        }
    }

}
