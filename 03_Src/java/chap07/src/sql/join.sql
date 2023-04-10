select * from emp;

select ename, dname
  from emp, dept
 where emp.deptno = dept.deptno
 and ename = '안성기';
   
select ename 사원이름, job 직급, hiredate 입사일 , dname 부서명
  from emp, dept
 where emp.deptno = dept.deptno;
 
select * from emp, dept;

select * from emp;


-- cross join 
-- 테이블을 합쳤을 때 나올 수 있는 모든 경우의 수. 
with temp01 as (
    select 1 as no from dual union
    select 2 as no from dual union
    select 3 as no from dual
), temp02 as (
    select 'A' as alpha from dual union
    select 'B' as alpha from dual union
    select 'C' as alpha from dual
)

select * 
--  from temp01, temp02;
  from temp01 cross join temp02;  
  
-- cross join emp * dept // 
select * 
  from emp cross join dept;
 
  
select *
  from emp, dept 
--  from emp cross join dept
 order by empno;
 
 
-- cross join 실행 이후 의미 있는 데이터를 지정하는 것 : inner join 
-- equi join 
select *
  from emp, dept 
 where emp.deptno = dept.deptno
 order by empno;

-- cross join 실행 이후 의미 있는 데이터를 지정하는 것 : inner join 
select ename, dname, loc
  from emp, dept 
 where emp.deptno = dept.deptno
 order by empno;

-- inner join / 조건 on
select ename, dname, loc
  from emp inner join dept 
    on emp.deptno = dept.deptno
 order by empno;

-- inner join을 사용해서 sal 500 이상인 사원의 부서를 합한 데이터
select ename, dname, loc, sal
  from emp inner join dept 
    on emp.deptno = dept.deptno
 where sal > 500
 order by empno;
 
-- 별칭을 줌.
select * 
  from emp e, dept d;
 
-- 별칭을 준 cross join  
select * 
  from emp e, dept d
 where e.deptno = d.deptno;
 
 
-- inner join  
select * 
  from emp e inner join dept d 
    on e.deptno = d.deptno;
    
select *
  from emp e inner join dept d 
  on e.deptno = d.deptno;
  
-- 컬럼의 모호성 해결. 
-- 테이블 명을 직접주거나, 테이블에 별칭을 사용함. 
select ename, dname, emp.deptno
  from emp, dept;
 
 -- 별칭 사용.. 
select ename, dname, e.deptno, d.deptno
  from emp e, dept d;
 
 -- 일관적으로 별칭 사용.
select e.ename,
       d.dname, 
       e.deptno, 
       d.deptno
  from emp e, dept d;
  
select e.ename,
       d.dname, 
       e.deptno, 
       d.deptno
  from emp e, dept d
 where e.deptno = d.deptno
 order by e.ename;



select * 
  from emp
 where ename = '이문세';

-- 급여등급테이블.
select * 
  from salgrade;
 
select * 
  from salgrade
 where losal <= 520 and 520 <= hisal;
 

select *
  from salgrade
 where 520 between losal and hisal;
 
-- cross join emp + salgrade 
select * 
  from emp e, salgrade s
 order by empno;
 
-- non equi join 
select e.empno, e.ename, e.sal, s.grade
  from emp e, salgrade s 
 where e.sal between s.losal and s.hisal
 order by empno;
  
-- inner join의 sql 표준적인 작성방법
select e.empno, e.ename, e.sal, s.grade
  from emp e inner join salgrade s 
    on e.sal between s.losal and s.hisal
 order by empno;
 




 -- 40번 부서에 해당하는 데이터는 없다. 
 select d.deptno, e.deptno
   from dept d cross join emp e 
  where d.deptno = 40;
 
 select *
   from dept d inner join emp e
     on d.deptno = e.deptno
   order by d.deptno;
   
 select d.deptno, d.dname, e.ename
   from dept d inner join emp e
     on d.deptno = e.deptno
   order by d.deptno;   

-- sql 표준 outer join // lefr , right , full
 select d.deptno, d.dname, e.ename
   from dept d left outer join emp e
     on d.deptno = e.deptno
   order by d.deptno;

-- 표준이전 Oracle outer join 
 select d.deptno, d.dname, e.ename
   from dept d , emp e
  where d.deptno = e.deptno (+)
   order by d.deptno;
   
-- self join
select *
  from emp e, emp m;



-- 1. Cross Join
-- 2. Inner Join
--      - equi join ( = )
--      - non equi join (>, <, between) 
-- 3. Outer Join 
--      - include inner join with option side 
--      - left/ right / full
--      - left outer join / right outer join / full outer join (outer은 생략가능)
-- 4. Self Join  



-- why and when do we need self join?

with tmp01 as (
    select 1 as no from dual union
    select 2 as no from dual union
    select 3 as no from dual union
    select 4 as no from dual
), tmp02 as (
    select 3 as no from dual union
    select 4 as no from dual union
    select 5 as no from dual union
    select 6 as no from dual
)

--select * 
--  from tmp01 cross join tmp02;

--select * 
--  from tmp01 inner join tmp02
--    on tmp01.no = tmp02.no;

--select * 
--  from tmp01 t1 left join tmp02 t2
--    on t1.no = t2.no;

--select * 
--  from tmp01 t1 right join tmp02 t2
--    on t1.no = t2.no;

select * 
  from tmp01 t1 full join tmp02 t2
    on t1.no = t2.no;
    

-- =========================================
    
select e.empno, e.ename, e.mgr, m.ename, m.empno
  from emp e, emp m
 where e.mgr = m.empno;
  
  
-- self join     
select e.empno, e.ename, e.mgr, m.ename, m.empno
  from emp e inner join emp m
    on e.mgr = m.empno;
  
select * from emp;

select e.empno, e.ename, e.mgr, m.ename, m.empno
  from emp e left outer join emp m
    on e.mgr = m.empno;
    
select e.empno, e.ename, nvl(e.mgr, 0), nvl(m.ename, '없음'), nvl(m.empno, 0)
  from emp e left outer join emp m
    on e.mgr = m.empno;
 
 
with temp as (    
select max(no) as no 
  from alpha 
 group by line, col
)
select * 
  from alpha a inner join temp t 
    on a.no = t.no;
    
    
    
-- =========한국의 도시와 도시별 인구수=======   
select cy.name, ct.name, ct.population 
  from country cy inner join city ct
    on cy.code = ct.country_code; 

select cy.name, cy.code 
  from country cy;
 
select cy.name, ct.name, ct.population, cy.code 
  from country cy inner join city ct
    on cy.code = ct.country_code;
    
select *
  from country c1 inner join city c2
    on c1.code = c2.country_code
 where c1.code = 'KOR';
  
--=====한국의 도시와 도시별 큰 인구수별로 정렬===  
select c1.name, c2.name, c2.population
  from country c1 inner join city c2
    on c1.code = c2.country_code
 where c1.code = 'KOR'
 order by c2.population desc;
 
-- ====== 나라별 
select c1.name, c2.name, c2.population
  from country c1 inner join city c2
    on c1.code = c2.country_code
 where c1.code = 'USA'
 order by c2.population desc;
 
 
 select c1.name, c2.name, c2.population
  from country c1 inner join city c2
    on c1.code = c2.country_code
 where c1.code = 'JPN'
 order by c2.population desc;
 
 