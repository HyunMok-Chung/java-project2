package com.example.javaproject2.week13.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CardPlay {
    // BOJ15903 카드 합체 놀이 실버1
    // 문제유형: 우선순위 큐, 그리디

    public long solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardCount = Integer.parseInt(st.nextToken());
        int actions = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 우선순위 큐에 넣어줌
        PriorityQueue<Long> smallestCards = new PriorityQueue<>();
        for (int i = 0; i < cardCount; i++) {
            smallestCards.offer(Long.parseLong(st.nextToken()));
        }

        // 두개의 숫자를 뽑아서 합한 뒤
        // 다시 우선순위 큐에 두번 넣어준다.
        for (int i = 0; i < actions; i++) {
            long first = smallestCards.poll();
            long second = smallestCards.poll();
            smallestCards.offer(first + second);
            smallestCards.offer(first + second);
        }

        long answer = 0;

        while (!smallestCards.isEmpty()) {
            answer += smallestCards.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new CardPlay().solution());
    }
}
