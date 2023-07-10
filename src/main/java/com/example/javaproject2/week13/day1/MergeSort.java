package com.example.javaproject2.week13.day1;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] arr) {
        // 배열이 비어있거나 길이가 1이라면 정렬할 필요가 없다.
        if (arr == null || arr.length <= 1) {
            return;
        }
        // 정렬 시작
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        // left == right 라면 나눠진 배열의 길이는 1
        if (left < right) {
            // 가운데 index 를 찾는다.
            int mid = left + (right - left) / 2;

            // 반으로 나눠서 재귀호출한다.
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            //
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // 왼쪽 배열과 오른쪽 배열의 크기를 구하고
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 그 크기만큼 배열을 복사한다.
        int[] leftArr = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, mid + 1 + n2);

        // 임시 배열 둘을 비교하면서 정렬해 원본 배열에 저장한다.
        // 임시 배열 두개를 앞쪽 원소부터 각각 비교하면서
        // 더 작은 원소를 원본 배열에 순서대로 저장
        int i = 0, j = 0, k = left;
        // 왼쪽과 오른쪽 모두 아직 원소가 남은동안 반복할 while 문
        while (i < n1 && j < n2) {
            // 왼쪽 배열의 값이 더 작거나 같을 때
            if (leftArr[i] <= rightArr[j]) {
                // 원본 배열에 저장 후
                arr[k] = leftArr[i];
                // 왼쪽 배열의 다음 원소 지정
                i++;
            } else {
                // 왼쪽 대신 오른쪽일떄
                arr[k] = rightArr[j];
                j++;
            }
            // 원본 배열의 다음 저장 위치
            k++;
        }

        // 왼쪽 배열에 원소가 남으면 마저 저장하고,
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // 오른쪽 배열에 원소가 남으면 마저 저장한다.
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 7, 4, 8, 6, 2, 5};
        new MergeSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
