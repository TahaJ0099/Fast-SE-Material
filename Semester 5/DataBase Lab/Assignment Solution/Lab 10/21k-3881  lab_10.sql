--Task 01

create table Persons(
pID int primary key,
fname varchar(50) not null,
lname varchar(50) not null,
adrress varchar(50),
city varchar(50),
age int not null
);

insert into Persons values(1,'taha','jawaid','R-1698','khi',21);
insert into Persons values(2,'ali','haider','A-202','lhr',22);
insert into Persons values(3,'israr','naved','C-109','isb',23);
insert into Persons values(4,'bilal','jalal','B-76','khi',24);
insert into Persons values(5,'akber','ali','A=105','kp',25);
SAVEPOINT FIVERECORDS;
insert into Persons values(6,'sara','naeem','B-56','isb',26);
insert into Persons values(7,'Erum','qasim','R-1700','lhr',27);
insert into Persons values(8,'pankaj','kumar','R-1300','kp',34);
insert into Persons values(9,'zoya','anwer','A-278','hyd',29);
insert into Persons values(10,'laiba','azeem','C-110','hyd',30);

update Persons set fname='Rida' where pID=7;

select * from Persons;
 
 ROLLBACK to SAVEPOINT FIVERECORDS;
 
 
 --Task 02
 
 update Persons set age=28 where pID=8;
 commit;
 
 
 --place the following command in unshared hr\
 update Persons set age=31 where pID=8;
select * from Persons;