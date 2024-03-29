-- 코드를 입력하세요
SELECT I.REST_ID
     , I.REST_NAME
     , I.FOOD_TYPE
     , I.FAVORITES
     , I.ADDRESS
     , ROUND(AVG(R.REVIEW_SCORE),2) SCORE
FROM REST_INFO I, REST_REVIEW R
WHERE I.ADDRESS LIKE '서울%'
AND I.REST_ID = R.REST_ID
GROUP BY I.REST_ID
     , I.REST_NAME
     , I.FOOD_TYPE
     , I.FAVORITES
     , I.ADDRESS
ORDER BY SCORE DESC, I.FAVORITES DESC

/*
SELECT *
FROM REST_INFO
WHERE ADDRESS LIKE '서울특별시%'

SELECT *
FROM REST_REVIEW
WHERE REST_ID IN ('1','5','8')
*/