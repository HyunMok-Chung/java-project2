package com.example.javaproject2.week12.day5;


// Iter = Iterative
// 반복문으로 부분집합 구하기
public class PowerSerIter {
    public static void main(String[] args) {
        int[] set = new int[]{2, 3, 5};
        // 선택 여부 저장 배열
        int[] selected = new int[set.length];

        // i, j, k = set 의 각 원소를 선택할까 말까를 결정하는 것.
        // i == 0 이면 첫번째 원소 선택 X
        // i == 1 이면 첫번째 원소 선택 O
        for (int i = 0; i < 2; i++) {
            selected[0] = i;
            // j == 0 이면 두번째 원소 선택 X
            // j == 1 이면 두번째 원소 선택 O
            for (int j = 0; j < 2; j++) {
                selected[1] = j;
                // k == 0 이면 세번째 원소 선택 X
                // k == 1 이면 세번째 원소 선택 O
                for (int k = 0; k < 2; k++) {
                    selected[2] = k;

                    // selected[n] 의 값이 1이라면
                    // set[n] 의 값을 부분집합에 포함
                    for (int e = 0; e < set.length; e++) {
                        if (selected[e] == 1) {
                            System.out.print(set[e] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
