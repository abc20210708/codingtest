package com.example.programmers.lv2.v00;
import java.lang.*;
public class Q02 {

// 참고 블로그  https://blackvill.tistory.com/178

    public String solution(String s) {
        String answer = "";

        //각 단어의 첫글자만 제외하고는 소문자이므로
        //전체 소문자 만들고 -> 자르기
        String[] str = s.toLowerCase().split("");
        //이전이 공백인지 체크
        boolean space = true;

        for(String st: str) {
            //space가 true면 대문자로, 아니면 그냥 그대로 사용
            System.out.println("st: " + st);
            answer += space ? st.toUpperCase() : st;

            //공백이 오면 space를 true 아니면 false
            space = st.equals(" ") ? true : false;
            System.out.println("answer: " + answer);
        }

        return answer;
    }
}
/*

JadenCase 문자열 만들기

문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상 200 이하인 문자열입니다.
s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
숫자는 단어의 첫 문자로만 나옵니다.
숫자로만 이루어진 단어는 없습니다.
공백문자가 연속해서 나올 수 있습니다.

입출력 예
        s	                              return
"3people unFollowed me"	        "3people Unfollowed Me"
"for the last week"	            "For The Last Week"
* */