package com.example.softeer.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 금고 털이
// 참고 블로그 https://january-diary.tistory.com/entry/Softeer-%EA%B8%88%EA%B3%A0%ED%84%B8%EC%9D%B4-JAVA
public class Q07 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())});
        }

        Collections.sort(list, (o1, o2)-> o2[1]-o1[1]);

        int answer = 0;

        for (int[] item: list) {
            if (w <= item[0]) {
                answer += w*item[1];
                break;
            } else {
                answer += item[0] * item[1];
                w -= item[0];
            }
        }
        System.out.println(answer);


    }
}
