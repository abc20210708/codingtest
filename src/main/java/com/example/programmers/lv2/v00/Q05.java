package com.example.programmers.lv2.v00;
import java.util.*;

public class Q05 {

    class Solution {
        public String solution(int[] numbers) {
            String[] str = new String[numbers.length];

            for (int i = 0; i < str.length; i++) {
                str[i] = Integer.toString(numbers[i]);
            }

            Arrays.sort(str, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

            if(str[0].equals("0"))
                return "0";

            StringBuilder answer = new StringBuilder();

            for(String s : str)
                answer.append(s);

            return answer.toString();

        }
    }
}

/* 다른 풀이
import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->(b+a).compareTo(a+b));
        for(int i=0;i<numbers.length;i++){
            pq.add(numbers[i]+"");
            System.out.println(numbers[i]+"");

        }
        for(int i=0;i<numbers.length;i++){
            answer+=pq.remove();

        }

        -> answer.charAt(0) == '0' 은 [0,0,0] 일경우 "000"이 되어서 앞자리가 0일경우엔 무조건 '0'을 리턴하도록
        if(answer.charAt(0)=='0'){
            answer = "0";
        }

        return answer;
    }
}
* */

/* 다른 풀이 2
  String answer = "";

            //int 배열을 String 배열로 변환
            String[] arr = new String[numbers.length];

            for(int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.toString(numbers[i]);
            }

            //배열 정렬
            //정렬 규칙으로 2개를 더해 더 큰 쪽이 우선순위가 있도록 정렬
            Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
            /*
            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return (s2 + s1).compareTo(s1 + s2);
                }
            });

            * */

//0000처럼 0으로만 구성되어있으면 0 return
    /*        if (arr[0].equals("0")) return "0";

                    //그 외의 경우 순차적으로 연결하여 answer return
                    for(int i = 0; i < arr.length; i++) {
        answer += arr[i];
        }


        return answer;
* */

/* 다른 풀이 3
String answer = "0";
            String[] str = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                str[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
            if(!str[0].equals("0")) {
                StringBuilder sb = new StringBuilder();
                for(String s : str) {
                    sb.append(s);
                }
                answer = sb.toString();
            }
            return answer;

* */

//참고 블로그
//https://hidelookit.tistory.com/90
/*
가장 큰 수
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면
[6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고,
이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여
 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers             	return
[6, 10, 2]	            "6210"
[3, 30, 34, 5, 9]	    "9534330"
* */
