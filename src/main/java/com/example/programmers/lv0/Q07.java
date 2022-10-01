package com.example.programmers.lv0;

public class Q07 {

    public int[] solution(int n) {

        int count = 0;
        //배열 길이 구하기
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) count++;
        }

        int[] answer = new int[count];

        //배열에 넣기
        int idx = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) answer[idx++] = i;
        }


        return answer;
    }
}



/* 다른 풀이
import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
          if(i%2 != 0) {
              answer.add(i);
          }
        }

        return answer;
    }
}
* */

/*
짝수는 싫어요
문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로
담긴 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]
입출력 예 설명
입출력 #1

10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
입출력 #1

15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
* */