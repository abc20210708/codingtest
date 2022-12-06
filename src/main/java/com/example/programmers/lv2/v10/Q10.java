package com.example.programmers.lv2.v10;
import java.util.*;

public class Q10 {

    class Solution {
        boolean solution(String s) {
            boolean answer = false;

            int count = 0;

            for(char i: s.toCharArray()) {
                if(i == '(') {
                    count++;
                }

                if(i == ')') {
                    count--;
                }

                if(count < 0) {
                    break;
                }
            }

            if(count == 0) {
                answer = true;
            }


            return answer;
        }
    }
}

/* 다른 풀이
import java.util.*;

class Solution {
    boolean solution(String s) {

        if(s.charAt(0) == ')') return false;

        int count = 0;

        for(char i: s.toCharArray()) {
            if(i == '(') {
                count++;
            } else {
                if(count <= 0) return false;
                count--;
            }
        }

        return (count > 0) ? false : true;
    }
}
* */

/* 다른 풀이 2

import java.util.*;

class Solution {
    boolean solution(String s) {

        int count = 0;

        if(s.charAt(s.length() -1) == '(') return false;

        for(char c: s.toCharArray()) {
            if(c == '(') {
                count++;
            } else {
                if(count <= 0) return false;
                else count--;
            }
        }

        if(count == 0) return true;
        else return false;

    }
}
* */

/*
올바른 괄호
문제 설명
괄호가 바르게 짝지어졌다는 것은
'(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.

예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때,
문자열 s가 올바른 괄호이면 true를 return 하고,
올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
입출력 예
s	        answer
"()()"	    true
"(())()"	true
")()("	    false
"(()("	    false
* */
