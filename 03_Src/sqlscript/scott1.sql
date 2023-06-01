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

select * from dept;
select * from dept where deptno=10;

select * from salgrade;

select * from salgrade ORDER BY salgrade.grade;
select count(*) from salgrade;

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
 
 select city.population from city;


select distinct continent from country;

select count(*) from country;

select code
  from country;
  
select code, lower(code)
  from country;
  
select code, lower(code), upper(code)
  from country;
  
select * 
  from country
 where code = 'kor';
 
select * 
  from country
 where lower(code) = 'kor';
 
select * 
  from country 
 where upper(code) = upper('kor');
 
select * 
  from country
 where code = upper('kor');

select * from country;

select *  from country_language;

select count(*) from country_language;