package com.example.etc;


/*
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하라
각 단어는 공백으로 구분된다.

예시)  my name is daramG  -> daramG
* */

public class MemoTest {

    public String solution(String target) {

        String result = "";

        String[] str = target.split(" ");

        int max = 0;
        for(String s : str) {
            if(s.length() > max) result = s;
        }

        return result;
    }

    public static void main(String[] args) {
        MemoTest mm = new MemoTest();

        System.out.println(mm.solution("my name is daramG"));

    }


}








