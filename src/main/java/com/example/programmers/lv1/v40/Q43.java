package com.example.programmers.lv1.v40;

public class Q43 {
    class Solution {
        public int solution(int n) {
            String str = "";

            while(n > 0) {
                str = (n % 3) + a;
                n /= 3;
            }

            str = new StringBuilder(str).reverse().toString();

            return Integer.parseInt(str, 3);

        }
    }
}


/* 다른 풀이
    //3진법
    int num = n;
    String str = "";
    while(num > 0) {
        str += (num % 3) + "";
        num /= 3;
    }

    int answer = 0;
    int idx = 0;
    for(int i = str.length() -1; i >= 0; i--) {
        int number = str.charAt(i) - '0';
        answer += (Math.pow(3, idx++)) * number;
    }

    return answer;
* */

/*
3진법 뒤집기
문제 설명
자연수 n이 매개변수로 주어집니다.
n을 3진법 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현한 수를
return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
입출력 예
n	result
45	7
125	229
입출력 예 설명
입출력 예 #1

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45	        1200	        0021	        7
따라서 7을 return 해야 합니다.
입출력 예 #2

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125	           11122	    22111	        229
따라서 229를 return 해야 합니다.
* */