package com.example.programmers.lv2.v00;
import java.util.*;

public class Q04 {
    class Solution {
        public int solution(int[] citations) {
            int answer = 0;

            Arrays.sort(citations);

            int target;
            for(int i = 0; i < citations.length; i++) {
                //i일 때 가장 큰 논문 편수
                target = citations.length - i;

                //논문 인용횟수가 h 이상 인지 확인
                if(citations[i] >= target) {
                    answer = target;
                    break;
                }
            }

            return answer;
        }
    }
}

//참고 블롤그 https://bada744.tistory.com/94

/* 다른 풀이 1
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }
        return answer;
    }
}
* */

// 참고 블로그 https://jionchu.tistory.com/10
/* 다른 풀이 2
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); //오름차순 정렬

        for (int i=citations.length-1;i>-1;i--) {
            //인용수가 현재 h보다 크지 않은 경우
            //현재 h가 h의 최댓값임
            if (citations[i] <= answer)
                break;
            answer++;
        }

        return answer;
    }
}
* */

/*
H-Index

문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다.
 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다
 . 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때,
 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

입출력 예
citations	            return
[3, 0, 6, 1, 5]	            3
입출력 예 설명
이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다.
그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
* */
