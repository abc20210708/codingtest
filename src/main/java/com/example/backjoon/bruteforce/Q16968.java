package com.example.backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//차량 번호판 1 https://www.acmicpc.net/problem/16968
//참고 블로그 https://colin-sh.tistory.com/60
public class Q16968 {
    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        //차량 번호판의 형식
        String target = br.readLine();
        br.close();

        int num = 1;

        for (int i = 0; i < target.length(); i++) {
            //c = 알파벳, d = 숫자
            int n = target.charAt(i) == 'c' ? 26 : 10;
            if(i > 0 && target.charAt(i) == target.charAt(i -1))
                n--;

            num *= n;
        }
        System.out.println(num);

    }
}

/* 다른 풀이
 BufferedReader br
                    = new BufferedReader(new InputStreamReader(System.in));

        //차량 번호판의 형식
        String target = br.readLine();
        br.close();

        int num = 1;

        char pre = target.charAt(0);

        if(pre == 'c') num *= 26;
        else  num *= 10;

        for (int i = 1; i < target.length(); i++) {
            if(pre == target.charAt(i) && target.charAt(i) == 'c')
                num *= 25;
            else if(pre == target.charAt(i) && target.charAt(i) == 'd')
                num *= 9;
            else if(pre != target.charAt(i) && target.charAt(i) == 'c')
                num *= 26;
            else if(pre != target.charAt(i) && target.charAt(i) == 'd')
                num *= 10;

            pre = target.charAt(i);
        }

        System.out.println(num);

* */