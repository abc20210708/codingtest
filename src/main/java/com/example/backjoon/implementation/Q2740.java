package com.example.backjoon.implementation;

import java.util.Scanner;

//행렬 곱셈
//참고 블로그 https://subin-programming.tistory.com/86
public class Q2740 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        m = sc.nextInt();
        int k = sc.nextInt();
        int[][] b = new int[m][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    result[i][j] += a[i][l] * b[l][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++)
                    System.out.print(result[i][j] + " ");
                System.out.println();

        }

    }
}
