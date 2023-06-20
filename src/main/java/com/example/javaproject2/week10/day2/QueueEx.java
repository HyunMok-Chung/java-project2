package com.example.javaproject2.week10.day2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.add(2);
        System.out.println(q);
    }
}
