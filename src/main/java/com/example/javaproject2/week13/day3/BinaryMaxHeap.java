package com.example.javaproject2.week13.day3;

public class BinaryMaxHeap {
    private int[] heap;
    private int size;

    public BinaryMaxHeap() {
        heap = new int[32];
        size = 0;
    }

    // 삽입 연산
    public void insert(int item) {
        heap[size] = item;
        // TODO 비교하며 끌어올리기
        shiftUp(size);
        size++;
    }

    // index 에 존재하는 원소를 자신의 부모와 비교해서
    // 힙의 조건을 만족시키도록 교환을 반복적으로 진행하는 함수
    private void shiftUp(int index) {
        // 루트 원소가 아닌 동안
        while (index > 0) {
            // 그냥 2로 나눠도되지만 예시가 0부터 시작이라 -1 을 해준것.
            int parentIndex = (index - 1) / 2;

            // 힙의 조건을 만족하는 관계면 반복 중단
            if (heap[index] <= heap[parentIndex]) {
                break;
            }

            // 아니면 교환
            int temp = heap[index];
            heap[index] = heap[parentIndex];
            heap[parentIndex] = temp;
            index = parentIndex;
        }
    }

    public int remove() {
        // 루트노드 제거
        int root = heap[0];
        // 마지막 자식 할당
        heap[0] = heap[size - 1];
        size--;
        // TODO 아래로 내리기
        shiftDown(0);

        return root;
    }

    private void shiftDown(int index) {
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            // 최대 원소의 위치 저장용
            int maxIndex = index;
            // 왼쪽 자식이 존재하며 현재 최대 원소(루트) 보다 큰 경우
            if (leftChild < size && heap[leftChild] > heap[maxIndex]) {
                // 둘을 교환할 준비
                maxIndex = leftChild;
            }
            // 오른쪽도 동일. 이때 왼쪽이 더 컸으면 maxIndex 가 갱신되었을 것이고,
            // 아니라면 그대로 루트였을것. 그래서 한번만 비료해도 둘 중 더 큰것과 비교가 됨.
            if (rightChild < size && heap[rightChild] > heap[maxIndex]) {
                maxIndex = rightChild;
            }

            // 양쪽 자식과 비교했는데, 최댓값의 위치가 갱신되지 않은 경우
            // 힙의 조건에 부합함.
            if (maxIndex == index) {
                break;
            }

            int temp = heap[index];
            heap[index] = heap[maxIndex];
            heap[maxIndex] = temp;
            index = maxIndex;
        }
    }

    public static void main(String[] args) {
        BinaryMaxHeap maxHeap = new BinaryMaxHeap();
        for (int i = 0; i < 32; i++) {
            maxHeap.insert(i);
        }
        for (int i = 0; i < 32; i++) {
            System.out.println(maxHeap.remove());
        }
    }
}
