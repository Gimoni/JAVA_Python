
desc emp;

-- DDL (Data Definition Language)
-- creat    생성
-- alter    수정    
-- drop     삭제

create table ex01 (
    no number(3)not null, 
    no2 number(5)
);

select table_name from user_tables;

select * from ex01;

--DML (Data Manipulation Language)
-- insert
-- update
-- delete

insert into ex01 values (10, 20); 
insert into ex01 values (null, 20); 
insert into ex01 values (20, null);
insert into ex01 values (999, null); 

desc dept;
select * from dept;