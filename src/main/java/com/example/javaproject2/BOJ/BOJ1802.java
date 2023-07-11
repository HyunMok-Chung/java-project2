package com.example.javaproject2.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1802 {  // 2023.07.11(화) 종이접기 (분할정복)
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        for (int i = 0; i < tests; i++) {
            if (foldable(br.readLine())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // 종이의 굴곡이 0과 1로 문자열로 주어짐.
    // 예시입력: 1000110
    private boolean foldable(String paper) {
        // 실패하는 경우를 모두 통과하면 true 반환 메소드

        // 굴곡이 하나라면 반으로 접었기 때문에 확인할 필요가 없음.
        if (paper.length() > 1) {
            // 절반 지점
            int half = paper.length() / 2;
            // 왼쪽 종이와 오른쪽 종이가 조건을 만족하는지 검사
            // 조건이 만족하지 않으면 불가능
            if (!foldable(paper.substring(0, half))) {
                return false;
            }
            if (!foldable(paper.substring(half + 1))) {
                return false;
            }
            // 작은 부분들이 만족스러우면, 현재 크기에서 서로 좌우 역대칭이 되는지 확인
            for (int i = 1; i < half + 1; i++) {
                // 중간 지점에서 i 만큼 + 또는 0 한 위치의 굴곡 확인
                // 굴곡의 모양이 일치하는 경우 = 조건이 만족하지 않음
                if (paper.charAt(half + i) == paper.charAt(half - i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        new BOJ1802().solution();
    }
}
//  3
//  0
//  000
//  1000110