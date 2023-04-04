desc dept
desc emp
 -- ctrl + enter ( 현재 커서의 SQL문을 실행 )
select * from dept;
select * from emp;
select * from country;

select * from country where code='KOR';
select * from country where code='USA';
select * from country where code='JPN';



select * from dept;

-- scott user create
alter session set "_ORACLE_SCRIPT"=true;
-- create user
create user hr IDENTIFIED by tiger;
-- grant : 사용자에게 특정 권한을 부여 
GRANT connect, resource to hr;
-- user 권한 박탈. 
revoke connect from hr; 


-- deleted user 
drop user hr cascade;

-- cmd login check
-- D:\02_Software\05_oracle\sql>sqlplus hr/tiger

