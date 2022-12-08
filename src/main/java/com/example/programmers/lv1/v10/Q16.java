package com.example.programmers.lv1.v10;
import java.util.*;

//lv1. 같은 숫자는 싫어
public class Q16 {

    public class Solution {
        public ArrayList<Integer> solution(int []arr) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(arr[0]);

            for(int i = 1; i < arr.length; i++) {
                if(arr[i] != arr[i-1]) list.add(arr[i]);
            }

            return list;
        }
    }
}

/* 다른 풀이
import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0; i < arr.length-1; i++) {
          if(arr[i] != arr[i+1]) list.add(arr[i]);
        }

        list.add(arr[arr.length-1]);

        return list;
    }
}
* */

/* 다른 풀이 2
import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int num = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }

        return list;
    }
}
* */


/*
같은 숫자는 싫어
문제 설명
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고
남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
입출력 예
arr	                answer
[1,1,3,3,0,1,1]	    [1,3,0,1]
[4,4,4,3,3]	        [4,3]
* */