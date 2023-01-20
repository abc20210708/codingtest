package com.example.backjoon.string.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        long A = Integer.parseInt(br.readLine());
        long B = Integer.parseInt(br.readLine());
        long C = Integer.parseInt(br.readLine());

        long num = A * B * C;

        String str = num + "";

        int[] nums = new int[10];

        for (int i = 0; i < str.length(); i++) {
            nums[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
