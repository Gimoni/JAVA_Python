select *
from dept
where deptno=90;

insert into dept
values
 (50, '개발부', '서울');
 
insert into dept
values
 (60, '인사부', null); 

select * from dept;

delete dept where deptno=50;
delete dept where deptno=10;

select * from dept;

update dept 
   set dname = 'xxx',
         loc = 'null'
where deptno = 10;



commit;

rollback;

select *from dept;

delete from dept where deptno = 60;

select * from emp;
select count(*) from emp;

select * from emp where empno=9000;

insert into emp
(empno, ename)
values
(9000, '홍길동');

rollback;

select * from country;
select count(*) from country;
select count(country.local_name) from country;
select country.local_name, country.population from country;

select * from city;
select count(*) from city;
select count(city.name) from city;

select id 
  from city
 order by id;
 
select *
  from city
where country_code = 'KOR'; 
