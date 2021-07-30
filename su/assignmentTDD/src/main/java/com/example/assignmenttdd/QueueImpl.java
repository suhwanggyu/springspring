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
        } else {
            q[rear] = value;
            rear = (rear + 1) % 100;
        }
    }

    @Override
    public Integer pop() {
        int x;
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        } else {
            x = q[front];
            q[front] = Integer.parseInt(null);
            front = (front + 1) % 100;
        }
        return x;
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
        if (rear > front) {
            return rear - front;
        } else {
            return 100 - front + rear;
        }
    }

    @Override
    public Integer front(){
        int numOfFront;
        if (empty()) {
            throw new NoElementException("큐가 비었습니다.");
        }
        /*
        front()랑 pop()이랑 큐니까 같은 메소드 아닌가요?
        다르다면 peek()같은 역할로하는 걸로 구현했습니다.
         */
        else {
            numOfFront = q[0];
        }
        return numOfFront;

    }

    @Override
    public Integer rear() {
        return null;
    }


}
