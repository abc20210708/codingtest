package com.example.softeer.lv1;

import java.util.Scanner;

public class WorkTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;

        for(int i = 0; i < 5; i++) {
            String[] str = sc.nextLine().split(" ");
            String[] s1 = str[0].split(":");
            String[] s2 = str[1].split(":");

            int h1 = Integer.parseInt(s1[0]);
            int m1 = Integer.parseInt(s1[1]);
            int h2 = Integer.parseInt(s2[0]);
            int m2 = Integer.parseInt(s2[1]);

            if(m1 > m2) {
                res += ((h2-h1-1)* 60) + (60-(m1-m2));
            } else {
                res += ((h2-h1)* 60) + (m2-m1);
            }

        }

        System.out.println(res);

    }
}
