package com.example.javaproject2.week12.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ConferenceRoom {
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(br.readLine());
        int[][] meetings = new int[meetingCount][2];
        for (int i = 0; i < meetingCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        // 회의 정보를 종료시간 기준으로 정렬
        // 잉여함수라고함.
        Arrays.sort(meetings, (o1, o2) -> {
            // o1 = {시작시간, 종료시간}
            // o2도 {시작시간, 종료시간}
            // 종료시간이 다르면 종료시간 기준 비교
            if (o1[1] != o2[1]) return o1[1] - o2[1];
            // 아니라면 시작 시간 기준 비교
            return o1[0] - o2[0];
        });

        // 답안을 저장하기 위한 용도
        int answer = 0;
        // 마지막 종료 시간 저장용
        int lastEnd = 0;

        for (int i = 0; i < meetingCount; i++) {
            if (lastEnd <= meetings[i][0]) {
                lastEnd = meetings[i][1];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(new ConferenceRoom().solution());
    }
}
