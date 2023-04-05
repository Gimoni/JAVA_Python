select table_name from user_tables;


select * from dept;
select * from emp;
select * from course;
select * from country;
select * from student;

create table alpha (
	line number(2),
	col  number(2),
	fg	 number(2),
	bg   number(2),
	ch   char(1)
);

rename alpha to alpha2;
rename alpha2 to alpha;

truncate table alpha;
drop table alpha;

select * from alpha;

insert into alpha values (2, 10, 30, 41, 'A');

rollback
commit

-- create user 유저 생성 
ALTER SESSION SET "_ORACLE_SCRIPT"=true;
create user hr identified by tiger;
grant connect, resource to hr;

desc emp;

select table_name from user_tables;
