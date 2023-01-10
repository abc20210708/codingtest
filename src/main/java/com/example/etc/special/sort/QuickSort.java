package com.example.etc.special.sort;
import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int[] arr, int start, int end){
        //오른쪽 파티션의 시작점
        int part2 = partition(arr,start,end);
        //시작점이 오른쪽 시작점보다 둘 이상 차이가 날 때만
        //왼쪽 파티션 퀵소트
        if(start < part2 -1){
            quickSort(arr, start, part2-1);
        }
        //오른쪽 시작점이 끝점보다 작을 때
        //오른쪽 파티션 퀵소트
        if(part2<end){
            quickSort(arr, part2, end);
        }
    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start+end)/2];
        while(start <= end){
            while(arr[start] < pivot)
                start++;
            while(arr[end] > pivot)
                end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    private static void printArray(int[] arr){
        for(int data : arr){
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
}


/* 퀵 정렬(QuickSort)은 중심점(pivot Point)을 임의로 고른 후, 이 중심점보다 작은 수를
    한 쪽으로 분류하고 큰 수들은 다른 쪽으로 분류하여 정렬하는 방법입니다.

    중심점의 왼쪽에 있는 숫자들은 오른쪽에 있는 숫자들과 비교할 필요가 없습니다.
    리스트를 분리하여 따로 비교하므로, 평균적인 경우에 시간 복잡도는 O(n long n)입니다.

    퀵 정렬은 다음과 같은 순서로 이뤄집니다.
    1. 중심점을 선택합니다. 주로 리스트의 중간에 있는 숫자 혹은 마지막에 있는 숫자를 선택합니다.
    2. 마지막 요소와 중심점의 위치를 바꿔 중심점을 리스트의 가장 끝으로 보냅니다.
    3. 2개의 카운터를 사용하여 리스트의 처음부터 탐색합니다. 첫 번째 카운터에는 중심점보다
       큰 숫자의 위치를 저장하고, 두 번째 카운터에는 현재 탐색하고 있는 위치를 저장합니다.
   4. 탐색하여 중심점보다 작은 숫자를 발견하면 첫 번째 카운터의 숫자 위치와 바꿔줍니다.
   5. 3,4 과정을 반복하면 중심점보다 큰 수와 중심점보다 작은 수가 나눠지게 됩니다.
   6. 다시 중심점을 선택하여 2 ~ 5 과정을 반복하면 리스트가 정렬됩니다.

* */