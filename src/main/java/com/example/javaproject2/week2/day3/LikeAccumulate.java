package com.example.javaproject2.week2.day3;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        System.out.println(likeCount);  // 좋아요를 한개만 받은 경우

        likeCount = likeCount + 1;
        System.out.println(likeCount);  // 좋아요를 한개 더 받은 경우

        likeCount = likeCount + 1;  // 좋아요를 취소한 경우
        System.out.println(likeCount);

    }
}
