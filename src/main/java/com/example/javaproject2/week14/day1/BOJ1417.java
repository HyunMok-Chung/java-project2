package com.example.javaproject2.week14.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ1417 {
    // 국회의원 선거 (실버5)
    // 문제유형: 그리디, 우선순위 큐, 시뮬레이션
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력부
        int candidates = Integer.parseInt(br.readLine());
        // 첫 줄이 내 득표수
        int myVote = Integer.parseInt(br.readLine());
        // 제일 많은 득표자의 표를 먼저 뺏어야하니까 (max 우선순위) max Heap 의 형태
        PriorityQueue<Integer> otherVotes
                = new PriorityQueue<>(Collections.reverseOrder());
        // 다솜이 빼고 나머지 표
        for (int i = 0; i < candidates - 1; i++) {
            otherVotes.offer(Integer.parseInt(br.readLine()));
        }

        // 알고리즘
        int answer = 0;
        // 단일 후보가 아닌 경우에만 계산을 진행
        if (!otherVotes.isEmpty()) {
            // 나머지 후보들 득표 중 최댓값이 나보다 작아질 때까지
            while (otherVotes.peek() >= myVote) {
                // 최다 득표자의 득표수
                int votes = otherVotes.poll();
                // 그 사람의 지지자를 매수, 다시 삽입
                otherVotes.offer(votes - 1);
                // 뺏은 표는 내 표로
                myVote++;
                // 매수 진행 횟수
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(new BOJ1417().solution());
    }
}
