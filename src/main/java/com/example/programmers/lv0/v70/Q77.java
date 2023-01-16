package com.example.programmers.lv0.v70;

//외계행성의 나이 https://school.programmers.co.kr/learn/courses/30/lessons/120834
public class Q77 {
    public String solution(int age) {
        String ageStr = age +"";
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        String answer = "";

        for(char c: ageStr.toCharArray()) {
            answer += arr[c - '0'];
        }

        return answer;
    }
}
//문자를 '1'을 숫자로 바꾸고 싶을 때 -'0' 아스키코드 로는 48