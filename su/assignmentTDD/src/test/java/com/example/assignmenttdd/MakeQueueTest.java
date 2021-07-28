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
        if (q.size() == 0)
        {
            Assertions.assertThat(0);
        }
        /*
        근데 이게 왜 성공하는 거죠????size를 구현을 안했는데...먼저
        size를 구현해야지 이게 말이 될거같은데요...
        아 해결했습니다. size가 return을 0을 하고 있군요.
        그래도 이 방법은 틀린 테스트 방법인거 같다.
         */
    }

    @Test
    @DisplayName("front 확인해보기")
    void checkFront()
    {
        if (q.front() == 0)
        {
            Assertions.assertThat(4545);
        }
        else
        {
            Assertions.assertThat(4545);

        }
    }
}
