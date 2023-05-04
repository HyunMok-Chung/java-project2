package com.example.javaproject2.week3.day4;

import java.util.Arrays;

public class P120852B {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1]; // 12개나 만들어야하나?
        // dynamic programming
//         List, Set, Map

        for (int i = 2; n > 1; i++) {
            System.out.println(i);
            if (n % i == 0) { // 나누어 떨어지는지?
                arr[divisor] = i;
                n /= i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
