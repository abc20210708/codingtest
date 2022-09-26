package com.example.programmers.lv1;

public class Q08 {

    //참고 블로그 https://jeleedev.tistory.com/30


        public int[] solution(int[] answers) {

            int[] a = {1, 2, 3, 4, 5};
            int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int[] score = new int[3];

            //score[]에 수포자별 맞힌 갯수
            for(int i = 0; i < answers.length; i++) {
                if(answers[i] == a[i%5]) score[0]++;
                if(answers[i] == b[i%8]) score[1]++;
                if(answers[i] == c[i%10]) score[2]++;
            }

            //가장 높은 점수
            int max = 0;
            for(int i = 0; i < 3; i++) {
                if(score[i] > max) max = score[i];
            }

            //가장 높은 점수 받는 사람 수
            int maxCount = 0;
            for(int i = 0; i < 3; i++) {
                if(score[i] == max) maxCount++;
            }

            int[] answer = new int[maxCount];
            int idx = 0;
            for(int i = 0; i < 3; i++) {
                if(score[i] == max) answer[idx++] = i+1;
            }

            return answer;
        }


}
/*
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.
* */