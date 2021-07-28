package com.example.assignmenttdd;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


//@SpringBootTest
public class MakeQueueTest
{
    /*
    인터페이스만 바라본다고 생각하기
     */

    ArrayList<Integer> arr;
    MakeQueueImpl q;

    @Before
    void before()
    {
        arr = new ArrayList<>();
        q = new MakeQueueImpl();
    }

    @Test
    @DisplayName("큐가 비어있는지 확인하기")
    public void checkIsEmpty()
    {
        //큐가 비어있는지 확인하려면 empty()했을때 true이면된다.
        //성공
        org.junit.jupiter.api.Assertions.assertTrue(true);
    }


    @Test
    @DisplayName("front 확인해보기")
    public void checkFront()
    {
    }

    @Test
    public void checkAdd()
    {
        //add는 하나를 넣었으면 그전꺼보다 사이즈가 하나 늘어나 있어야함.
        int x = q.size();
        q.add(1);
        int y = q.size();
        org.junit.jupiter.api.Assertions.assertTrue(x < y);
    }

    @Test
    public void checkFull()
    {
        //꽉 차있다는건 size가 100일때 테스트가 성공하도록
        Assertions.assertThat(q.size()).isEqualTo(100);
        //이 부분 살짝 문제있음. 100이 되는게 이상함.
    }

    @Test
    public void checkPop()
    {
        //pop은 하나를 제거하면 사이즈가 하나 줄어든걸로 확인가능
        int x = q.size();
        q.pop();
        int y = q.size();
        org.junit.jupiter.api.Assertions.assertTrue(x > y);
    }

    @Test
    public void checkSize()
    {
        //두개 집어넣었을 때, rear값이 올라가니, 차이가 2차이가 늘어나는지 확인
        q.add(3);
        q.add(58);
        assertThat(q.size()).isEqualTo(2);

    }

    @Test
    public void checkRear()
    {

    }



}
