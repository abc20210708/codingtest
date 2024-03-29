package com.example.programmers.lv1.v30;
import java.util.*;

public class Q30 {

    class Solution {
        public ArrayList<Integer> solution(int[] arr) {

            ArrayList<Integer> answer = new ArrayList<>();

            if(arr.length == 1) answer.add(-1);

            /*
            int min=arr[0];
            for(int i: arr) {
                min = Math.min(min, i);
            }
            * */

            int min = Integer.MAX_VALUE;
            for(int a : arr) {
                if(min > a) min = a;
            }

            for(int a : arr) {
                if(min != a) answer.add(a);
            }

            return answer;
        }
    }
}

/*  다른 풀이
public int[] solution(int[] arr) {

            if(arr.length == 1) return new int[] {-1};

            int min = Integer.MAX_VALUE;
            for(int a : arr) {
                if(min > a) min = a;
            }

            int[] answer = new int[arr.length -1];

            int idx = 0;
            for(int a : arr) {
                if(min != a) answer[idx++] = a;
            }

            return answer;
        }

* */

/*
제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를
제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
* */
