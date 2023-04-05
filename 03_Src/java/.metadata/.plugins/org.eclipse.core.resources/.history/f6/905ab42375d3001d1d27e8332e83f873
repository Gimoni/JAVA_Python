-- sql 숫자 함수 

select abs (-10)
  from dual;
  
with temp as (
    select -10 as v from dual union
    select   0 as v from dual union
    select  20 as v from dual
)
select abs (v)
  from temp;

-- 숫자함수 
with temp as (
    select -10 as v, 10.5 as v1 from dual union
    select   0 as v,-10.3 as v2 from dual union
    select  20 as v,-10.6 as v3 from dual
)
select abs (v), power(v, 3), mod(v, 3), floor(v1), ceil(v1), round(v1)
  from temp;
  
