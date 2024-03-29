package com.example.programmers.lv2.v00;
import java.util.*;
public class Q06 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> hm = new HashMap<>();
            for(int i =0; i<clothes.length; i++){
                hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1],0)+1);
            }
            for(String key : hm.keySet()) {
                answer *=(hm.get(key)+1);
            }
            answer -=1;
            return answer;
        }
    }
}
//참고 블로그 https://junghn.tistory.com/55
/*
 경우의 수 공식을 알면 쉽게 풀 수 있는 문제입니다.
 예를 들어 상의의 수를 A 하의의 수를 B라고 하면
 상의와 하의의 조합하는 경우의 수는 A * B입니다.
 이때 상의만 선택하고 하의는 선택하지 않을 수도 있고,
 하의만 선택하고 상의를 선택하지 않을 수도 있습니다.
 때문에 (A+1)*(B+1)의 경우의 수가 나옵니다.
 여기서 아무것도 입지 않는 수가 있을 수 있기 때문에
 최종적으로 -1을 해주면 (A+1)*(B+1) - 1이라는 공식을 얻을 수가 있습니다.
* */

/* 다른 풀이
 class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
* */

/* 다른 풀이 2
 import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(String[] c: clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) +1);
        }

        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }


        return answer -1;
    }
}
* */

/*
위장
문제 설명
스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.

예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가
동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은
청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.

종류	이름
얼굴	동그란 안경, 검정 선글라스
상의	파란색 티셔츠
하의	청바지
겉옷	긴 코트
스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때
서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
같은 이름을 가진 의상은 존재하지 않습니다.
clothes의 모든 원소는 문자열로 이루어져 있습니다.
모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
스파이는 하루에 최소 한 개의 의상은 입습니다.
입출력 예
clothes	                                                                                    return
[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]	5
[["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]	            3

입출력 예 설명
예제 #1
headgear에 해당하는 의상이 yellow_hat, green_turban이고 eyewear에
해당하는 의상이 blue_sunglasses이므로 아래와 같이 5개의 조합이 가능합니다.

1. yellow_hat
2. blue_sunglasses
3. green_turban
4. yellow_hat + blue_sunglasses
5. green_turban + blue_sunglasses
예제 #2
face에 해당하는 의상이 crow_mask, blue_sunglasses, smoky_makeup이므로 아래와 같이 3개의 조합이 가능합니다.

1. crow_mask
2. blue_sunglasses
3. smoky_makeup
* */