package com.example.programmers.lv0.v10;

public class Q17 {
    class Solution {
        public int solution(int num, int k) {
            String answer = Integer.toString(num);
            char target = (char)(k + '0');

            int n = 0;

            for(int i = 0; i < answer.length(); i++) {
                char ch = answer.charAt(i);
                if(ch == target){
                    n = i+1;
                    break;
                } else {
                    n = -1;
                }
            }


            return n;
        }
    }
}

/*  다른 풀이
class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == k + '0'){
                answer = i+1;
                break;
            }
        }

        return answer;
    }
}
* */

/* 다른 풀이

//  indexOf() - 특정 문자나 문자열에서 해당하는 문자의 인덱스 값을 반환하고
                찾지 못했을 경우 '-1'을 반환하는 메소드
import java.util.*;

class Solution {
    public int solution(int num, int k) {


        String str = Integer.toString(num);
        int answer = str.indexOf(Integer.toString(k));

        if(answer == -1) return -1;
        else return ++answer;

    }
}
* */

/*
숫자 찾기

문제 설명
정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면
 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < num < 1,000,000
0 ≤ k < 10
num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
입출력 예
num	    k	result
29183	1	3
232443	4	4
123456	7	-1
입출력 예 설명
입출력 예 #1

29183에서 1은 3번째에 있습니다.
입출력 예 #2

232443에서 4는 4번째에 처음 등장합니다.
입출력 예 #3

123456에 7은 없으므로 -1을 return 합니다.
* */