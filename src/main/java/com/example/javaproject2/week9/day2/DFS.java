package com.example.javaproject2.week9.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {  // 깊이 우선 탐색
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 첫 입력은 정점의 갯수
        int maxNodes = Integer.parseInt(reader.readLine());
        // 정점간 연결 정보
        int[][] edgeMap = new int[maxNodes + 1][maxNodes + 1];

        // 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
        String[] edges = reader.readLine().split(" ");

        // DFS를 할때 연결 정보를 표현하는 방식은 크게 두가지가 있는데,
        // 아래는 2차원 배열을 좌표로 구분하는 방법이다.
        // 2개씩 순회
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]); // 0, 2, 4 ...
            int rightNode = Integer.parseInt(edges[i * 2 + 1]); // 1, 3, 5 ...
            edgeMap[leftNode][rightNode] = 1;
            edgeMap[rightNode][leftNode] = 1;
        }

        // 다음에 방문할 점들을 담아두는 스택
        Stack<Integer> toVisit = new Stack<>();
        List<Integer> visitedOrder = new ArrayList<>();
        // 방문처리 배열
        boolean[] visited = new boolean[maxNodes + 1];
        // 여기부터 DFS

        // 첫 방문 대상 선정
        int next = 1;
        // 스택에 push
        toVisit.push(next);
        // 스택이 빌때까지 반
        while (!toVisit.empty()) {
            // 다음 방문할 곳을 가져온다.
            next = toVisit.pop();
            // 이미 방문했다면 다음 반복으로
            if (visited[next]) continue;

            // 방문했다 표시
            visited[next] = true;
            // 방문한 순서 기록
            visitedOrder.add(next);

            // 다음 방문 대상을 검색한다.
            // 큰 상관은 없지만, 더 작은 숫자부터 방문하려면 스택에 역순으로 넣는다.
            for (int i = maxNodes; i > 0; i--){
                if (edgeMap[next][i] == 1 && !visited[i]) {
                    toVisit.push(i);
                }
            }
        }

        // 출력
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new DFS().solution();
    }

}