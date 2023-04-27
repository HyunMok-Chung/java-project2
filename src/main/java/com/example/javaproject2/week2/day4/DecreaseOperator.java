package com.example.javaproject2.week2.day4;

public class DecreaseOperator {
    public static void main(String[] args) {
        int i = 10;
        // --가 뒤에 오는 경우 --> 은행에서 빌린 돈
        // i -= 1과 같은 뜻
        System.out.println(i--);
        System.out.println(i);
        // -- 가 앞에 오는 경우 --> 사채에서 빌린 돈(일단 떼고 준다)
        // i -= 1로는 표현할 수 없다.
        System.out.println(--i);
        System.out.println(i);
    }
}
