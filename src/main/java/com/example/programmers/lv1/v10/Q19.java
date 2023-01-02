package com.example.programmers.lv1.v10;

public class Q19 {
    class Solution {
        public int[] solution(long n) {
            String s = String.valueOf(n);
            StringBuilder sb = new StringBuilder(s);
            sb = sb.reverse();
            String[] str = sb.toString().split("");

            int[] answer = new int[str.length];
            for(int i = 0; i < str.length; i++) {
                answer[i] = Integer.parseInt(str[i]);
            }

            return answer;
        }
    }
}

/* 다른 풀이

class Solution {
    public int[] solution(long n) {

        char[] ch = Long.toString(n).toCharArray();
        int[] answer = new int[ch.length];

        int idx = 0;
        for(int i = ch.length-1; i >= 0; i--) {
            answer[idx++] = ch[i] - 48;
        }


        return answer;
    }
}
* */

/* 다른 풀이 2
 int length = Long.toString(n).length();
            int[] answer = new int[length];

            int idx = 0;
            while(n > 0) {
                answer[idx++] = (int)n % 10;
                n /= 10;
            }

            return answer;

* */

/*
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로
리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
* */