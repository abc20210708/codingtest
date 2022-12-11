package com.example.sqlkit.lv10;

//lv1. 12세 이하인 여자 환자 목록 출력하기
public class Q11 {
    /*
    SELECT PT_NAME, PT_NO, GEND_CD, AGE, NVL(TLNO, 'NONE') AS TLNO
    FROM PATIENT
    WHERE 12 >= AGE
    AND gend_cd = 'W'
    ORDER BY AGE DESC, PT_NAME ASC
    * */
}
