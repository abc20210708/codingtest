package com.example.etc.special.numbercount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCount_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while(val != 0) {
            arr[val % 10]++;
            val /= 10;
        }

        for (int result: arr) {
            System.out.println(result);
        }
    }
}

/*
 먼저 while 문의 조건으로 val이 0이 아니면 반복
 그리고 val % 10의 값
 즉, 나머지 값을 배열의 index로 활용하여 해당 인덱스의 값을 1 증가시켜주는 것이다.
 그런 뒤 val = val/10; 을 통해 한 자릿수씩 줄여나간다.

* */

