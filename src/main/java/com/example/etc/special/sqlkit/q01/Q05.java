package com.example.etc.special.sqlkit.q01;

public class Q05 {
    /*
    SELECT COUNT(DISTINCT NAME) AS count
    FROM ANIMAL_INS
    WHERE NAME IS NOT NULL
    * */
}

/* 중복 제거하기

동물 보호소에 들어온 동물의 이름은
몇 개인지 조회하는 SQL 문을 작성해주세요.
이때 이름이 NULL인 경우는 집계하지
않으며 중복되는 이름은 하나로 칩니다.

보호소에 들어온 동물의 이름은 NULL(없음), *Sam, *Sam, *Sweetie입니다.
이 중 NULL과 중복되는 이름을 고려하면,
보호소에 들어온 동물 이름의 수는 2입니다.
따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

count
2
* */