package com.example.programmers.lv0.v60;
import java.util.*;
public class Q60 {
    class Solution {
        public int solution(String s) {
            int answer = 0;

            Stack<Integer> stack = new Stack<>();

            StringTokenizer st = new StringTokenizer(s, " ");

            //StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인
            while(st.hasMoreTokens()){
                String str = st.nextToken();
                System.out.println("str.charAt(0) : "+ str.charAt(0));
                if(str.charAt(0) == 'Z') stack.pop();
                else
                    stack.push(Integer.parseInt(str));
            }

            while(!stack.isEmpty()) {
                answer += stack.pop();
            }

            return answer;
        }
    }
}

/* 다른풀이
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sliceStr = s.split(" ");
        for(int i = 0; i < sliceStr.length; i++) {
            System.out.println(i);
            if(sliceStr[i].equals("Z")) {
                if(sliceStr[i - 1].equals("Z")) {
                    answer -= Integer.parseInt(sliceStr[i - 3]);
                } else {
                    answer -= Integer.parseInt(sliceStr[i - 1]);
                }
            } else {
                answer += Integer.parseInt(sliceStr[i]);
            }
        }
        return answer;
    }
}
* */

/*
컨트롤 제트
문제 설명
숫자들이 공백으로 구분된 문자열이 주어집니다.
문자열에 있는 숫자를 차례대로 더하려고 합니다.
이 때 “ Z”가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
숫자와 “Z”로 이루어진 문자열 s가 주어질 때,
머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < s의 길이 < 1,000
-1,000 < s의 원소 중 숫자 < 1,000
s는 숫자, "Z", 공백으로 이루어져 있습니다.
s에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.
연속된 공백은 주어지지 않습니다.
0을 제외하고는 0으로 시작하는 숫자는 없습니다.
s의 시작과 끝에는 공백이 없습니다.
모든 숫자를 지우는 경우는 주어지지 않습니다.
지울 숫자가 없는 상태에서 "Z"는 무시합니다.
입출력 예
s	            result
"1 2 Z 3"	    4
"10 20 30 40"	100
"10 Z 20 Z 1"	1
입출력 예 설명
입출력 예 #1

본문과 동일합니다.
입출력 예 #2

10 + 20 + 30 + 40 = 100을 return 합니다.
입출력 예 #3

"10 Z 20 Z 1"에서 10 다음 Z, 20 다음 Z로 10,
20이 지워지고 1만 더하여 1을 return 합니다.
* */