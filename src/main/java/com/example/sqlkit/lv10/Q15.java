package com.example.sqlkit.lv10;

//lv1. 과일로 만든 아이스크림 고르기
public class Q15 {
    /*
    SELECT O.FLAVOR
    FROM
    (SELECT FLAVOR
    FROM FIRST_HALF
    WHERE TOTAL_ORDER > 3000
    ORDER BY TOTAL_ORDER DESC) O,
    ICECREAM_INFO I
    WHERE O.FLAVOR = I.FLAVOR
    AND I.INGREDIENT_TYPE = 'fruit_based'
    * */
}
