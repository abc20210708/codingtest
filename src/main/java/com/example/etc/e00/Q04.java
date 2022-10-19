package com.example.etc.e00;

public class Q04 {
    class Solution {

        int[] dp1 = new int[100001]; //첫 번째 스티커를 뜯은 경우
        int[] dp2 = new int[100001]; //첫 번째 스티커를 뜯지 않은 경우

        public int solution(int sticker[]) {
            int answer = 0;

            int n = sticker.length;
            if(n == 1)
                return sticker[0];

            //첫 번째 스티커를 뜯은 경우
            dp1[0] = sticker[0];
            dp1[1] = dp1[0];

            for(int i = 2; i < n -1; ++i)
                dp1[i] = Math.max(dp1[i-1], dp1[i-2] + sticker[i]);
            //dp1[n-2]


            //첫 번째 스티커를 뜯지 않은 경우
            dp2[0] = 0;
            dp2[1] = sticker[1];

            for(int i = 2; i < n ; ++i)
                dp2[i] = Math.max(dp2[i-1], dp2[i-2] + sticker[i]);
            //dp2[n-1]


            return Math.max(dp1[n-2], dp2[n-1]);
        }
    }
}

/*
스티커 모으기(2)
문제 설명
N개의 스티커가 원형으로 연결되어 있습니다.

다음 그림은 N = 8인 경우의 예시입니다.

원형으로 연결된 스티커에서 몇 장의 스티커를 뜯어내어
뜯어낸 스티커에 적힌 숫자의 합이 최대가 되도록 하고 싶습니다.
단 스티커 한 장을 뜯어내면 양쪽으로 인접해있는 스티커는 찢어져서 사용할 수 없게 됩니다.

예를 들어 위 그림에서 14가 적힌 스티커를 뜯으면 인접해있는
10, 6이 적힌 스티커는 사용할 수 없습니다.
스티커에 적힌 숫자가 배열 형태로 주어질 때,
스티커를 뜯어내어 얻을 수 있는 숫자의 합의
최댓값을 return 하는 solution 함수를 완성해 주세요.
원형의 스티커 모양을 위해 배열의 첫 번째 원소와 마지막 원소가
서로 연결되어 있다고 간주합니다.


제한 사항
* */