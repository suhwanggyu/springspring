package com.example.assignmenttdd;

import java.util.ArrayList;

public class MakeQueueImpl implements MakeQueue
{
    static int MAXSIZE = 100;
//    static ArrayList<Integer> arr;
    static int[] arr;
    static int front; //pop할때 참조할 인덱스
    static int rear; // push할때 참조할 인덱스
//    int[] arr;

    public MakeQueueImpl()
    {
        front = 0;
        rear = 0;
//        arr = new ArrayList<>();
        arr = new int[MAXSIZE];
    }


    @Override
    public void add(Integer value)
    {
        if (full())
        {
            return;
        }
        else
        {
//            arr.add(rear++, value);
            arr[rear++] = value;
        }
    }

    @Override
    public Integer pop()
    {
        if (empty())
        {
            System.out.println("pop할것이 없음.");
            return -1;
        }
        else
        {
//            int x = arr.remove(front++);
//            return x;
            int x = arr[front++];
            return x;
        }

    }

    @Override
    public boolean full()
    {
        if (rear == 99)
        {
            return true;
        }
        else
        {
            return false;
        }
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
        return arr.length;
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
