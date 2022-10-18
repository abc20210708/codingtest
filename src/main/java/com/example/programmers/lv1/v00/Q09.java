package com.example.programmers.lv1.v00;
import java.util.Arrays;

public class Q09 {
    //https://jeleedev.tistory.com/32

        public int solution(int n, int[] lost, int[] reserve) {

            int answer = n - lost.length; //잃어버린 학생

            Arrays.sort(lost);
            Arrays.sort(reserve);

            //여벌 체육복을 가져온 학생이 도난당한 경우
            for(int i = 0; i < lost.length; i++) {
                for(int j = 0; j < reserve.length; j++) {
                    if(lost[i] == reserve[j]) {
                        answer++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;//안에 있는 for문 break;
                        //만약 중첩 반복문(이중 for문)일 경우에 break를 사용할 경우에는
                        //현재 위치한 가장 안쪽의(j) 반복문에서 빠져나오고
                        //다시 제일 바깥쪽의 반복문(i)을 실행
                    }
                }
            }

            //도난당한 학생에게 체육복을 빌려주는 경우
            for(int i = 0; i < lost.length; i++) {
                for(int j =0; j < reserve.length; j++) {
                    if((lost[i] -1 == reserve[j]) || (lost[i]+ 1 == reserve[j])) {
                        answer++;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            return answer;
        }
    }


