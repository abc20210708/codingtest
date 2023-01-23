package com.example.backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//최대공약수와 최소공배수
//참고 블로그 https://myjamong.tistory.com/138
public class Q2609 {

    public static int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        br.close();

        int gcd = gcd(num1, num2);
        System.out.println(gcd);
        System.out.println((num1 * num2)/ gcd);

    }

}
