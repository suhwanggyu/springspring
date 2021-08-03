package com.example.assignment2_su;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderMain {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("번호를 선택하시오.");
        System.out.println("1. 주문하기 \n2. 주문 조회 하기 ");

        int x = Integer.parseInt(br.readLine());
        if (x == 1) {
            System.out.println("선택하실 피자 번호를 입력하세요.");
            System.out.println("1. 페퍼로니 피자\n2. 하와이안 피자\n3. 불고기 피자\n4. 치즈피자");
        }

        if (x == 2) {

        }


    }
}
