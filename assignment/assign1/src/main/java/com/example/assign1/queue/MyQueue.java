package com.example.assign1.queue;

public class MyQueue<T> implements Queue{

    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(Integer value) {
        Node newData = new Node(value);

        if (first == null) {
            first = newData;
            last = first;
        } else {
            last.setNextNode(newData);
            last = newData;
        }
    }

    @Override
    public int getFirst() {
        return first.getData();
    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Integer front() {
        return null;
    }
}
