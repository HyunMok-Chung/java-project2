package com.example.javaproject2.week15.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2636 {

    // for(int[] delta : deltas)
    private final int[][] deltas = new int[][]{
        new int[]{-1, 0},
        new int[]{1, 0},
        new int[]{0, -1},
        new int[]{0, 1}
    };

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int cheeseCount = 0;
        int lastCheese = 0;

        int[][] board = new int[y][x];
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    cheeseCount++;
                }
            }
        }

        // 방문정보 확인
        boolean[][] visited = new boolean[y][x];
        // 몇 시간이 지났는지
        int reps = 0;
        Queue<int[]> thisVisit = new LinkedList<>();
        // 가장자리는 무조건 치즈가 없다는 조건이 있으므로
        thisVisit.add(new int[]{0, 0});

        // 치즈가 남아있는 동안 반복
        while (cheeseCount > 0) {
            reps++;
            // 치즈를 만나면 이번이 아닌 다음번에 주변을 살펴봐야 하기 때문에
            // thisVisit 과 분리한다.
            Queue<int[]> nextVisit = new LinkedList<>();
            Queue<int[]> nextMelt = new LinkedList<>();
            // 치즈를 만나서 멈추었을때
            // 현재 방문 가능한 점들을 방문하는 반복문
            while (!thisVisit.isEmpty()) {
                int[] now = thisVisit.poll();
                for (int[] delta : deltas) {
                    int nextY = now[0] - delta[0];
                    int nextX = now[1] - delta[1];
                    if (-1 < nextX && nextX < x && -1 < nextY && nextY < y
                        && !visited[nextY][nextX]) {
                        visited[nextY][nextX] = true;
                        int[] next = new int[]{nextY, nextX};
                        // 다음 방문할 곳이 치즈다.
                        if (board[nextY][nextX] == 1) {
                            nextMelt.add(next);
                            nextVisit.add(next);
                        } else {
                            thisVisit.add(next);
                        }
                    }
                }
            }
            // 이번 시간에 어떤 치즈가 녹을지 알아냈다.
            // 다음시간에 적용하자.
            // 다음 시간에 방문할 곳 지정.
            thisVisit = nextVisit;
            // 현재 치즈의 개수가 정답에서 요구하는
            // 직전 시간의 치즈 개수일 가능성이 높음
            lastCheese = cheeseCount;
            // 남아있는 치즈 개수 계산
            cheeseCount -= nextMelt.size();
            while (!nextMelt.isEmpty()) {
                int[] melt = nextMelt.poll();
                board[melt[0]][melt[1]] = 0;
            }
        }
        System.out.println(reps + "\n" + lastCheese);
    }


    public static void main(String[] args) throws IOException {
        new BOJ2636().solution();
    }

}
