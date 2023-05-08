-- 코드를 입력하세요
SELECT TITLE ,board.BOARD_ID ,REPLY_ID , reply.WRITER_ID ,reply.CONTENTS 
, DATE_FORMAT(reply.CREATED_DATE,"%Y-%m-%d")as CREATED_DATE 
from USED_GOODS_REPLY as reply
join USED_GOODS_BOARD as board
on reply.BOARD_ID = board.BOARD_ID  
where  DATE_FORMAT(board.CREATED_DATE,'%Y-%m' ) = '2022-10'
order by  CREATED_DATE ,TITLE