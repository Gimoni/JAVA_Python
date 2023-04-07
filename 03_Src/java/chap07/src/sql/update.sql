-- update

update dept
   set loc = '부산';
 
update dept
   set loc = '부산', 
       dname = 'xxx';

update dept
   set loc = '부산', 
       dname = 'xxx'
 where deptno = 50; 
 
update dept
   set loc = '부산', 
       dname = 'xxx'
 where deptno >= 50; 

-- 무결성 제약 조건 위배 // primary key 
-- can not change deptno 
update dept
   set deptno = 10,
       loc = '부산', 
       dname = 'xxx'
 where deptno >= 50; 
 
 
select * from dept;
select * from emp;


-- truncate는 rollback으로도 정보가 가져와지지 않음... 
-- 다시 sql 파일을 다운로드 해야함.. go to cmd 
truncate table emp;

-- 무결성 제약 조건 위배 // primary key 
-- can not delete dept // 다른 정보들을 포함 하고 있기 때문
delete dept;

truncate table emp;
delete dept
 where deptno >= 50;
 
delete emp
-- where empno = 1001;
 where hiredate < '2005/01/01'; 
 
delete emp;

-- 되돌리기
rollback;

-- 저장 
commit;