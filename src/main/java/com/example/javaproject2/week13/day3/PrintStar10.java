package com.example.javaproject2.week13.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintStar10 {
    // BOJ 2447 별찍기 10 골드5
    // 문제유형: 분할정복, 재귀
    private char[][] starboard;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        starboard = new char[n][n];
        // starboard 의 각 줄 반환
        for (char[] row: starboard) {
            // 공백으로 채우기
            Arrays.fill(row, ' ');
        }

        setStar(n, 0, 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(starboard[i]).append("\n");
        }
        System.out.println(sb);
    }

    public void setStar(int n, int x, int y) {
        // n == 3 이라면 실제로 별을 그리기 시작
        if (n == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // 가운데 지점은 별을 그리지 않음 -> Skip
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    starboard[x + i][y + j] = '*';
                }
            }
        }
        // 아니라면 n == 3이 될때까지 재귀호출
        else {
            int offset = n / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // 가운데 사각형이면 굳이 재귀호출 안해도됨.
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    setStar(offset, x + offset * i, y + offset * j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new PrintStar10().solution();
    }
}
