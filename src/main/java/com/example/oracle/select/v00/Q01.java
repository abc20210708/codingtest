package com.example.oracle.select.v00;

public class Q01 {
    /*
    SELECT NAME FROM (
        SELECT NAME
        FROM ANIMAL_INS
        ORDER BY DATETIME
        )
    WHERE ROWNUM <= 1
    * */
}
/* 다른 풀이
SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME ASC LIMIT 1;
* */