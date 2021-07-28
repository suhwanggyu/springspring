package com.example.assignmenttdd;

import com.example.assignmenttdd.exception.NoElementException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class MakeQueueTest
{
    /*
    인터페이스만 바라본다고 생각하기
     */
    ArrayList<Integer> arr = new ArrayList<>();
    MakeQueueImpl q = new MakeQueueImpl(100, arr);

    @Test
    @DisplayName("큐가 비어있는지 확인하기")
    public boolean checkIsEmpty()
    {
        //큐가 비어있는지 확인하려면 empty()했을때 true이면된다.
        assertThat(q).isEqualTo(true);
    }

    @Test
    @DisplayName("front 확인해보기")
    public void checkFront()
    {
    }

    @Test
    public void checkAdd()
    {

    }

    @Test
    public void checkFull()
    {

    }

    @Test
    public void checkPop()
    {

    }

    @Test
    public void checkSize()
    {

    }

    @Test
    public void checkRear()
    {

    }

}
