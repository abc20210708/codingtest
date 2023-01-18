package com.example.backjoon.string.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5555 {
    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        String target = br.readLine();
        int num = Integer.parseInt(br.readLine());

        int cnt =0;
        String sum;

        for (int i = 0; i < num; i++) {
            sum = br.readLine();
            sum += sum;

            if(sum.contains(target))
                cnt++;
        }


        System.out.println(cnt);

    }
}
