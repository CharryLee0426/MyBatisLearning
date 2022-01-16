# @author Charry Lee
# @date 2022-01-14
# @describe This is the SQL script to create table you need and
#           insert some test records.

create database if not exists MyBatis;

use MyBatis;

create table user (
    id int primary key,
    name varchar(255) not null,
    salary long not null
    );

insert into user values
(1, 'Tommy', 15000),
(2, 'Jack', 21000);

# if you want to learn how to join table, you must excute the following sql

alter table user add dep_id int not null;

create table department (
    id int primary key,
    name varchar(255) not null
);

insert into department
values
    (1, 'Developer Dep.'),
    (2, 'Finance Dep.');