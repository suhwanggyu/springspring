package com.example.assignmenttdd;

import java.util.ArrayList;

public class MakeQueueImpl implements MakeQueue
{
    static int MAXSIZE = 100;
    static ArrayList<Integer> arr;
    static int front; //pop할때 참조할 인덱스
    static int rear; // push할때 참조할 인덱스
//    int[] arr;

    public MakeQueueImpl()
    {
        front = 0;
        rear = 0;
        arr = new ArrayList<>();
    }


    @Override
    public void add(Integer value)
    {
        arr.add(value);
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
        return front == rear;
    }

    /*
    현재 담담 요소의 개수
     */

    @Override
    public int size()
    {
        return front - rear;
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
