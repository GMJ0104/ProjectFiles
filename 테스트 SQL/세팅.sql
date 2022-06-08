create database ship;
use ship;

create table shipInfo (
	ship_name varchar(30) primary key,
	email varchar(30),
    phone varchar(30),
    user_name varchar(30),
    user_pwd varchar(30)
);

create table cart(
	ship_name varchar(30),
    item_name varchar(30),
    amount integer
);
insert into cart values ("Calliope","apple",3);

drop table cart;

create table orderList(
	ship_name varchar(30) primary key,
    item_name varchar(30),
    amount integer,
    order_date date
);

create table firstItem(
	item_name varchar(30) primary key,
    img_link varchar(255)
);

insert into shipInfo values ("Calliope","calli@gmail.com","010-1234-5678","김선장","1234");
insert into shipInfo values ("G/Forever","forever@gmail.com","010-1111-2222","이선장","1234");
insert into shipInfo values ("SiwonMarine","SiwonMarine@gmail.com","010-1234-1234","관리자","admin");
delete from shipInfo where ship_name="SiwonMarine";

delete from firstItem where item_name = "test123";

select * from firstItem;
select * from shipInfo;
select * from cart;
