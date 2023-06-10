package com.example.etc.special.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// 참고 블로그 https://developsd.tistory.com/113
public class Version<str> {

    // 1. 람다식 (Lambda)

    /*
        람다는 익명 함수로, 이름과 식별자가 없는 함수를 말합니다.
        람다를 사용하면 코드를 간결하게 작성할 수 있습니다.

        (parameters) -> expression
        (x, y) -> x +y

        ## 람다 표현식 작성 규칙

        람다식에는 매개변수가 0개, 1개 이상일 수 있습니다.(매개변수 없어도 가능)
        () -> expression

        매개변수가 여러개이면 괄호로 묶고, 쉼표로 구분합니다.
        (param1, param2, param3) -> expression
        매개변수가 1개인 경우 괄호를 반드시 쓰지 않아도 됩니다.

        람다식의 본문이 단일문인 경우는 중괄호는 필수가 아니지만,
        둘 이상의 명령문이 있는 경우 괄호를 사용해야 합니다.
        (param1, param2) -> {
            param1 = param1 + 1;
            param2 = param2 + 2;
        }


    * */

    // 2. Optional

    /*
        Optional을 사용하면 NullpointException을 걱정하지 않아도 됩니다.
        기존에 null을 체크하기 위해서 if문을 많이 사용했지만
        Optional을 사용하면 null을 핸들링 할 수 있습니다.

        Optional은 null이나 null이 아닌 값을 담을 수 있는 클래스입니다.
        Optional을 사용하면 DB를 조회하고 null인 경우
        orElseThrow 메서드를 사용해 에러를 던지거나 ifpresent 메서드로
        분기처리를 하는 등 null처리를 세련되게 할 수 있게 됩니다.

    * */

    public static void main(String[] args) {
        // 일반 null 처리
        String str = "name";
        if(str != null) {
            System.out.println("name : "+ str);
        }

        // Optional 처리
        String str2 = "name";

        Optional<String> opt = Optional.ofNullable(str);
        opt.ifPresent(s -> System.out.println("name: " + str));
    }

    // 3. Stream API
    /*
         필터링, 변환 등 다양한 방식으로 배열이나 컬렉션(List, Map등)을 반복적으로
         처리하는 스트림 API 추가되었습니다.
         컬렉션을 다루기 위한 API로 컬렌션의 요소를 람다식으로 처리하여 복잡한
         구조의 데이터 처리를 간다하게 해주어 코드의 복잡도를 낮출 수 있습니다.

         기존의 for문을 돌리면서 처리하던 것을 Stream으로 변환하고 mapping, sorting,
         filtering 등을 메서드로 할 수 있게 해줍니다.
         스트림 API을 사용하면 기존 코드보다 가독성이 좋게 데이터를 처리, 가공이 가능합니다.

    * */

    void test() {
        // java 7
        List<String> nameList = Arrays.asList("apple", "pie", "banana", "cake", "coffee", "latte");
        List<String> aNameList = new ArrayList<>();

        for (String name : nameList) {
            if (name.contains("a")) {
                aNameList.add(name);
            }
        }

        for (String a : aNameList) {
            System.out.println(a);
        }
    }

    void test2() {
        // java 8
        List<String> nameList = Arrays.asList("apple", "pie", "banana", "cake", "coffee", "latte");
        nameList.stream()
                .filter(name -> name.contains("a"))
                .forEach(a -> System.out.println(a));
    }

}//
