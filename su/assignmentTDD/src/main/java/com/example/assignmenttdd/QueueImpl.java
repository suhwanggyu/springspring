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
        this.size = size;
        this.q = new int[size];
        this.front = -1;
        this.rear = -2;

    }


    @Override
    public void add(Integer value) {
        if (full()) {
            throw new NoEnoughSpaceException("큐가 꽉 차있습닠다.");
        } else {
            rear = (rear + 1) % size;
            q[rear] = value;
        }
    }

    @Override
    public Integer pop() {
        int x;
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        } else {
            front = (front + 1) % size;
            x = q[front];
            q[front] = Integer.parseInt(null);
        }
        return x;
    }

    @Override
    public boolean full() {
//        int d = rear - front;
//        if (d == -1 || d == N - 1) {
//            return true;
//        }
//        return false;
        return ((rear + 1) % this.size == front);

    }

    @Override
    public boolean empty() {
        return (front == rear) ? true : false;
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
        int numOfFront;
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        }
        /*
        front()랑 pop()이랑 큐니까 같은 메소드 아닌가요?
        다르다면 peek()같은 역할로하는 걸로 구현했습니다.
         */
        else {
            return q[(front + 1) % size];
        }
    }

    @Override
    public Integer rear() {
        int numOftail;
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        } else {
            numOftail = q[-1];
        }
        return numOftail;
    }


}
