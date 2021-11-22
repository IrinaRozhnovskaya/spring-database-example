/*
create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);
*/

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Irina', 'Odessa', sysdate());
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'Mike', 'New York', sysdate());
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Paul', 'Berlin', sysdate());
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004, 'Hanna', 'London', sysdate());