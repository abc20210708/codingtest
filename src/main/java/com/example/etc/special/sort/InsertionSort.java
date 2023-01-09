package com.example.etc.special.sort;

import java.util.Arrays;

public class InsertionSort {

    static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            //삽입될 위치를 저장하기 위한 idx
            int idx = i;
            //현재 정렬 대상 값
            int temp = arr[i];

            //1. 이미 정렬된 배열에서 현재 정렬대상 값이 삽입될 위치(인덱스를 찹는다.
            //2. 현재 정렬대상 값보다 큰 값은 뒤로 한 칸씩 이동
            while ((idx > 0) && (arr[idx -1] > temp)) {
                arr[idx]  = arr[idx -1];
                idx--;
            }

            //삽입될 위치에 temp삽입
            arr[idx] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr =  {3, 1, 2, 6, 7 , 5, 4};

        //삽입 정렬
        insertSort(arr);

        //결과 출력
        System.out.println(Arrays.toString(arr));
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