package com.example.doit.chapter01.part01;

/*
 시간 복잡도 유형
 - 빅 오메가 (best case) : 최선일 떄의 연산 횟수를 나타낸 표기법
 - 빅 세타 (average case) : 보통일 때의 연산 횟수를 나타낸 표기법
 - 빅 오 (worst case) : 최악일 때 연산 횟수를 나타낸 표기법
* */

//시간 복잡도 예제 코드
public class Unit000 {
    public static void main(String[] args) {
        // 1 ~ 100 사이 값 랜덤 선택
        int findNumber = (int)(Math.random() * 100);
        for (int i = 0; i < 100; i++) {
            if (i == findNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
