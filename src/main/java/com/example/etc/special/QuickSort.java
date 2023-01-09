package com.example.etc.special;

public class QuickSort {
//출처 블로그 https://creatordev.tistory.com/70
    public static void main(String[] args){

        int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(array, 0, array.length -1);

        for (int i : array) {
            System.out.printf("%d ",i);
        }
    }

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[(start + end) /2];

        while(start < end) {
            while ((arr[start] < pivot) && (start < end))
                start++;
            while((arr[end] > pivot) && (start < end))
                end--;

            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        return start;
    }

    public static void quickSort(int[] arr, int start, int end) {

        if(start < end) {
            int pivotNewIdx = partition(arr, start, end);

            quickSort(arr, start, pivotNewIdx -1);
            quickSort(arr, pivotNewIdx +1, end);
        }

    }
}

/* 퀵 정렬(QuickSort)이란?

분할 작업을 순환적으로 반복하면서 피봇의 왼쪽 부분 집합과 오른쪽 부분집합을 정렬하는 방법

 1. 전체 원소 가운데 하나의 원소를 중심(pivot)으로 2개의 부분 집합으로 분할한다.
 2. 기준값(pivot)보다 작은 원소는 왼쪽 부분 집합으로, 기준값보다 큰 원소들은
     오른쪽 부분 집합으로 정렬한다.
 3. 분할된 부분집합의 크기가 0이나 1이 될때까지 순환 호출을 이용하여 다시 분할한다.

 피봇을 결정하는데에 크게 두 가지 방법이 있는데
 1. 난수 분할(랜덤)
 2. 중위법 (좌측 끝, 중앙, 우측 끝)

 난수 분할은 성능과 안정성이 떨어지기 때문에, 중위법(중앙)에서 분할 작업이 이루어진다.
 

* */