package com.example.assign1.queue;

import com.example.assign1.exception.NoElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(1, myQueue.front());
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

        assertEquals(1, myQueue.pop());
    }

    @Test
    void test_Pop_2() {
        myQueue.add(1);
        myQueue.pop();

        assertThrows(NoElementException.class, () -> {
           myQueue.pop();
        });
    }

    @Test
    void test_Front() {
        myQueue.add(1);
        myQueue.add(2);

        assertEquals(1, myQueue.front());
    }

    @Test
    void test_Size() {
        myQueue.add(1);
        myQueue.add(2);

        assertEquals(2, myQueue.size());
    }

    @Test
    void test_Is_Full() {
        for (int i = 0; i < 100; i++) {
            myQueue.add(i);
        }

        assertEquals(myQueue.full(), true);
    }

    @Test
    void test_Is_Empty() {
        myQueue.add(1);
        myQueue.pop();

        assertEquals(myQueue.empty(), true);
    }
}
