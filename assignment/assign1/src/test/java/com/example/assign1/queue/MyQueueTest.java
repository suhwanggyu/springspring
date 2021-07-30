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
        myQueue.add(2);

        assertThat(1).isEqualTo(myQueue.front());
    }

//    @Test
//    void test_If_Size_Over() {
//        for (int i = 0; i < 101; i++) {
//            myQueue.add(i);
//        }
//        assertThat(myQueue.size()).isEqualTo(100);
//    }

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

    @Test
    void test_Is_Empty() {
        myQueue.add(1);
        myQueue.pop();

        assertThat(myQueue.empty()).isEqualTo(true);
    }
}
