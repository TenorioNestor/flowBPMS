create table project(

id bigint not null auto_increment,
name varchar(100) not null,
document varchar(100) not null unique,
socialname varchar(100) not null,
phone varchar(100),
cellphone varchar(15),
email varchar(100),
primary key(id)
);