-- 코드를 입력하세요
SELECT FLAVOR
FROM (
    SELECT FLAVOR, SUM(TOTAL_ORDER) TOTAL_ORDER
    FROM (
        SELECT FLAVOR, SUM(TOTAL_ORDER) TOTAL_ORDER
        FROM FIRST_HALF
        GROUP BY FLAVOR
        UNION ALL
        SELECT FLAVOR, SUM(TOTAL_ORDER) TOTAL_ORDER
        FROM JULY
        GROUP BY FLAVOR)
    GROUP BY FLAVOR
    ORDER BY TOTAL_ORDER DESC)
WHERE ROWNUM <= 3