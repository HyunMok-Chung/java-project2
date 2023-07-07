package com.example.javaproject2.week12.day5;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

// 비트연산을 활용한 부분집합 만들기
public class PowerSetBitmask {
    public static void main(String[] args) {
        int[] set = {2, 3, 5};
        new PowerSetBitmask().powerSet(set);
    }

    public void powerSet(int[] set) {
        int n = set.length;

        // 집합의 부분집합의 개수는 2^n 개 인데, 1 << n 의 결과도 2^n 임.
        int subsetCount = 1 << n;

        // i 를 2진수로 생각하면,
        // 각 자릿수가 1일 때 해당 자릿수번째 원소를 고른다고 가정
        for (int i = 0; i < subsetCount; i++) {
            List<Integer> subset = new ArrayList<>();

            // n 개의 원소를 판단하기 위해 n 번 반복
            for (int j = 0; j < n; j++) {
                // 1을 j 자리 옮긴 후 i 와 & 연산을 하면
                // i 의 j 번째 자리가 0인지 1인지 구분 가능
                if ((i & (1 << j)) != 0) {
                    subset.add(set[j]);
                }
            }

            System.out.println(subset);
        }
    }
}
