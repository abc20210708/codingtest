package com.example.etc.special.sort;

import java.util.Arrays;

public class InsertionSort_2 {

    public static void main(String[] args) {
        int[] arr =  {3, 1, 2, 6, 7 , 5, 4};

        //요소를 선택하여 v에 저장
        //전과 비교하기 때문에 1로 시작
        for (int i = 1; i < arr.length; i++) {
            int j;
            //삽일될 자리를 찾는 중인, 현재 차례의 인덱스 값 target
            int target = arr[i];
            for (j = i -1; j >= 0; j--) {
                //target이 바로 전의 요소보다 크거나 같으면 break
                if(arr[j] <= target) break;

                //v가 바로 전의 요소보다 작으면 위치를 바꿔줌
                arr[j+1] = arr[j];
            }
            arr[j +1] = target;
        }

        //결과 출력
        System.out.println(Arrays.toString(arr));
    }
}
