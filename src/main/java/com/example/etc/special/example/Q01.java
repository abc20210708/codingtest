package com.example.etc.special.example;


import com.example.etc.MemoTest;

import java.io.IOException;
import java.util.Scanner;
//참고 블로그 https://daramgda.tistory.com/89#5.%20%EB%AC%B8%EC%9E%90%20%EC%B0%BE%EA%B8%B0%20%EB%AC%B8%EC%A0%9C%20%ED%92%80%EC%9D%B4
public class Q01 {
    /*
    문자열 입력받고 특정 문자 입력 받아서
    해당 문자열에 특정 문자가 몇 개 있는지 나타내는 프로그램 작성하시오.
    대소문자 구분하지 않는다.
    * */

    public int solution(String str, char target) {
        int cnt = 0;
        str = str.toUpperCase();//대문자로 변경
        target = Character.toUpperCase(target);

        for(int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) cnt++;
        }


        return cnt;
    }


    public static void main(String[] args) throws IOException {

        Q01 mm = new Q01();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(mm.solution(str, c));

    }
}

