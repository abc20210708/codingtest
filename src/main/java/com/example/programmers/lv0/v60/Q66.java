package com.example.programmers.lv0.v60;
import java.util.*;
public class Q66 {
    class Solution {
        public int solution(int[][] dots) {

            HashSet<Integer> xSet = new HashSet<>();
            HashSet<Integer> ySet = new HashSet<>();

            for(int[] dot: dots) {
                xSet.add(dot[0]);
                System.out.println("xSet.add  :" + dot[0]);

                ySet.add(dot[1]);
                System.out.println("ySet.add  :" + dot[1]);
            }

            ArrayList<Integer> xList = new ArrayList<>(xSet);
            ArrayList<Integer> yList = new ArrayList<>(ySet);

            System.out.println("xList.get(0)  :" + xList.get(0));
            System.out.println("xList.get(1)  :" + xList.get(1));
            System.out.println("yList.get(0)  :" + yList.get(0));
            System.out.println("yList.get(1)  :" + yList.get(1));
            System.out.println("xList.get(0) -  xList.get(1):" + Math.abs(xList.get(0) - xList.get(1)));
            System.out.println("yList.get(0) - yList.get(1) :" + Math.abs(yList.get(0) - yList.get(1)));
            return Math.abs(xList.get(0) - xList.get(1)) * Math.abs(yList.get(0) - yList.get(1));
        }
    }
}

/* 다른 풀이
class Solution {
    public int solution(int[][] dots) {

        int maxa = -256, mina = 256, maxb = -256, minb = 256;
        for(int i = 0; i < dots.length; i++){
            maxa = Math.max(maxa, dots[i][0]);
            mina = Math.min(mina, dots[i][0]);
            maxb = Math.max(maxb, dots[i][1]);
            minb = Math.min(minb, dots[i][1]);
        }

        return (maxa - mina) * (maxb - minb);
    }
}

* */

/*
직사각형 넓이 구하기
문제 설명
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가
담겨있는 배열 dots가 매개변수로 주어질 때,
직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

제한사항
dots의 길이 = 4
dots의 원소의 길이 = 2
-256 < dots[i]의 원소 < 256
잘못된 입력은 주어지지 않습니다.
입출력 예
dots	                            result
[[1, 1], [2, 1], [2, 2], [1, 2]]	    1
[[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
입출력 예 설명
입출력 예 #1

좌표 [[1, 1], [2, 1], [2, 2], [1, 2]] 를 꼭짓점으로 갖는
직사각형의 가로, 세로 길이는 각각 1, 1이므로 직사각형의 넓이는 1 x 1 = 1입니다.
입출력 예 #2

좌표 [[-1, -1], [1, 1], [1, -1], [-1, 1]]를 꼭짓점으로
갖는 직사각형의 가로, 세로 길이는 각각 2, 2이므로 직사각형의 넓이는 2 x 2 = 4입니다.
 */