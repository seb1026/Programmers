-- 코드를 입력하세요
SELECT USER_ID, PRODUCT_ID
FROM (
    SELECT USER_ID, PRODUCT_ID, COUNT(*)
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID
    HAVING COUNT(*) >= 2
    ORDER BY USER_ID, PRODUCT_ID DESC
    )