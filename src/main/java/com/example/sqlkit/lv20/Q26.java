package com.example.sqlkit.lv20;

//lv2. 입양 시각 구하기(1)
public class Q26 {
    /*

SELECT to_number(to_char(datetime, 'hh24')) as hour,
        count(to_char(datetime, 'hh24'))
FROM animal_outs
WHERE to_char(datetime, 'hh24') between 9 and 19
GROUP BY to_char(datetime, 'hh24')
ORDER BY hour
    * */
}
