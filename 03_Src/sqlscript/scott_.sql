
drop sequence xxx_seq;

create sequence xxx_seq;

select xxx_seq.nextval from dual;

select xxx_seq.currval from dual;

create sequence xxx_seq start with 4078;


insert into city
(id, name)
values
(xxx_seq.nextval, 'xxx');

select *
  from city
 where id > 4079;
 

 rollback;

select *
  from city;
 
 select *
   from city
  where country_code = 'KOR';
 
 
 