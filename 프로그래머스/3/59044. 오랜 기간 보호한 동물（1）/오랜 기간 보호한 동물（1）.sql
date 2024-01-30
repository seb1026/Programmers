-- 코드를 입력하세요
SELECT *
  FROM (
      SELECT A.NAME
           , A.DATETIME
        FROM ANIMAL_INS A
       WHERE NOT EXISTS (
           SELECT 1 
             FROM ANIMAL_OUTS B 
            WHERE A.ANIMAL_ID = B.ANIMAL_ID)
       ORDER BY A.DATETIME
        )
 WHERE ROWNUM <= 3