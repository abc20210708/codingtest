package com.example.programmers.lv0.v70;
import java.util.*;
//숨어있는 숫자의 덧셈 (2) https://school.programmers.co.kr/learn/courses/30/lessons/120864
public class Q78 {
        public int solution(String s) {
            int answer = 0;

            String[] str = s.split("\\D");

            for(int i = 0; i < str.length; i++) {
                if(!str[i].equals(""))
                    answer += Integer.parseInt(str[i]);
            }

            return answer;
        }
}

/* 다른 풀이
    String[] str = my_string.replaceAll("[a-zA-Z]", "_").split("_");


    for(String s : str){
        if(!s.equals("")) answer += Integer.valueOf(s);
    }
* */
