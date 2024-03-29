package com.example.programmers.lv1.v20;

public class Q28 {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();

        for(int i = 0; i < phone_number.length()-4; i++) {
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }
}

// return phone_number.replaceAll(".(?=.{4})", "*");
// 임의의 문자 한 개 / (?=.) -> 뒷쪽에
// 임의의 문자 한 개를 제외하고 선택/ {숫자} -> 숫자 만큼의 자릿수
//  .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택

/* 다른 풀이

String answer = "";

        for(int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length() -4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
* */

/* 다른 풀이 2
    String answer = "";
        int len = phone_number.length() -4;

        for(int i = 0; i < len; i++) {
            answer += "*";
        }

        answer += phone_number.substring(len);

        return answer;
* */

/*
핸드폰 번호 가리기
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해
고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때,
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린
문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
phone_number는 길이 4 이상, 20이하인 문자열입니다.
입출력 예
phone_number	return
"01033334444"	"*******4444"
"027778888"	    "*****8888"
* */