package com.example.assign1.queue;

public interface Queue {
    void add(Integer value);
    Integer pop();
    boolean full();
    boolean empty();
    int size();
    Integer front();
    int getFirst();
}
