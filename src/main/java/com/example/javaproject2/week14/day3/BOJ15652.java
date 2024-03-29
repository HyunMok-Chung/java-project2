package com.example.javaproject2.week14.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15652 {
    private int n;
    private int m;
    private int[] arr;
    private StringBuilder answer;
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        // n과 m 입력
        n = Integer.parseInt(infoToken.nextToken());
        m = Integer.parseInt(infoToken.nextToken());
        // 순열 저장용 배열 생성
        arr = new int[m];
        // 정답 저장용 StringBuilder 생성
        answer = new StringBuilder();
        // 재귀 시작
        dfs(0, 1);

        System.out.println(answer);
    }

    // 현재 고르는 숫자의 범위를 한정시키기 위한 largestPick
    private void dfs(int level, int largestPick) {
        if (level == m) {
            for (int i = 0; i < m; i++) {
                answer.append(arr[i]).append(' ');
            }
            answer.append('\n');
        } else for (int i = largestPick; i < n + 1; i++) {
            arr[level] = i;
            dfs(level + 1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ15652().solution();
    }
}
