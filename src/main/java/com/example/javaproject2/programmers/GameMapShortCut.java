package com.example.javaproject2.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortCut {  // 미로탐색 문제
    private int[] dx = new int[]{-1, 1, 0, 0};
    private int[] dy = new int[]{0, 0, -1, 1};
    private int n;
    private int m;

    // 최단 거리를 돌려줌
    public int solution(int[][] maze) {
        n = maze.length;
        m = maze[0].length;
        // BFS 로직 사용
        // 다음에 접근할 수 있는 칸을 미로 배열의 가로 세로 크기 이내의
        // 인접한 칸을 기준으로 판단

        // int[] 를 담는 Queue, {x, y, 여태까지 이동거리}
        Queue<int[]> visitNext = new LinkedList<>();
        // 미로에서 이미 도달한 적 있는 칸임을 나타내기 위한 boolean 배열
        boolean[][] visited = new boolean[n][m];
        visitNext.offer(new int[]{0, 0, 1});
        int answer = -1;
        // BFS 시작
        // Queue 가 비어있지 않은 동안
        while (!visitNext.isEmpty()) {
            // 다음에 갈 곳을 Queue 에서 꺼내기
            int[] next = visitNext.poll();
            int nowX = next[0];
            int nowY = next[1];
            int steps = next[2];
            // 현재 칸이 n, m 이라면,
            if (nowX == n - 1 && nowY == m - 1) {
                answer = steps;
                break;
            }
            // 4개의 방향을 확인
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(
                    // 1. 미로의 범위를 벗어나지 않는지
                    checkBounds(nextX, nextY) &&
                    // 2. 미로에서 진행 가능한 칸인지
                    maze[nextX][nextY] == 1 &&
                    // 3. 방문한적이 없는지
                    !visited[nextX][nextY]
                ){
                    // 큐에 방문 대상으로 기록
                    visitNext.offer(new int[]{nextX, nextY, steps + 1});
                    // 효율성 검사 통과를 위해 방문 전에 기록한다.
                    visited[nowX][nowY] = true;
                }
            }
        }
        return answer;
    }

    // 미로의 범위 내에 있는지 검사하는 메소드
    private boolean checkBounds(int x, int y) {
        return -1 < x && x < n && -1 < y && y < m;
    }

    public static void main(String[] args) {
        // 숫자 2가 시작점, 3이 목적지로 가정
        int answer = new GameMapShortCut().solution(new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        });
        System.out.println(answer);
    }
}

