package com.example.pccp.ch01;
import java.util.*;
public class Q02 {


    class Solution {
        //참고 블로그 https://taehoung0102.tistory.com/221
        boolean[] visited;
        int scope;
        int total=0;

        public int solution(int[][] ability) {
            //유저수
            visited=new boolean[ability.length];
            //종목수
            scope=ability[0].length;

            dfs(ability,0,0);
            return total;
        }

        public void dfs(int[][] ability,int start,int sum){

            if(start==scope){
                total=Math.max(total,sum);
                return;
            }

            for(int i=0;i<ability.length;i++){
                if(!visited[i]){
                    visited[i]=true;
                    dfs(ability,start+1,sum+ability[i][start]);
                    visited[i]=false;
                }
            }
        }
    }
}
/*
[PCCP 모의고사 #1] 체육대회
문제 설명
당신이 다니는 학교는 매년 체육대회를 합니다.
체육대회는 여러 종목에 대해 각 반의
해당 종목 대표가 1명씩 나와 대결을 하며,
한 학생은 최대 한개의 종목 대표만 할 수 있습니다.
당신의 반에서도 한 종목당 1명의 대표를 뽑으려고 합니다.
학생들마다 각 종목에 대한 능력이 다르지만 이 능력은 수치화되어
있어 미리 알 수 있습니다.
당신의 반의 전략은 각 종목 대표의 해당 종목에
대한 능력치의 합을 최대화하는 것입니다.

다음은 당신의 반 학생이 5명이고, 종목의 개수가 3개이며,
각 종목에 대한 학생들의 능력치가 아래 표와 같을 때,
각 종목의 대표를 뽑는 예시입니다.

    테니스	탁구  	수영
석환	40	    10	    10
영재	20	    5	    0
인용	30	    30	    30
정현	70	    0	    70
준모	100	100	100
테니스 대표로 준모, 탁구 대표로 인용, 수영 대표로 정현을 뽑는다면,
세 명의 각 종목에 대한 능력치의 합은 200(=100+30+70)이 됩니다.
하지만, 테니스 대표로 석환, 탁구 대표로 준모, 수영 대표로
정현을 뽑는다면 세 명의 각 종목에 대한 능력치 합은 210(=40+100+70)이 됩니다.
이 경우가 당신의 반의 각 종목 대표의 능력치 합이 최대가 되는 경우입니다.

당신의 반 학생들의 각 종목에 대한 능력치를 나타내는
2차원 정수 배열 ability가 주어졌을 때, 선발된 대표들의 해당 종목에
대한 능력치 합의 최대값을 return 하는 solution 함수를 완성하시오.

제한사항
1 ≤ ability의 행의 길이 = 학생 수 ≤ 10
1 ≤ ability의 열의 길이 = 종목 수 ≤ ability의 행의 길이
0 ≤ ability[i][j] ≤ 10,000
ability[i][j]는 i+1번 학생의 j+1번 종목에 대한 능력치를 의미합니다.
입출력 예
ability	                                                                result
[[40, 10, 10], [20, 5, 0], [30, 30, 30], [70, 0, 70], [100, 100, 100]]	210
[[20, 30], [30, 20], [20, 30]]	                                        60
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.
입출력 예 #2

1번 학생이 2번 종목을, 2번 학생이 1번 종목의 대표로 참가하는 경우에 대표들의 해당 종목에 대한 능력치의 합이 최대가 되며, 이는 60입니다.
* */