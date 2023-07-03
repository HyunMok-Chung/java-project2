package com.example.javaproject2.week12.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {  // 백준 7569 BruteForce + BFS
    // x 의 변화
    private final int[] dx = {-1, 1, 0, 0, 0, 0};
    // y 의 변화
    private final int[] dy = {0, 0, -1, 1, 0, 0};
    // h 의 변화
    private final int[] dh = {0, 0, 0, 0, -1, 1};
    // 상자의 크기
    private int x;
    private int y;
    private int h;

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        // 토마토 정보를 담을 상자 3차원 배열
        int[][][] tomatoRack = new int[h][y][x];

        // 데이터 입력 받으며 첫번째 방문 위치 찾기
        Queue<int[]> toVisit = new LinkedList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < x; k++) {
                    // 토마토 정보 받기
                    int tomato = Integer.parseInt(st.nextToken());
                    if (tomato == 1) {
                        // 이미 익은 토마토들 부터 시작
                        toVisit.add(new int[]{i, j, k, 0});
                    }
                    tomatoRack[i][j][k] = tomato;
                }
            }
        }
        // 총 일수 저장용 변수
        int days = 0;
        // BFS 시작
        while (!toVisit.isEmpty()) {
            int[] tomato = toVisit.poll();
            // 이번에 확인한 토마토가 익은 시점이 현재 기록된 시간보다 늦을 경우 갱신
            if (days != tomato[3]) {
                days = tomato[3];
            }
            // 상하좌우 + 위 아래 체크
            for (int i = 0; i < 6; i++) {
                // 다음 확인 좌표
                int nextH = tomato[0] + dh[i];
                int nextY = tomato[1] + dy[i];
                int nextX = tomato[2] + dx[i];
                if (
                        // 1. 영역을 벗어나지 않는다
                        checkBounds(nextX, nextY, nextH)
                        // 2. 익지 않은 토마토이다.
                        && tomatoRack[nextH][nextY][nextH] == 0
                ) {
                    // 토마토를 익음으로 표시 = 방문 표시
                    tomatoRack[nextH][nextY][nextX] = 1;
                    // 다음날에 이 토마토는 익음
                    toVisit.offer(new int[]{nextH, nextY, nextX, tomato[3] + 1});
                }
            }
        }
        // 익지 않은 토마토 존재 확인
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    if (tomatoRack[i][j][k] == 0) {
                        return -1;
                    }
                }
            }
        }
        // 익지 않은 토마토가 없으면 소요 일수 반환
        return days;
    }

    private boolean checkBounds(int x, int y, int h) {
        return -1 < x && x < this.x
                && -1 < y && y < this.y
                && -1 < h && h < this.h;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Tomato().solution());
    }
}
