-- 코드를 입력하세요
SELECT M.MEMBER_NAME, R.REVIEW_TEXT, TO_CHAR(R.REVIEW_DATE,'YYYY-MM-DD') REVIEW_DATE
FROM MEMBER_PROFILE M, REST_REVIEW R,
    (SELECT MEMBER_ID
    FROM (
    SELECT MEMBER_ID, COUNT(*) CNT
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    HAVING COUNT(*) = (SELECT MAX(COUNT(*)) FROM REST_REVIEW GROUP BY MEMBER_ID))) RR
WHERE M.MEMBER_ID = R.MEMBER_ID
AND M.MEMBER_ID = RR.MEMBER_ID
ORDER BY R.REVIEW_DATE, R.REVIEW_TEXT