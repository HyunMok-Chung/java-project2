package com.example.javaproject2.week14.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BOJ 15651 N과 M (3)
// 문제유형: 백트래킹
public class BOJ15651 {
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
        dfs(0);

        System.out.println(answer);
    }

    // 첫번째 숫자를 고르고 있느냐
    // 0 ~ level ~ m -1
    private void dfs(int level) {
        // 모두 다 골랐다.
        if (level == m) {
            // 정답 저장
            for (int i = 0; i < m; i++) {
                answer.append(arr[i]).append(' ');
            }
            answer.append('\n');
        }
        // 아직 남았다.
        // 1 ~ n 까지 반복한다.
        else for (int i = 1; i < n + 1; i++) {
            // 이번 숫자로 i를 택한다.
            arr[level] = i;
            dfs(level + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ15651().solution();
    }
}