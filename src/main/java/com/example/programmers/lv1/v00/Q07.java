package com.example.programmers.lv1.v00;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q07 {

    public int solution(String s) {

        int answer = 0;

        //영문자가 없는지 검색
        if(!s.matches(".*[a-zA-Z].*")) return Integer.parseInt(s);

        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0); map.put("one", 1);
        map.put("two", 2); map.put("three", 3);
        map.put("four", 4); map.put("five", 5);
        map.put("six", 6);  map.put("seven", 7);
        map.put("eight", 8); map.put("nine", 9);

        // for loop (entrySet())
        for (Entry<String ,Integer> entrySet : map.entrySet()) {
            if(s.contains(entrySet.getKey())) {
                s = s.replaceAll(entrySet.getKey(), Integer.toString(entrySet.getValue()));
            }
        }
        return answer = Integer.parseInt(s);
    }
}
/*
네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때
일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고
그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

입출력 예
s	                    result
"one4seveneight"	    1478
"23four5six7"	        234567
"2three45sixseven"	    234567
"123"	                123
* */

/* 다른풀이
class Solution {
    public int solution(String s) {

        String[][] mapArr = { {"0", "zero"},
                              {"1", "one"},
                              {"2", "two"},
                              {"3", "three"},
                              {"4", "four"},
                              {"5", "five"},
                              {"6", "six"},
                              {"7", "seven"},
                              {"8", "eight"},
                              {"9", "nine"} };

        for(String[] map : mapArr){
            s = s.replace(map[1], map[0]);
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}
* */

/*
class Solution {
    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replaceAll(arr[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }
}
* */

/* 다른풀이
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}

* */

