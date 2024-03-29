package com.example.programmers.lv1.v20;
import java.util.*;
public class Q24 {
    public long solution(long n) {
        //String[] str = String.valueOf(n).split("");
        String[] str = Long.toString(n).split("");
        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();
        for(String s : str) sb.append(s);

        return Long.parseLong(sb.reverse().toString());
    }

}

/* 다른 풀이
long answer = 0;

            String[] str = Long.toString(n).split("");
            Arrays.sort(str);
            String result = "";

            for(int i = str.length - 1; i >= 0; i--) {
                result += str[i];
            }

            return Long.parseLong(result);
* */

/*
정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한
새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	    return
118372	873211
* */