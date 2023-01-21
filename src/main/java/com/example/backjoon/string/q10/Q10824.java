package com.example.backjoon.string.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10824 {
    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String num1 = st.nextToken() + st.nextToken();
        String num2 = st.nextToken() + st.nextToken();

        System.out.println(Long.parseLong(num1) + Long.parseLong(num2));


    }
}
