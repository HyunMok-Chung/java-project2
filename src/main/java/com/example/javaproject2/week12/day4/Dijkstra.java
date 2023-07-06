package com.example.javaproject2.week12.day4;

import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dijkstra {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodes = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());

        // 인접행렬 사용. 연결되어 있을 경우 양수, 없을 경우 음수 (-1)
        int[][] adjMat = new int[nodes][nodes];
        for (int[] row : adjMat) {
            // -1로 초기화
            Arrays.fill(row, -1);
        }

        // 인접행렬 초기화 그래프 -> 배열로 만든것
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            adjMat[from][to] = cost;
        }

        // 방문정보 visited
        boolean[] visited = new boolean[nodes];
        // 현재까지의 최소 거리 정보 dist
        int[] dist = new int[nodes];
        // 1. 모든 정점까지 아직 도달할 길이 없으므로, 무한대 (또는 최대값)로 초기화
        Arrays.fill(dist, Integer.MAX_VALUE);
        // 2. 시작정점까지의 거리는 0
        dist[start] = 0;

        // 다익스트라 시작
        // 반복 기준: 아직 방문할 점이 남아있을때
        // -> 노드의 갯수만큼 반복한다는 뜻
        for (int i = 0; i < nodes; i++) {
            // 이번에 방문할 정점 선택: 현재 위치에서 정점들 까지의 최단 경로 정보 중 가장 가까운 정점으로
            // -> 최솟값을 찾아야함.

            // 최솟값 비교용 변수
            int minDist = Integer.MAX_VALUE;
            // 최소 거리의 노드 index 저장용 변수
            int minDistNode = -1;
            // 현재 dist 배열을 검사, 최단거리 조사
            for (int j = 0; j < nodes; j++) {
                // 최단거리가 minDist, 최단거리 정점이 minDistNode 에 저장
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    minDistNode = j;
                }
            }
            // 더 이상 도달 가능한 노드가 없을 때
            if(minDistNode == -1)
                break;

            // 최종 선택된 노드 방문처리
            visited[minDistNode] = true;

            for (int j = 0; j < nodes; j++) {
                // 연결되어 있지 않은 경우 (-1인 경우)
                if (adjMat[minDistNode][j] == -1) {
                    continue;
                }
                int cost = adjMat[minDistNode][j];
                // 인접 노드가 현재 가지는 최소비용 (dist[j])
                // 현재 방문한 노드까지의 최소비용 + 현재 노드에서 인접 노드까지 가는 최소비용
                // 좀 더 작은 값을 dist[j] 에 저장
                if (dist[j] > dist[minDistNode] + cost) {
                    dist[j] = dist[minDistNode] + cost;
                }
            }
        }
        // 최종 출력
        System.out.println(Arrays.toString(dist));
    }
}
/*
6 8
0
0 1 10
0 2 15
1 3 12
1 5 15
2 4 10
3 4 2
3 5 1
5 4 5
 */
