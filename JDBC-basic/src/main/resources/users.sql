create table USERS (id identity primary key, name varchar (255) not null);
truncate table USERS;
insert into USERS (name) values ('Test 1');
insert into USERS (name) values ('Test 2');
