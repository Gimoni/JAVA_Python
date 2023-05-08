select * from emp;

select ename from emp;

select ename, job from emp;

--select from where 절  
select ename, job, gender 
	from emp
 where gender ='F';


select ename, job, gender, deptno
	from emp
 where deptno = 10;
 
 
select ename 이름, job 직급, gender 성별, deptno 부서번호
	from emp
 where deptno = 10;
 

 
 select ename	as 이름, 
 		job 	as 직급, 
 		gender	as 성별,
 		deptno	as 부서번호
	from emp
 where deptno = 10;
 
 

 select ename "이 름", 
 		job 직급, 
 		gender 성별,
 		deptno 부서번호
	from emp
 where deptno = 10;
 
 -- 가상 테이블 dual 
select 3+4 from dual;


select 3+4	as "add", 
	   3-4	as "빼기",
	   10/3 as "나누기",
	   10*3 as "곱하기"
	from dual;
--	from dept;
	
	
select * from dept;
select deptno, deptno+10 from dept;

select + from dept;
select * from country;

select count(*) from country;
