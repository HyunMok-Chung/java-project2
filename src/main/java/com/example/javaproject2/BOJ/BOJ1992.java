package com.example.javaproject2.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1992 {  // 2023.07.11(화) 쿼드트리 (분할정복, 재귀)
    // 입력에 대한 정보 클래스 필드로 저장

    // 입력된 0과 1로 구성된 이미지
    private char[][] image;
    // 결과를 저장하기 위한 StringBuilder
    public StringBuilder sb;
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        image = new char[n][];
        for (int i = 0; i < n; i++) {
            // .toCharArray(): String 메소드 중 하나로 문자열을 char 배열로 변환 가능
            image[i] = br.readLine().toCharArray();
        }
        sb = new StringBuilder();
        compressQuad(n, 0, 0);
        System.out.println(sb.toString());
    }

    private void compressQuad(
            // n: 정사각형 한 변의 길이
            int n,
            // x: 정사각형의 시작 x index
            int x,
            // y: 정사각형의 시작 y index
            int y
    ) {
        // 조건을 만족했는지 검사하는 flag
        boolean success = true;
        // 모든 요소가 같지 않을 경우 success = false 해줌.

        // x, y 의 값을 저장,
        // x ~ x + n - 1, y ~ y + n - 1 까지 반복하며 초기의 값과 달라지는지 검사
        char init = image[x][y];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (image[x + i][y + j] != init) {
                    success = false;
                    break;
                }
            }
            // 반복횟수 줄이기
            if (!success) {
                break;
            }
        }
        // 원소 검사 후 success == false 라면 쪼개서 재귀호출
        if (!success) {
            // 좌 괄호 입력
            sb.append("(");
            // 4등분을 위한 half
            int half = n / 2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    compressQuad(half, x + half * i, y + half * j);
                }
            }
            // 4등분 영상 압축이 끝나면 우괄호 입력
            sb.append(")");
        } else {
            // 모든 원소가 일치했다면 첫번쨰 검사한 원소 입력
            sb.append(init);
        }
    }

    public static void main(String[] args) throws IOException {
        new BOJ1992().solution();
    }
}
