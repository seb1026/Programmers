-- 코드를 입력하세요
SELECT U.USER_ID, U.NICKNAME, B.TOTAL_SALES
FROM USED_GOODS_USER U, 
    (SELECT WRITER_ID, SUM(PRICE) TOTAL_SALES
    FROM USED_GOODS_BOARD
    WHERE STATUS = 'DONE'
    GROUP BY WRITER_ID
    HAVING SUM(PRICE) >= 700000) B
WHERE U.USER_ID = B.WRITER_ID
ORDER BY B.TOTAL_SALES