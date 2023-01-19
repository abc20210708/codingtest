package com.example.backjoon.implementation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//일곱 난쟁이 https://m.blog.naver.com/hanjo1515/221874318797 참고 블로그
public class Q2309 {
    public static void main(String[] args) throws IOException {

        int[] cm = new int[9];

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < cm.length; i++) {
            cm[i] = Integer.parseInt(br.readLine());
            sum += cm[i];
        }
        br.close();

        Arrays.sort(cm);

        int A =0, B = 0;
        for (int i = 0; i < cm.length -1; i++) {
            for (int j = i + 1; j < cm.length; j++) {
                if(sum - cm[i] - cm[j] == 100) {
                    A = i;
                    B = j;
                    break;
                }
            }
        }

        for (int k = 0; k < cm.length; k++) {
            if(k == A || k == B) continue;

            System.out.println(cm[k]);
        }

    }
}
