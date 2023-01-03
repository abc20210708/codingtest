package com.example.programmers.lv1.v20;

public class Q21 {
    boolean solution(String s) {
       return s.replaceAll("[^yY]", "").length()
               - s.replaceAll("[^pP]", "").length() == 0;
    }
}

/* 다른 풀이
    boolean solution(String s) {
        boolean answer = false;

        int p = 0, y = 0;

        char[] ch = s.toCharArray();

        for(char c : ch) {
            if(c == 'p' || c == 'P') p++;
            else if (c == 'y' || c == 'Y') y++;
        }

        if(p == y) answer = true;

        return answer;
    }
* */

/* 다른 풀이 2
     boolean answer = true;
        int cnt = 0;
        char ch = ' ';

        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(ch == 'p' || ch == 'P') cnt++;
            else if(ch == 'y' || ch == 'Y') cnt--;
        }

        if(cnt != 0) answer = false;

        return answer;
* */

/*
문자열 내 p와 y의 개수
문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
입출력 예
s	answer
"pPoooyY"	true
"Pyy"	false
입출력 예 설명
입출력 예 #1
'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.

입출력 예 #2
'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.
* */