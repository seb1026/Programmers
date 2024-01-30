-- 코드를 입력하세요
SELECT A.ID
     , A.NAME
     , A.HOST_ID
  FROM PLACES A
     , (
        SELECT A.HOST_ID
             , COUNT(*) CNT
          FROM PLACES A
             , (SELECT DISTINCT HOST_ID FROM PLACES) B
         WHERE A.HOST_ID = B.HOST_ID
         GROUP BY A.HOST_ID
        HAVING COUNT(*) >= 2) B
 WHERE A.HOST_ID = B.HOST_ID