
select hiredate, round(hiredate, 'mm') 
  from emp; 
  -- round : single row change ;; 
  
select count(*),
	   min(hiredate), 
	   max(hiredate), 
	   sum(sal),
	   round(avg(sal), 2),
	   round(stddev(sal), 2),
	   round(variance(sal), 2)
  from emp;
  
  
  
select * 
  from emp
 where deptno=10
 order by sal desc;
 
 -- 그룹함수는 null을 제외 하고 동작 하기 때문에 
 -- 전체 개수 확인을 따로 해야함. count(*) 사용  
select  count(*), count(comm), sum(comm)
  from emp
 where comm is not null;
 

select * from emp;
select * from dept;


select deptno, count(*)
  from emp
 group by deptno
 order by deptno asc;
 
 
select fg, count(*)
  from alpha
 group by fg;

 
select ch, count(*)
  from alpha
 group by ch
 order by ch;
 

select line, count(*)
  from alpha
 group by line
 order by count(*) desc;
 
-- line, col으로 grouping = 800 
select line, col, count(*)
  from alpha
 group by line, col
 order by line, col desc;
 
-- having 절 
select line, col, count(*)
  from alpha
 group by line, col
 having line < 3 and col < 3
 order by line, col desc;
 
 
 
select line, col, count(*)
  from alpha
 where ch = 'A'
 group by line, col
 having line < 3 and col < 3
 order by line, col desc;
 
 
 
select line, col, count(*), min(no), max(no) 
  from alpha
 group by line, col
 order by line, col desc;

 
with tmp as (
select max(no) as no  
  from alpha
 group by line, col
 order by line, col
)

select * 
  from alpha
 where no in (select no from tmp)
 order by line asc, col asc, bg asc;



with tmp as (
select max(no) as no  
  from alpha
 group by line, col
 order by line, col
)

select * 
  from alpha
 where no in (select no from tmp)
order by line asc, col asc, fg asc,
		decode(fg, 'Black', 30,
              'Red', 31,
              'Green', 32,
              'Yellow', 33,
              'Blue', 34,
              'Magenta', 35,
              'Cyan', 36,
              'White', 37, 99) asc;



select * from dept;

insert into dept
 (deptno, dname, loc)
 values
 (50, '개발부', '광주');
 
 
insert into dept
 values
 (50, '개발부', '광주');
 
 -- table primary key 테이블 제약조건이 있기 때문에 
 -- 중복된 값을 넣을 수 없다. /// 제약조건에 위배되는 것을 제한한다. 
 -- 오류 . 무결성 제약조건에 위배 됨.  
insert into dept
 (dname, loc, deptno)
 values
 ('개발부', '광주', 60); 

rollback;
commit;




