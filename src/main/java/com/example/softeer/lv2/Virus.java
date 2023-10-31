package com.example.softeer.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Virus {
    // 참고 블로그 https://serylee.tistory.com/30
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long k = Integer.parseInt(str[0]);
        long p = Integer.parseInt(str[1]);
        long n = Integer.parseInt(str[2]);

        for (int i = 0; i < n; i++) {
            k *= p;
            k %= 1000000007;
        }

        System.out.println(k);
    }
}
