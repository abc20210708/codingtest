package com.example.sqlkit.lv20;

//    lv2.중성화 여부 파악하기
public class Q25 {

    /*



SELECT ANIMAL_ID, NAME,
case when SEX_UPON_INTAKE like '%Neutered%' then 'O'
     when SEX_UPON_INTAKE like '%Spayed%' then 'O'
                     else 'X' end as 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
    * */
}
