package com.example.assignmenttdd;

import java.util.ArrayList;

public class QueueImpl implements MakeQueue
{
    private int MAXSIZE = 100;
    private ArrayList<Integer> arr = new ArrayList<>();

    public QueueImpl(int MAXSIZE, ArrayList<Integer> arr)
    {
        this.MAXSIZE = MAXSIZE;
        this.arr = arr;
    }

    @Override
    public void add(Integer value)
    {

    }

    @Override
    public Integer pop()
    {
        return null;
    }

    @Override
    public boolean full()
    {
        return false;
    }

    @Override
    public boolean empty()
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public Integer front()
    {
        return null;
    }

    @Override
    public Integer rear()
    {
        return null;
    }
}
