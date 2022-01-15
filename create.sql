# @author Charry Lee
# @date 2022-01-14
# @describe This is the SQL script to create table you need and
#           insert some test records.

create database MyBatis if not exists;

use MyBatis;

create table user (
    id int primary key,
    name varchar(255) not null,
    salary long not null
    );

insert into user values
(1, 'Tommy', 15000),
(2, 'Jack', 21000);