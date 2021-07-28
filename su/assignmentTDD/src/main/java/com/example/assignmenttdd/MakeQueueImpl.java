package com.example.assignmenttdd;

import java.util.ArrayList;

public class MakeQueueImpl implements MakeQueue
{
    private int MAXSIZE = 100;
    private ArrayList<Integer> q = new ArrayList<>();
    private int front;
    private int rear;

    public MakeQueueImpl(int MAXSIZE, ArrayList<Integer> q)
    {
        this.MAXSIZE = MAXSIZE;
        this.q = q;
        front = 0;
        rear = 0;
    }

    @Override
    public void add(Integer value)
    {

    }

    @Override
    public Integer pop()
    {

    }

    @Override
    public boolean full()
    {

    }

    @Override
    public boolean empty()
    {

    }

    /*
    현재 담담 요소의 개수
     */
    @Override
    public int size()
    {

    }

    @Override
    public Integer front()
    {

    }

    @Override
    public Integer rear()
    {

    }
}
