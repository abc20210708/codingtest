package com.example.etc.special.sqlkit.q01;

public class Q01 {
    /*
    SELECT *
    FROM FOOD_PRODUCT
    WHERE PRICE IN (SELECT MAX(PRICE)
                    FROM FOOD_PRODUCT)
    * */
}

/*
가격이 제일 비싼 식품의 정보 출력하기

문제
FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의
식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을
조회하는 SQL문을 작성해주세요.
* */