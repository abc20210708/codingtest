package com.example.programmers.lv1.v30;

public class Q36 {
        public boolean solution(String s) {
            boolean answer = true;

            if(!(s.length() == 4 || s.length() == 6)) return false;

            if(s.length() == 4 || s.length() == 6) {
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
                }
            }

            return answer;
        }
}

//"^[0-9]*$"; // 숫자만 등장하는지
//if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;

/* 다른 풀이
boolean answer = true;

            //65 ~ 90 대, 97 ~ 122 소
            if(!(s.length() == 4 || s.length() == 6)) return false;

            if(s.length() == 4 || s.length() == 6) {
                for(char c: s.toCharArray()) {
                    System.out.println(c);
                    if(c >= 65 && c <= 90) {
                        return false;
                    } else if(c >= 97 && c <= 122) {
                        return false;
                    }
                }
            }

            return answer;
* */

/*
문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고,
숫자로만 구성돼있는지 확인해주는 함수,
solution을 완성하세요.
예를 들어 s가 "a234"이면 False를 리턴하고
"1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
입출력 예
s	    return
"a234"	false
"1234"	true
* */