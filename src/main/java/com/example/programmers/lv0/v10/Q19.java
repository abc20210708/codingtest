package com.example.programmers.lv0.v10;

public class Q19 {
    class Solution {
        public int solution(int order) {

            int answer = 0;

            String temp = Integer.toString(order);
            int[] digits = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++) {
                digits[i] = temp.charAt(i) - '0';
                if(digits[i] == 0) continue;
                else if(digits[i] % 3 == 0) answer++;
            }


            return answer;
        }
    }
}

/* 다른 풀이
class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = order+"";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='3'||c=='6'||c=='9') answer++;
        }

        return answer;
    }
}
* */

/* 다른 풀이 2
import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;

        String[] str = Integer.toString(order).split("");

        for(String s : str) {
           if(s.equals("3") || s.equals("6") || s.equals("9")) {
               answer++;
           }
        }

        return answer;
    }
}
* */

/* 다른 풀이 3
 class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = order+"";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='3'||c=='6'||c=='9') answer++;
        }

        return answer;
    }
}
* */

/* 다른 풀이 4
class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = "" + order;

        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)%3==0 && str.charAt(i)!='0'){
                answer++;
            }
        }


        return answer;
    }
}
* */


/*
369게임

문제 설명
머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가
들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 머쓱이가 말해야하는
 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ order ≤ 1,000,000
입출력 예

order	result
3	    1
29423	2

입출력 예 설명
입출력 예 #1

3은 3이 1개 있으므로 1을 출력합니다.
입출력 예 #2

29423은 3이 1개, 9가 1개 있으므로 2를 출력합니다.
* */
