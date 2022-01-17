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

insert into user
values
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

# if you want to learn ManyToMany relation, you must excute the following sql
# Blog <-- manytomany --> Tag
# 1 <---> 1
#     x
# 2 <   > 2

create table blog (
                      id int primary key,
                      title varchar(255) not null
);

create table tag (
                     id int primary key,
                     name varchar(255) not null
);

create table blog_tag (
                          blog_id int not null,
                          tag_id int not null,
                          foreign key (blog_id) references blog(id),
                          foreign key (tag_id) references  tag(id)
);

insert into blog
values
    (1, 'Harry Porter'),
    (2, 'C Programming');

insert into tag
values
    (1, 'Tag1'),
    (2, 'Tag2');

insert into blog_tag
values
    (1, 1),
    (1, 2),
    (2, 1);