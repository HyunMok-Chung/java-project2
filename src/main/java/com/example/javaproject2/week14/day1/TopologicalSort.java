package com.example.javaproject2.week14.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TopologicalSort {
    // 위상정렬
    private List<List<Integer>> adjList;
    private int nodes;

    public void topologicalSort() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정점 갯수 기록
        nodes = Integer.parseInt(st.nextToken());
        // 간선 갯수 기록
        int edges = Integer.parseInt(st.nextToken());
        adjList = new ArrayList<>();
        // 연결 리스트 초기화
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        // 그래프 입력받기
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adjList.get(start).add(end);
        }

        kahn();
    }

    // nodes: 정점의 갯수, adjList: 연결 리스트
    private void kahn() {
        // 1. 진입 차수를 구한다
        int[] inDegrees = new int[nodes];
        // neighbors: 각 정점에서 도달할 수 있는 정점들 리스트
        for (List<Integer> neighbors : adjList) {
            // neighbor: 그 정점에서 도달 가능한 정점들(개별)
            for (int neighbor : neighbors) {
                // 그들의 진입차수를 높여라
                inDegrees[neighbor]++;
            }
        }

        // 2. 진입 차수가 0인 정점을 Queue 에 삽입
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nodes; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        // 3. Queue 가 비어있지 않은 동안
        while (!queue.isEmpty()) {
            // 3-1. 이번 정점 기록
            int node = queue.poll();
            result.add(node);

            // 3-2. 현재 정점의 인접 정점들의 진입 차수를 줄인다.
            for (int neighbor: adjList.get(node)) {
                inDegrees[neighbor]--;
                // 3-3. 진입 차수가 0이 되면 방문 가능 (Queue 에 삽입)
                if (inDegrees[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // 4. 결과 확인. 실제 정점 갯수보다 위상정렬 정점 갯수가 적으면 불가
        if (result.size() < nodes) {
            System.out.println(new ArrayList<>());
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        new TopologicalSort().topologicalSort();
    }
}
/*
7 8
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6

 */

/*
7 9
0 1
0 2
1 3
1 4
2 3
2 6
3 5
4 3
4 5

 */

/*
7 9
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
3 0

 */