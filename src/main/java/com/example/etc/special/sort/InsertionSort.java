package com.example.etc.special.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 6, 4, 3, 7, 5};

        for(int i = 1; i < arr.length; i++) {
            int standard = arr[i]; //기준
            int aux = i -1; //비교할 대상

            while (aux >= 0 && standard < arr[aux]) {
                arr[aux +1] = arr[aux]; //비교대상이 큰 경우 오른쪽으로 밀어냄

                aux--;
            }
            arr[aux + 1] = standard; //기준값 저장
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

/* 삽입 정렬
요소를 하나씩 꺼내서 그 요소 앞에 있는 다른 요소들과 모드 비교하는 방법입니다.
리스트 안에서 순서만 바꿔주기 때문에 in-place 정렬입니다.

최악의 경우, 두 번째 칸에서는 1번 대소 비교를 하고 그 이후로 2번, 3번, ..., n-1번과
비교하기 때문에 이들을 모두 합하면, 복잡도는 O(n^)이 됩니다. 평균적인 경우에도 복잡도는 O(n^)입니다.
하지만 이미 순서에 맞게 정렬되어 있다면 각각 1번씩  n-1번 비교하면 되므로 복잡도는 O(n)입니다.

삽입 정렬은 잘 정렬된 딕셔너리나 데이터베이스에 정렬된 몇 개의 요소를 추가할 때 자주 사용합니다.
이 경우에는 복잡도는 O(n)에 가까워집니다. 이미 정렬된 부분은 다시 정렬할 필요가 없기 때문입니다.

* */