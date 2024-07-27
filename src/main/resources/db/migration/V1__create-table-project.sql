create table project(
id bigint not null auto_increment,
name varchar(100) not null,
document varchar(100) not null unique,
socialname varchar(100) not null,
phone varchar(100),
cellphone varchar(15),
email varchar(100),
street varchar(100),
number varchar(10),
district varchar(100),
state varchar(100),
city varchar(100),
cep varchar(30),
primary key(id)
);
create table equipment(
id bigint not null auto_increment,
local varchar(100) not null,
model varchar(100) not null ,
password varchar(100) not null,
primary key(id)
)
;
