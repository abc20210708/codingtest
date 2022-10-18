package com.example.programmers.lv0.v20;
import java.util.*;

public class Q29 {


    class Solution {
        public int solution(int[] array) {

            if(array.length == 1) return array[0];

            Arrays.sort(array);
            HashMap<Integer, Integer> map = new HashMap<>();


            for(int num: array)
                map.put(num, map.getOrDefault(num, 0) + 1);


            int target = 0, tar = 0;
            for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
                if(tar < entrySet.getValue()) {
                    tar = entrySet.getValue();
                    target = entrySet.getKey();
                }
            }


            int cnt = 0;
            for(int key: map.values()) { //keySet
                if(tar == key) cnt++;
            }

            if(cnt > 1) target = -1;

            return target;
        }

    }
}

/* 다른 풀이
import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        // Map(값, 값의 빈도수)
        for(int x : array)
            map.put(x, map.getOrDefault(x, 0)+1);

        // Map에서의 최빈값 찾기
        int mode = 0;
        int modeNum = 0;
        for(int x : map.keySet())
            if(map.get(x) > modeNum) {
                mode = x;
                modeNum = map.get(x);
            }

        // 동일한 최빈값이 여러개일 경우, 그 갯수를 count
        int modeCnt = 0;
        for(int x : map.values()){
            if(x == modeNum) modeCnt++;
            if(modeCnt > 1) return -1;
        }

        return mode;
    }
}
* */

/*
최빈값 구하기
문제 설명
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

제한사항
0 < array의 길이 < 100
-1000 < array의 원소 < 1000
입출력 예
array	result
[1, 2, 3, 3, 3, 4]	3
[1, 1, 2, 2]	-1
[1]	1
입출력 예 설명
입출력 예 #1

[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
입출력 예 #2

[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
입출력 예 #3

[1]에는 1만 있으므로 최빈값은 1입니다.*/