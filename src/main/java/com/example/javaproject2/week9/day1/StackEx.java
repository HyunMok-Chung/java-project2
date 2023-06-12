package com.example.javaproject2.week9.day1;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 10; i++) {
            st.push(i);
        }
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
    }
}
