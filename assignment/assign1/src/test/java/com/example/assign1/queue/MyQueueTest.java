package com.example.assign1.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MyQueueTest {

    private MyQueue myQueue;

    @BeforeEach
    void init_Queue() {
        this.myQueue = new MyQueue();
    }

    @Test
    void test_Constructor() {
        MyQueue myQueue = new MyQueue();
    }

    @Test
    void test_Add() {
        myQueue.add(1);
        int expectedValue = 1;
        assertThat(1).isEqualTo(expectedValue);
    }

    @Test
    void test_Pop() {
        myQueue.add(1);
        myQueue.add(2);

        assertThat(1).isEqualTo(myQueue.pop());
    }

    @Test
    void test_Front() {
        myQueue.add(1);
        myQueue.add(2);

        assertThat(1).isEqualTo(myQueue.front());
    }

    @Test
    void test_Size() {
        myQueue.add(1);
        myQueue.add(2);

        assertThat(2).isEqualTo(myQueue.size());
    }

    @Test
    void test_Is_Full() {
        for (int i = 0; i < 100; i++) {
            myQueue.add(i);
        }
        assertThat(myQueue.full()).isEqualTo(true);
    }
}
