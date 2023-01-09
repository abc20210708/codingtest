package com.example.etc.special;

public class QuickSort {

    public void quickSort(int[] arr, int start, int end) {

        if(start >= end) //원소가 1개인 경우 종료
            return;

        int pivot = start; // 피벗은 첫 번째 원소
        int left = start +1;
        int right = end;

        while (left <= right) {

            //피벗보다 큰 데이터를 찾을 때까지 반복
            while(left <= end && arr[left] <= arr[pivot])
                left++;

            //피벗보다 작은 데이터를 찾을 때까지 반복
            while(right > start && arr[right] >= arr[pivot])
                right--;

            if(left > right) { //엇갈렸다면 작은 데이터와 피벗을 교체
                int temp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = temp;
            } else { //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }

            //분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
            quickSort(arr, start, right -1);
            quickSort(arr, right + 1, end);

        }



    }


}