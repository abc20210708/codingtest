package com.example.programmers.lv0.v20;
import java.util.*;

public class Q22 {

    class Solution {
        public int solution(int[] numbers) {

            Arrays.sort(numbers);

            int max = numbers[numbers.length - 2] * numbers[numbers.length - 1];

            for(int i = 0; i < numbers.length; i++) {
                for(int j = i +1; j < numbers.length; j++) {
                    if(numbers[i] * numbers[j] > max) max = numbers[i] * numbers[j];
                }
            }

            return max;
        }
    }
}
/* 다른 풀이
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int edge1 = numbers[0]*numbers[1];
        int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];

        answer = Math.max(edge1,edge2);
        return answer;
    }
}
* */


/* 다른 풀이 2
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}
* */

/*
최댓값 만들기 (2)
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를
 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
2 ≤ numbers 의 길이 ≤ 100
입출력 예
numbers	                        result
[1, 2, -3, 4, -5]	            15
[0, -31, 24, 10, 1, 9]	        240
[10, 20, 30, 5, 5, 20, 5]	    600
입출력 예 설명
입출력 예 #1

두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
입출력 예 #2

두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
입출력 예 #3

두 수의 곱중 최댓값은 20 * 30 = 600 입니다.
* */
