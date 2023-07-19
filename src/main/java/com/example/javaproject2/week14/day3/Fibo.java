package com.example.javaproject2.week14.day3;

import java.sql.SQLOutput;

public class Fibo {
    // n 을 입력받고 n 번쨰 피보나치 수열 출력
    public int fiboSimple(int n) {
        // n == 0, 1, 2
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        // F(n) == F(n - 1) + F(n - 2)
        return fiboSimple(n - 1) + fiboSimple(n - 2);
    }

    // 외부에서 호출하기 위한 메소드
    public int fiboMemo(int n) {
        return fiboMemoRe(n, new int[n + 1]);
    }

    private int fiboMemoRe(int n, int[] memo) {
        // n == 0, 1, 2
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        // F(n) == F(n - 1) + F(n - 2)
        // 만약에 이미 구해본 결과가 있다면 memo 에 저장이 되어 있을거다.
        // 그것을 확인해보자
        else if (memo[n] == 0) {
            //  만약 아직 없으면 구해서 기록
            memo[n] = fiboMemoRe(n - 1, memo) + fiboMemoRe(n - 2, memo);
        }
        // memo[n] 이 있다면, 해당 값이 지금 구하고자 하는 n 번째 피보나치 수열 값
        return memo[n];
    }

    public int fiboTab(int n) {
        if(n==0) return 0;
        if(n==1||n==2) return 1;

        // 계산결과 기록용 배열
        int[] fib = new int[n + 1];
        // 알고있는 결과는 미리 기록
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
//        System.out.println(new Fibo().fiboSimple(10));
        Fibo fibo = new Fibo();
        int n = 20;
        // fiboSimple 계산
        long start = System.nanoTime();
        System.out.println("fiboSimple");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(fibo.fiboSimple(i)).append(" ");
        }
        System.out.println(sb);
        System.out.println(System.nanoTime() - start);
        System.out.println();

        // fiboMemo 계산
        start = System.nanoTime();
        System.out.println("fiboMemo");
        sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(fibo.fiboMemo(i)).append(" ");
        }
        System.out.println(sb);
        System.out.println(System.nanoTime() - start);
        System.out.println();
    }
}
