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
  
select 12.345, trunc(12.345, 2), trunc(12.345, -1)
  from dual;
  
select 15.345, round(15.345, 2), round(15.345, -1) 
  from dual;
  
select length('Oracle'), lengthb('Oracle'),
       length('오라클'), lengthb('오라클')
  from dual;
  
  