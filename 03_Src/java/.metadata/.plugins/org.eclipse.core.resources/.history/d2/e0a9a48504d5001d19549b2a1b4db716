select ename, substr(ename, 1, 1), substr(ename, 2, 2)  
  from emp;
  
-- 가상 데이터 테이블을 만들어서 실습..
with tmp as (
    select 'Hello World' as v from dual union
    select 'Java World' as v from dual union
    select 'Python world' as v from dual union
    select 'Oracle world' as v from dual
)
-- instr (대상, 찾을 글자, 시작위치, 몇_번째_발견)
--select v, instr(v, 'o')
select v, instr(v, 'o', 5)
  from tmp;


  
-- 전체 문자열에서 찾고자하는 문자열이 어디에 위치해 있는지 
-- 특정 문자의 위치값을 반환한다. 
select  ename, instr(ename, '병')
  from emp;
  
select 10, 10.5,
       to_char(10, '0000'),
       to_char(10, '9,000'),
       to_char(12345, '99,900'),
       to_char(12345, 'L99,900'),
       to_char(1.2345, '99.999')
  from dual;
  

--  형변환 함수 날짜 to_date
select sysdate
  from dual;


select sysdate,
       to_char(sysdate, 'yyyy-mm-dd'),
       to_char(sysdate, 'hh:mi:ss am'),
       to_char(sysdate, 'yyyy-mm-dd dy hh:mi:ss')
  from dual;


select ename, to_char(hiredate, 'yyyy-mm-dd hh:mi:ss')
  from emp;

select ename, hiredate 
  from emp
-- where hiredate >to_date('2000-01-01');
-- where hiredate <to_date('2000-01-01');
-- where hiredate >to_date('2000/01/01');
-- where hiredate >to_date('2000 01 01');
 where hiredate >to_date('20000101');
 
 
-- to_date를 생략도 출력형식을 확인하여 
-- 문자열이 데이터 타입으로 자동 변환
select ename, hiredate
  from emp
 where hiredate >= '2000-01-01';

-- 지정한 일정기간동안의 데이터 출력. 
select ename, hiredate
  from emp 
 where hiredate between '2000/01/01' and '2005/01/01';
  
  
-- 숫자형으로 변환하는 to_number함수
select '1234' + 10, to_number('1,234', '9,999') + 10
  from dual;
  
-- 날자에 수치를 더 할 수 있다. 
select sysdate + 100, to_date('2023/04/06') +100
  from dual;

-- 날짜와 날짜를 더 할 수는 없지만 뺄수는 있다.  
select sysdate - sysdate, to_date('2023/04/01')- to_date('2023/04/02')
  from dual;

--date 날짜 함수
select to_date('2000/01/01') - to_date('2001/01/01')
  from dual;
  
select to_date('2000/01/01') - to_date('2001/01/01'),
       months_between (to_date('2000/01/01') , to_date('2001/01/01')),
       trunc(months_between (to_date('2000/01/01') , to_date('2001/01/01')))
  from dual;
  

select to_date('2000/01/01') + 100,
       add_months(to_date('2000/01/01'), -100),
       add_months(to_date('2000/01/01'), 100)
  from dual;
  
-- lase_day 해당날짜가 해당되는 달의 마지막 날짜를 반환.   
select last_day(to_date('2000/02/01'))
  from dual;
  
--trunc // 숫자뿐 아니라 날짜를 잘라낼수 있음. 
-- 형식 : trunc (date, format)
select to_char(hiredate, 'yyyy/mm/dd') 입사일,
       to_char(trunc(hiredate, 'month'), 'yyyy/mm/dd') 입사일
  from emp;
  
select to_char(trunc(sysdate, 'd'), 'yyyy-mm-dd hh24:mi:ss'), 
       to_char(trunc(sysdate, 'cc'), 'yyyy-mm-dd hh24:mi:ss') 
  from dual;
  
--round  특정 기준으로 반올림하는 함수 
select to_char(round(to_date('2010/10/05 12:30:16',
                             'yyyy/mm/dd hh24:mi:ss'), 'hh24'),
                             'yyyy-mm-dd hh24:mi:ss') 
  from dual;
  
select to_char(round(to_date('2010/10/05 12:30:16',
                             'yyyy/mm/dd hh24:mi:ss'), 'dd'),
                             'yyyy-mm-dd hh24:mi:ss') 
  from dual;
  
select  trunc(sysdate - to_date('1992/09/24')) || '일' as 일,
        trunc(months_between(sysdate, to_date('1992/09/24'))) || '개월' as 월
  from dual;
  
select to_date('2023/04/06')- to_date('1992/09/24') || '일' as 일
  from dual;
  
  
  
  
select empno, ename, hiredate, 
       trunc(months_between(sysdate, hiredate)) as 개월
  from emp;
  

-- nvl / nvl2
select sal, comm,
      sal*12+ comm as a1,
      sal*12 + nvl(comm, 0) as a2,
      nvl2(comm, sal+12+comm, sal*12) as a3
 from emp;
   
   
--decode
select fg,
       decode(fg, 'Black', 30,
                  'Red', 31,
                  'Green', 32,
                  'Yellow', 33,
                  'Blue', 34,
                  'Magenta', 35,
                  'Cyan', 36,
                  'White', 37,
                            99) as "Color Number"
  from alpha;
  
  
select no,
       case when no<3000 then '전반부'
            when no<6000 then '중반부'
            when no<9000 then '후반부'
            else '후후반부'
       end as 순서
  from alpha;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  