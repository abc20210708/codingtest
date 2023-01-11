package com.example.etc.special.sqlkit;

public class Q06 {
    /*
    SELECT NAME, COUNT(NAME) AS COUNT
    FROM ANIMAL_INS
    GROUP BY NAME
    HAVING COUNT(NAME) > 1
    AND NAME IS NOT NULL
    ORDER BY NAME
    * */
}

/*  동명 동물 수 찾기
동물 보호소에 들어온 동물 이름 중
두 번 이상 쓰인 이름과 해당 이름이
쓰인 횟수를 조회하는 SQL문을 작성해주세요.
이때 결과는 이름이 없는 동물은 집계에서 제외하며,
결과는 이름 순으로 조회해주세요.

Raven 이름은 2번 쓰였습니다.
Lucy 이름은 3번 쓰였습니다
Shadow 이름은 1번 쓰였습니다.
따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

NAME	COUNT
Lucy	3
Raven	2

**/
