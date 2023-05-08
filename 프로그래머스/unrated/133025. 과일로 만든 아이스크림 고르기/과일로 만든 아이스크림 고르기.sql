-- 코드를 입력하세요
SELECT FLAVOR from FIRST_HALF
where TOTAL_ORDER > 3000 and not FLAVOR like "%chocolate%"
order by TOTAL_ORDER desc