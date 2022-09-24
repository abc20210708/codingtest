package com.example.programmers.lv1;
import java.util.*;

public class Q06 {

        public int solution(int n) {
            int answer = 0;
            String s = "";
            int num = 0;

            while(n > 0) { //0보다 클 동안 반복
                //나머지 저장하기
                num = n % 3;
                s += String.valueOf(num);
                //n에는 몫을 저장
                n /= 3;
                if(n == 1) {
                    s += n;
                    break;
                }

            }


            int idx = 0;
            for(int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                answer += (ch - '0') * Math.pow(3, idx++); //3의 거듭 제곱
            }


            return answer;
        }
    }

/*
다른 풀이
//참고 블로그 https://yangbox.tistory.com/58


class Solution {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();
        
        //reverse() 메소드를 제공하는 StringBuilder/StringBuffer 클래스를 이용한다.
        //바꾸고 싶은 문자열을 이용하여 StringBuilder 또는 StringBuffer 객체를 생성 후에 제공되는 reverse() 메서드를 사용


        return Integer.parseInt(a,3);
    }
}
* */