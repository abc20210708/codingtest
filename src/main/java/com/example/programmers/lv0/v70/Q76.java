package com.example.programmers.lv0.v70;


public class Q76 {
    class Solution {
        public String solution(String my_string, int n) {

            String result = "";
            for(int i = 0; i < my_string.length(); i++ ) {
                for(int j = 1; j <= n; j++) {
                    result += String.valueOf(my_string.charAt(i));
                } //String.valueOf() - 지정 값을 문자열로 변환
            }
            return result;

        }
    }
}

/* 다른 풀이
  String answer = "";

            for(int i = 0; i < my_string.length(); i++) {
                for(int j = 0; j < n; j++) {
                    answer += my_string.charAt(i);
                }
            }
            return answer;
* */

/* 다른 풀이 2
  String answer = "";
            String str[] = my_string.split("");

            for(int i = 0; i < str.length; i++) {
                for(int j = 0; j < n; j++) {
                    answer += str[i];
                }
            }

            return answer;

* */

/* 다른 풀이 3
String answer = "";

            for(int i = 0; i < my_string.length(); i++) {
                for(int j = 0; j < n; j++) {
                    answer += my_string.substring(i, i+1);
                }
            }

            return answer;
* */

/*
문자 반복 출력하기
문제 설명
문자열 my_string과 정수 n이 매개변수로 주어질 때,
my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

제한사항
2 ≤ my_string 길이 ≤ 5
2 ≤ n ≤ 10
"my_string"은 영어 대소문자로 이루어져 있습니다.
입출력 예
my_string	n	result
"hello"	3	"hhheeellllllooo"
입출력 예 설명
입출력 예 #1

"hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.

* */