
-- 합집합 연산자 union  입력 테이블과 결과 테이블에서 중복된 레코드가 배제됨.
select * from emp where deptno = 10
union
select * from emp where sal >= 500;

-- union all 연산은 union과 같지만 중복된 데이터가 제거되지 않음. 
select * from emp where deptno = 10
union all
select * from emp where sal >= 500;

-- 교집합 intersect
select * from emp where deptno = 10
intersect
select * from emp where sal >= 500;

--차집합 minus
select * from emp where deptno = 10
minus
select * from emp where sal >= 500;

select * from emp where sal >= 500
minus
select * from emp where deptno = 10;


-- with 절 // 추가 데이터 // 
with emp01 as (
    select empno, ename, sal from emp where deptno = 10
    union
    select 2000, '홍길동', 5000 from dual 
)
select * from emp01;


--  dual table
select 10/3 from dept;
select 10/3 from emp;
select 10/3 from dual;

-- DUAL 
-- 모든 유저가 접근할 수 있는 결과를 한줄로 얻기 위해서 
-- 오라클에서 제공해주는 테이블 // 함수 자체를 이해할 때 활용도가 높다. 
select * from dual;
