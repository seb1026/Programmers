-- 코드를 입력하세요
SELECT HOUR
     , COUNT(B.DATETIME) AS COUNT
  FROM (
    SELECT LEVEL-1 AS HOUR
      FROM DUAL
    CONNECT BY LEVEL <= 24
  ) A LEFT join ANIMAL_OUTS B
 ON A.HOUR = TO_CHAR(B.DATETIME,'HH24')
 GROUP BY HOUR
 ORDER BY HOUR