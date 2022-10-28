package com.example.programmers.lv0.v50;
import java.util.*;

public class Q55 {
     public int solution(String my_string) {

         /* 참고 블로그 https://carroti.tistory.com/180
         숨어있는 숫자의 덧셈 (1) 문제에서 한 자리 자연수가 아닌 두 자리 이상의 자연수로 확장된 문제이다.
        연속된 숫자가 나오면 버퍼 문자열에 이어붙인 후 숫자가 아닌 문자가 나왔을 때
        그동안 이어붙인 버퍼 문자열을 숫자로 바꿔 더하고, 버퍼 문자열을 초기화한다.
        문자열이 숫자로 끝나는 경우를 위해
        탐색이 다 끝난 뒤 버퍼 문자열을 숫자로 바꿔 더해주는 과정을 한번 더 해준다.
         * */

            int answer = 0;
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<my_string.length(); i++) {
                char c = my_string.charAt(i);
                if(c >='0' && c<='9') {
                    sb.append(c);
                }
                else {
                    if(sb.toString().length() == 0) continue;
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
            if(sb.toString().length() > 0)
                answer += Integer.parseInt(sb.toString());
            return answer;
        }
    }

/* 다른 풀이
lass Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
* */

/*
숨어있는 숫자의 덧셈 (2)
문제 설명
문자열 my_string이 매개변수로 주어집니다.
my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
1 ≤ my_string 안의 자연수 ≤ 1000
연속된 수는 하나의 숫자로 간주합니다.
000123과 같이 0이 선행하는 경우는 없습니다.
문자열에 자연수가 없는 경우 0을 return 해주세요.
입출력 예
my_string	        result
"aAb1B2cC34oOp"	    37
"1a2b3c4d123Z"	    133
입출력 예 설명
입출력 예 #1

"aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다.
따라서 1 + 2 + 34 = 37 을 return합니다.
입출력 예 #2

"1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다.
따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.
* */