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

insert into board (id, title, content, day, reply, writer, replyId)
    		values (5, '안녕게시판', 
    								  '안녕게시판', DATE, 
    			   					   'what's up', '바보');
                                       
commit;

select * from users where mobile = '+821012345678';

select count(*) from users;

select * from users;

insert INTO users 
VALUES ('gimon31','1234567','gimon','+8254326789','USER');


CREATE TABLE board (
  id NUMBER NOT NULL,
  title VARCHAR2(100) NOT NULL,
  content VARCHAR2(4000),
  day DATE,
  reply INTEGER,
  writer VARCHAR2(100),
  CONSTRAINT board_pk PRIMARY KEY (id)
);

select * from board;

drop table board;

INSERT INTO board (id, title, content, day, reply, writer)
VALUES (1, 'Sample Title 1', 'Sample Content 1', TO_DATE('2023-06-18', 'YYYY-MM-DD'), 5, 'John Doe');

INSERT INTO board (id, title, content, day, reply, writer)
VALUES (2, 'Sample Title 2', 'Sample Content 2', TO_DATE('2023-06-19', 'YYYY-MM-DD'), 3, 'Jane Smith');


SELECT p.*, COUNT(r.reply) AS reply
FROM board p
LEFT JOIN board r ON p.id = r.id
GROUP BY p.id, p.title, p.content, p.day, p.reply, p.writer
ORDER BY p.id DESC;

INSERT INTO board (id, title, content)
VALUES ('4', 'hi', 'hi');

INSERT INTO board (id, title, content)
VALUES ('5', 'hi', 'e');

        update board
        set title = 'hi',
            content = 'Hello'
        where id = '1';


select * from board order by id desc;


commit;


CREATE SEQUENCE board_seq START WITH 1 INCREMENT BY 1;

select * from board;
select * from boardreply;


            
CREATE TABLE boardreply (
  id NUMBER NOT NULL,
  content VARCHAR2(100),4
  day DATE,
  writer VARCHAR2(20),
  replyId Number, 
  CONSTRAINT boardreply_pk PRIMARY KEY (id)
);

SELECT p.*, COUNT(r.reply) AS reply
FROM boardreply p
LEFT JOIN board r ON p.id = r.id
GROUP BY p.id, p.content, p.day, p.writer
ORDER BY p.id DESC;


select * from boardreply where boardreply.id = 1;

INSERT INTO boardreply (id, content, day, writer)
VALUES (1, 'Sample content 1', TO_DATE('2023-06-19', 'YYYY-MM-DD'), 'Writer 1');

INSERT INTO boardreply (id, content, day, writer)
VALUES (2, 'Sample content 2', TO_DATE('2023-06-20', 'YYYY-MM-DD'), 'Writer 2');

INSERT INTO boardreply (id, content, day, writer)
VALUES (3, 'Sample content 3', TO_DATE('2023-06-21', 'YYYY-MM-DD'), 'Writer 3');

INSERT INTO boardreply (id, content, day, writer)
VALUES (4, 'Sample content 4', TO_DATE('2023-06-22', 'YYYY-MM-DD'), 'Writer 4');

select * from boardreply where id = 2;
select count(*) from boardreply where id = 3;

delete from boardreply where id = 4;


alter user scott identified by tiger;

drop table boardreply;

commit;

select * from boardreply where id = 4 order by day asc;

select count(*) from boardreply where id = 1;

update boardreply set content ='hello world' where id = '1';
