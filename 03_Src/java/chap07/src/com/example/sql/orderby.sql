select *
  from emp
 where 1=1
-- 
--order by hiredate;
-- 입사일 순
order by hiredate asc;
-- 최근 입사일 순
--order by hiredate desc;

select * 
  from emp
--order by sal asc;
order by sal desc;

select deptno, ename, sal
  from emp
order by deptno asc, sal desc;

-- with 사용 / 가상의 테이블 생성
-- union은 합치는 것.. 
with temp as (
    select 'A' as alpha from dual union
    select 'B' as alpha from dual union
    select 'a' as alpha from dual union
    select 'b' as alpha from dual union
    select '1' as alpha from dual union
    select '2' as alpha from dual 
)
-- ASKII code를 기준으로 나옴. 
select * from temp order by alpha asc;
--select * from temp order by alpha desc;

