
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
 
 
 select * from users;
 
 
 
User user = new User();
user.setId("user123");
user.setPassword("newpassword");
user.setName("John Doe");
user.setMobile("1234567890");
user.setRole("admin");

updateUser(user);

update users
  set password='1234',
      name= 'potato',
      mobile='+98743211',
      role='USER',
  where id = 'gimon44';

     
    