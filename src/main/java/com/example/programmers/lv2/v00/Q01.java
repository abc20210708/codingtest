package com.example.programmers.lv2.v00;
import java.lang.*;
import java.util.Arrays;

public class Q01 {

        public String solution(String s) {
            String answer = "";

            //공백으로 문자열을 나눔
            String[] splited = s.split(" ");
            //나눈 문자들을 int로 변환
            int[] temp = new int[splited.length];
            for (int i = 0; i < splited.length; i++) {
                temp[i] = Integer.parseInt(splited[i]);
            }

            int numMin = 0, numMax = 0;

            Arrays.sort(temp);

            if(temp[0] == temp[1]) {
                numMin = temp[0];
                numMax = temp[0];
            }

            numMin = temp[0]; numMax = temp[temp.length-1];

            answer = Integer.toString(numMin) + " " + Integer.toString(numMax);

            return answer;
        }
    }


/*
최댓값과 최솟값
문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을
 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
입출력 예
s	                return
"1 2 3 4"	        "1 4"
"-1 -2 -3 -4"	    "-4 -1"
"-1 -1"	            "-1 -1"
**/

/*
다른풀이
class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        int[] arr = new int[split.length];

        for(int i=0; i<split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        java.util.Arrays.sort(arr);

        int max = arr[0];
        int min = arr[split.length-1];

        return max + " " + min;
    }

}
* */
