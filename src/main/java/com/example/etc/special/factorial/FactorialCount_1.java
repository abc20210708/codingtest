package com.example.etc.special.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//참고 블로그  https://st-lab.tistory.com/165
public class FactorialCount_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (num >= 5) {
            count += (num / 5);
            num /= 5;
        }

        System.out.println(count);

    }

}

/*

* */