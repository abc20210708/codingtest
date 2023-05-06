package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hello {

    //static int n;
    //static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) { //main method
        int n;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int res = 0; // 총 그룹의 수
        int cnt = 0; // 현재 그룹에 포함된 모험가의 수
        for (int i = 0; i < n; i++) {
            cnt += 1; //현재 그룹에 해당 모험가를 포함시키기
            if (cnt >= list.get(i)) {
                res += 1;
                cnt = 0;
            }
        }
        System.out.println(res);

    }
}

/* 객체는 소프트웨어 세계에서 구현할 대상이고, 이를 구현하기 위한 설계도가 클래스이며,
   이 설계도에 따라 소프트웨어 세계에 구현된 실체가 인스턴스 입니다.
** */

/*
첫 번째 코드에서는 n과 list 변수를 static으로 선언하여 클래스 멤버로 사용하고 있습니다.
이는 해당 변수들이 클래스 수준에서 공유되는 변수임을 의미합니다.
 main 메서드 외부에서도 접근할 수 있고, 다른 메서드에서도 사용할 수 있습니다.

두 번째 코드에서는 n과 list 변수를 main 메서드 내부에서 선언하고 있습니다.
이는 해당 변수들이 main 메서드에서만 사용되는 지역 변수임을 의미합니다.
다른 메서드에서는 이 변수들에 직접 접근할 수 없습니다.

따라서, 첫 번째 코드에서는 n과 list 변수가 클래스 수준에서 공유되므로
다른 메서드에서도 사용할 수 있고, 두 번째 코드에서는 n과 list 변수가
main 메서드 내에서만 사용되므로 다른 메서드에서는 사용할 수 없습니다.
* */