package com.example.sqlkit.lv10;
//lv1. 흉부외과 또는 일반외과 의사 목록 출력하기
public class Q10 {

    /*
    SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD, 'YYYY-MM-DD') AS HIRE_YMD
    FROM DOCTOR
    WHERE MCDP_CD IN ('CS', 'GS')
    ORDER BY HIRE_YMD DESC, DR_NAME ASC;
    * */
}
