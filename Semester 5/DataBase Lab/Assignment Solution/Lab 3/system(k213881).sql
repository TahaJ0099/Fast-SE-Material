--2
create table job(
job_id int not null primary key,
job_title varchar(50),
min_salary numeric(6,0),
max_salary numeric (8,0)
);
create table jobs_history(
employee_id  VARCHAR(60),
start_date date,
end_date date,
job_id VARCHAR (50) not null,
department_id VARCHAR (80)
);
--3
ALTER table job modify job_id numeric(6,0);
ALTER table jobs_history modify job_id numeric(6,0);
--4
alter table jobs_history add foreign key (job_id) REFERENCES job (job_id);
--5
insert into job values (3881,'Taha_Jawaid',2500,500);
--6
alter table job add (job_nature varchar (50));
--7
create table employee(
emp_id VARCHAR(50) primary key,
f_name varchar(50),
l_name varchar (50),
email varchar (50),
phn_number varchar (50),
job_id VARCHAR (50),
salary int,
comission varchar (50),
manager_id VARCHAR (50),
department_id varchar (50)
);
--8
alter table jobs_history add foreign key (employee_id) REFERENCES employee(emp_id);
--9
alter table job drop column job_nature;
--10
alter table employee add check (f_name = upper(f_name));
--11
alter table employee add unique (salary);
--12
alter table employee modify phn_number not null;
--13
insert into employee values ('123','TAHA','jawaid','taha@gmail.com','09876543','21k-3881',2100,'2300','123k','4546t');
--14
alter table jobs_history drop column employee_id;
ALTER TABLE employee DROP COLUMN emp_id;
alter table employee add emp_id NUMBER(8,2);
alter table employee add CONSTRAINT pk primary key(emp_id,job_id);
--15
create index index_job_id on jobs_history (job_id);
--16
TRUNCATE table employee; 