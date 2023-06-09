package com.example.javaproject2.week12.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class numberBaseball {
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int tries = Integer.parseInt(br.readLine());
        int[][] ballInfo = new int[tries][3];
        for (int i = 0; i < tries; i++) {
            st = new StringTokenizer(br.readLine());
            ballInfo[i] = new int[]{
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            };
        }
        int answer = 0;
        // for 반복문으로 자연수 세개 나열
        for (int i = 1; i < 10; i++) {  // 제일 앞자리 숫자 i
            for (int j = 1; j < 10; j++) {  // 두번째 자리 숫자 j
                if (i == j) continue;
                for (int k = 1; k < 10; k++) { // 세번째 자리 숫자 k
                    if (k == i || k == j) continue;
                    // 답변 후보 배열
                    int[] temp = new int[]{i, j, k};
                    boolean isAnswer = true;
                    // 질문들 순횐
                    for (int t = 0; t < tries; t++) {
                        int select = ballInfo[t][0];
                        // 답변 후보와 비교
                        int[] result = getCount(select, temp);
                        // 실제 볼카운트와 동일한지 확인
                        if (result[0] != ballInfo[t][1] || result[1] != ballInfo[t][2]) {
                            // 얘는 답이 될수 없다.
                            isAnswer = false;
                            // 나머지 조건 확인 불필요
                            break;
                        }
                    }
                    if(isAnswer) answer++;
                }
            }
        }

        return answer;
    }

    // 두 숫자의 볼카운트를 반환하는 메소드
    public int[] getCount(int select, int[] answer) {
        int strikes = 0;
        int balls = 0;

        int[] selectNums = new int[]{select / 100, (select / 10) % 10, select % 10};

        for (int i = 0; i < 3; i++) {
            // 1. 스트라이크 판정
            if (selectNums[i] == answer[i]) {
                strikes++;
            } else {  // 2. 스트라이크가 아닐 때 볼 판정
                for (int j = 0; j < 3; j++) {
                    if (selectNums[i] == answer[j]) {
                        balls++;
                    }
                }
            }
        }

        return new int[] {strikes, balls};
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new numberBaseball().solution());
    }
}
