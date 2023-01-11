package com.example.etc.special.example;


import com.example.etc.MemoTest;

// 대소문자 변환
public class Q02 {

    public String solution(String target) {

        String result = "";
        for(char c: target.toCharArray()) {
            if(Character.isLowerCase(c)) result += Character.toUpperCase(c);
            else result += Character.toLowerCase(c);
        }


        return result;
    }

    //대문자 65 ~ 90
    //소문자 97 ~ 122
    public static void main(String[] args) {

        Q02 mt = new Q02();

        System.out.println(mt.solution("daramG"));

    }

}


/* 다른 풀이

        public String solution(String target) {
        String result = "";
        for(int i = 0; i < target.length(); i++ ) {
            char ch = target.charAt(i);
            if(ch >= 65 && ch <= 90 ) {
                result += Character.toLowerCase(ch);
            } else if(ch >= 97 && ch <= 122 ) {
                result += Character.toUpperCase(ch);
            }
        }

        return result;

    }

* */