create table project(

id bigint not null auto_increment,
name varchar(100) not null,
document varchar(100) not null unique,
cep varchar(9) not null,
primary key(id)
);