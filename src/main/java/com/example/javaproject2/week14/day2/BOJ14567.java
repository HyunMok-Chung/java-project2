package com.example.javaproject2.week14.day2;

import com.example.javaproject2.week10.day2.QueueEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ14567 {
    // 선수과목 (Prerequisite)
    // 문제유형: DP, 그래프 이론, 위상 정렬
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());

        int lectures = Integer.parseInt(infoToken.nextToken());
        int preReqs = Integer.parseInt(infoToken.nextToken());

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < lectures + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < preReqs; i++) {
            StringTokenizer reqToken = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(reqToken.nextToken());
            int end = Integer.parseInt(reqToken.nextToken());
            adjList.get(start).add(end);
        }

        // 1. 진입 차수 정리
        int[] inDegrees = new int[lectures + 1];
        for (List<Integer> neighbors : adjList) {
            for (int neighbor : neighbors) {
                inDegrees[neighbor]++;
            }
        }

        // 2. 진입 차수에 따른 시작 정점 결정
        //    현재 정점까지 얼마나 걸리는지
        Queue<int[]> q = new LinkedList<>();
        for (int i = 1; i < lectures + 1; i++) {
            if (inDegrees[i] == 0) {
                q.offer(new int[]{i, 1});
            }
        }

        // 3. Queue 를 가지고 순회
        //    이떄 Queue 에 담기는 시점에 방문하고 있던 정점의
        //    소요 시간 정보를 같이 담음
        int[] firstSem = new int[lectures + 1];
        while (!q.isEmpty()) {
            int[] lecture = q.poll();
            int node = lecture[0];
            int semester = lecture[1];
            firstSem[node] = semester;

            for (int nextLec : adjList.get(node)) {
                inDegrees[nextLec]--;
                if (inDegrees[nextLec] == 0) {
                    q.offer(new int[]{nextLec, semester + 1});
                }
            }
        }

        // 정답 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < lectures + 1; i++) {
            sb.append(firstSem[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new BOJ14567().solution();
    }
}
