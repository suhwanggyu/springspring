package com.example.assignmenttdd;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {
    private Queue q;

//    @Before
//    public void before() {
//        this.q = new QueueImpl();
//    }

    @Test
    public void Pop_FirstIn_FirstOut() {
        this.q = new QueueImpl();
        q.add(32);
        q.add(23);
        assertThat(32).isEqualTo(q.pop());
        assertThat(23).isEqualTo(q.pop());
    }

    @Test
    public void Add_InsertNumsCount_ExpectedNumsCount() {
        this.q = new QueueImpl();

        int x = q.size();
        for (int i = 0; i < 3; i++) {
            q.add((int) (Math.random() * 100 + 1));
        }
        int y = q.size();
        assertThat(x < y).isTrue();
    }

    @Test
    public void Empty_EmptyQueue_True() {
        this.q = new QueueImpl();

        for (int i = 0; i < 100; i++) {
            q.add((int) (Math.random() * 101 + 1));
        }
        for (int i = 0; i < 100; i++) {
            q.pop();
        }
        assertThat(q.empty()).isTrue();
    }

    @Test
    public void Empty_NotEmptyQueue_False() {
        this.q = new QueueImpl();

        q.add(2);
        assertThat(q.empty()).isFalse();
    }


//    @Test
//    public void Pop_ExecutePopWhenQIsEmpty_ThrowsNoElementException() {
//        assertThat(NoElementException.class, () -> q.pop());
//    }
//
//    @Test
//    public void Front_ExecuteFrontWhenQIsEmpty_ThrowsNoElementException() {
//        assertThrows(NoElementException.class, () -> q.front());
//    }

    @Test
    public void Full_QueueSizeIs100_True() {
        this.q = new QueueImpl();

        for (int i = 0; i < 100; i++) {
            q.add((int) (Math.random() * 101 + 1));
        }
        assertThat(q.full()).isTrue();
    }

    @Test
    public void Full_QueueSizeLessThan100_False() {
        this.q = new QueueImpl();

        for (int i = 0; i < 100; i++) {
            q.add((int) (Math.random() * 101 + 1));
        }
        q.pop();
        q.pop();
        assertThat(q.full()).isFalse();

    }

    @Test
    public void Front_InsertNum_FrontNumOfQueueIsSame() {
        this.q = new QueueImpl();

        q.add(32);
        assertThat(q.front()).isEqualTo(32);
    }

    @Test
    public void Size_CountOfUsingAddMethod_CountOfElementsInQueue() {
        this.q = new QueueImpl();

        q.add(32);
        q.add(88);
        q.add(12);
        assertThat(q.size()).isEqualTo(3);
    }


}
