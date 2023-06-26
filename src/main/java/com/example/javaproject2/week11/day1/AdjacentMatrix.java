package com.example.javaproject2.week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class AdjacentMatrix {
    // 목적: DFS 를 했을 때 정점 방문 순서 기록
    public static void recursive(
            // 다음(이번 호출)에서 방문할 곳
            int next,
            // 원활한 순회를 위한 maxNodes
            int maxNodes,
            // 인접 정점 정보(그래프 정보)
            int[][] adjMatrix,
            // 여태까지 방문한 정점 정보
            boolean[] visited,
            // 이부분은 구하고자 하는 목적에 따라 다름.
            // 방문 순서 기록을 위한 리스트
            List<Integer> visitOrder
    ) {
        visited[next] = true;
        visitOrder.add(next);
        // 반복문에서 재귀호출
        for (int i = 0; i < maxNodes; i++) {
            // 연결이 되어있으며, 방문한적 없을 때
            if (adjMatrix[next][i] == 1 && !visited[i]) {
                recursive(i, maxNodes, adjMatrix, visited, visitOrder);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer : 입력받은 문자열을 ' '또는 지정 변수를 기준으로 나누어 한 단어씩 반환해주는 도구
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxNodes = Integer.parseInt(st.nextToken()); // 8
        int edges = Integer.parseInt(st.nextToken()); // 10

        // 인접 행렬: 2차원 배열
        // 만약 노드가 1부터 N + 1 까지라면
        // 계산할 때 매번 -1을 해주거나
        // 인접 행렬을 한 칸 더 늘리거나
        int[][] adjMatrix = new int[maxNodes][maxNodes]; // 0에서 7까지 표현가능한 인접행렬
        // 간선의 갯수만큼 반복해서 입력을 받음
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());

            adjMatrix[startNode][endNode] = 1;
            adjMatrix[endNode][startNode] = 1;
        }

//        for (int[] row : adjMatrix) {
//            System.out.println(Arrays.toString(row));
//        }
        boolean[] visited = new boolean[maxNodes];
        List<Integer> visitedOrder = new ArrayList<>();

        recursive(0, maxNodes, adjMatrix, visited, visitedOrder);

        System.out.println(visitedOrder);
    }
}

// 정점의 갯수, 간선의 갯수
/*
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */
// 10개의 줄에 걸쳐서 간선이 연결된 정점들 (간선 정보)