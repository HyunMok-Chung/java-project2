package com.example.javaproject2.week13.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Nnum {
    // BOJ 2075 N 번째 수 실버2
    // 문제유형: 우선순위 큐, 정렬

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        // 우선순위 큐를 만든다.
        // 최솟값이 먼저 나오는 우선순위 큐
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            // 숫자 입력을 지속적으로 받으면서
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                priorityQueue.offer(Integer.parseInt(st.nextToken()));
                // 우선순위 큐의 크기를 일정하게 유지
                if (priorityQueue.size() > n) {
                    // n 개의 숫자만 남기고
                    // 작은 숫자를 우선순위 큐에서 빼고 있기 때문에
                    // 최종적으로 남는 숫자 n 개는 큰 숫자 n 개
                    priorityQueue.poll();
                }
            }
        }

        // 특히 Top 에 있는 마지막 원소는 N 번째로 큰 숫자
        return priorityQueue.peek();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Nnum().solution());
    }
}
