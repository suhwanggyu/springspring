package com.example.assignmenttdd;

import com.example.assignmenttdd.exception.NoElementException;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue q;

    @Before
    public void before() {
        q = new QueueImpl();
    }

    @Test
    public void Pop_FirstIn_FirstOut() {
        q.add(32);
        q.add(23);
        assertEquals(23, q.pop());
        assertEquals(32, q.pop());
    }

    @Test
    public void Add_InsertNumsCount_ExpectedNumsCount() {
        int x = q.size();
        for (int i = 0; i < 3; i++) {
            q.add((int)(Math.random() * 100 + 1));
        }
        int y = q.size();
        assertTrue(x < y);
    }

    @Test
    public void Empty_EmptyQueue_True() {
        assertTrue(q.empty());
    }

    @Test
    public void Empty_NotEmptyQueue_False() {
        q.add(2);
        assertFalse(q.empty());
    }

    @Test
    public void Pop_ExecutePopWhenQIsEmpty_ThrowsNoElementException() {
        assertThrows(NoElementException.class, () -> q.pop());
    }

    @Test
    public void Front_ExecuteFrontWhenQIsEmpty_ThrowsNoElementException() {
        assertThrows(NoElementException.class, () -> q.front());
    }

    @Test
    public void Full_QueueSizeIs100_True() {
        for (int i = 0; i < 100; i++) {
            q.add((int)(Math.random() * 101 + 1));
        }
        assertTrue(q.full());
    }

    @Test
    public void Full_QueueSizeLessThan100_False() {
        for (int i = 0; i < 100; i++) {
            q.add((int)(Math.random() * 101 + 1));
        }
        q.pop();
        q.pop();
        assertFalse(q.full());
    }

    @Test












}
