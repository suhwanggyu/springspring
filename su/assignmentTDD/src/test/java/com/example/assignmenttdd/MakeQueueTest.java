package com.example.assignmenttdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


@SpringBootTest
public class MakeQueueTest
{
    ArrayList<Integer> arr = new ArrayList<>();
    MakeQueueImpl q = new MakeQueueImpl(100, arr);

    @Test
    @DisplayName("큐가 비어있는지 확인하기")
    void checkIsEmpty()
    {
        MakeQueueImpl q = new MakeQueueImpl(100, arr);
        Assertions.assertThat(q.empty()).isEqualTo(true);

    }

    @Test
    @DisplayName("front 확인해보기")
    void checkFront()
    {

    }

    @Test
    void checkAdd()
    {

    }

    @Test
    void checkFull()
    {

    }

    @Test
    void checkPop()
    {

    }

    @Test
    void checkSize()
    {

    }

    @Test
    void checkRear()
    {

    }

}
