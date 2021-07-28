package com.example.assignmenttdd;

public interface MakeQueue
{
    void add(Integer value);
    Integer pop();
    boolean full(); //꽉 차 있는지 확인
    boolean empty(); //비어있는지
    int size(); //지금 들어가있는 데이터의 수
    Integer front(); //pop할 떄 참조할 것
    Integer rear(); //push할 때 참조할 것
}
