package com.example.programmers.lv1.v10;
import java.util.*;

public class Q12 {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max_v = 0;
            int max_h = 0;

            for(int i = 0; i < sizes.length; i++) {
                int v = Math.max(sizes[i][0], sizes[i][1]);
                int h = Math.min(sizes[i][0], sizes[i][1]);
                //System.out.println("sizes.length : " +sizes.length);
               // System.out.println("sizes[0.length : " +sizes[0].length);
                max_v = Math.max(max_v, v);
                max_h = Math.max(max_h, h);
            }

            return answer = max_v * max_h;
        }
    }
}

/* 다른 풀이
class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}

//향상된 for문으로 2차원 배열 출력하는 방법
        System.out.println();
        for (int[] row : a) { // 행을 먼저 받고
            for (int n : row) { // 열을 준다
                System.out.printf("%4d", n);
            }
            System.out.println();
        }
* */

/*
최소직사각형

문제 설명
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
  이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.

명함 번호	가로 길이	세로 길이
1	60	50
2	30	70
3	60	30
4	80	40
가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의
지갑을 만들면 모든 명함들을 수납할 수 있습니다.
 하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로
  모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.

모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

제한사항
sizes의 길이는 1 이상 10,000 이하입니다.
sizes의 원소는 [w, h] 형식입니다.
w는 명함의 가로 길이를 나타냅니다.
h는 명함의 세로 길이를 나타냅니다.
w와 h는 1 이상 1,000 이하인 자연수입니다.

입출력 예
sizes	                                            result
[[60, 50], [30, 70], [60, 30], [80, 40]]	        4000
[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	    120
[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	    133
입출력 예 설명
입출력 예 #1
문제 예시와 같습니다.

입출력 예 #2
명함들을 적절히 회전시켜 겹쳤을 때,
3번째 명함(가로: 8, 세로: 15)이 다른 모든 명함보다 크기가 큽니다.
 따라서 지갑의 크기는 3번째 명함의 크기와 같으며, 120(=8 x 15)을 return 합니다.

입출력 예 #3
명함들을 적절히 회전시켜 겹쳤을 때, 모든 명함을 포함하는 가장 작은 지갑의 크기는 133(=19 x 7)입니다.
* */