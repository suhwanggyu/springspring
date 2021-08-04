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
    void add_InsertNumbers_ReturnFirstNumber() {
        myQueue.add(1);

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
    void pop_InsertNumbers_ReturnQueueFrontNumber() {
        myQueue.add(1);
        myQueue.add(2);

        assertEquals(1, myQueue.pop());
    }

    @Test
    void pop_QueueIsEmpty_ExceptionThrown() {
        myQueue.add(1);
        myQueue.pop();

        assertThrows(NoElementException.class, () -> {
           myQueue.pop();
        });
    }

    @Test
    void front_FirstNumberInQueue_IsEqual() {
        myQueue.add(1);
        myQueue.add(2);

        assertEquals(1, myQueue.front());
    }

    @Test
    void size_QueueSize_IsEqual() {
        myQueue.add(1);
        myQueue.add(2);

        assertEquals(2, myQueue.size());
    }

    @Test
    void isFull_QueueSizeFull_True() {
        for (int i = 0; i < 100; i++) {
            myQueue.add(i);
        }

        assertTrue(myQueue.full());
    }

    @Test
    void isEmpty_QueueSizeZero_True() {
        myQueue.add(1);
        myQueue.pop();

        assertTrue(myQueue.empty());
    }
}
