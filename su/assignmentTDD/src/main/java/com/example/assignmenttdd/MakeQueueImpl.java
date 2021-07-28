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
        if (empty())
        {
            return;
        }
        q.add(rear++, value);
        //index, value
    }

    @Override
    public Integer pop()
    {
        if (empty())
        {
            return null;
        }
        int popValue = q.get(front++);
        q.remove(popValue);
        /**
         * 이거테스트 무조건해보기 인덱스가 떨어지는지 값이 떨어지는지
         * 지금 TDD를 사용안하고있음.
         */
        return popValue;
    }

    @Override
    public boolean full()
    {
        if (rear == MAXSIZE - 1) //0부터 시작하니까.
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
        if (front() == null && rear() == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /*
    현재 담담 요소의 개수
     */
    @Override
    public int size()
    {
//        return front - rear;
        return rear - front;
    }

    @Override
    public Integer front()
    {
        /**
         * 이거 프론트값나오게하기
         */
        return null;
    }

    @Override
    public Integer rear()
    {
        /**
         * rear값 나오게하기 peek()같은거.
         */
        return null;
    }
}
