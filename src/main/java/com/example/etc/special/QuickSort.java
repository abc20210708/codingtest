package com.example.etc.special;

public class QuickSort {

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