DROP TABLE USERS;

CREATE TABLE USERS ( 
     ID         varchar2(20) CONSTRAINT USERS_ID_PK PRIMARY KEY,
     PASSWORD   VARCHAR2(100 char) NOT NULL,
     NAME       VARCHAR2(20) NOT NULL, 
     MOBILE     VARCHAR2(15) NOT NULL, 
     ROLE       VARCHAR2(20  char)
);

select * from users;

insert into users values ('python', '$2a$10$ayg93l/BuyOQ0b/1huGiJuBXm71M9fELCMt4OZ0da1bEX2mweIbcm','python','+821012345678', 'USER');
insert into users values ('java',   '$2a$10$nOMTH4OzkBYs1u1L2B5K5.SNO257rvxJH7cAd4Rykebfv5NRwfSi.','java','+821012345679', 'ADMIN');

commit;

select * from users where mobile = '+821012345678';

select count(*) from users;

select * from users;

insert INTO users 
VALUES ('gimon31','1234567','gimon','+8254326789','USER');