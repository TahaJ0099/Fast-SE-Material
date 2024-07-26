--1
select e.FIRST_NAME,e.LAST_NAME,d.department_name,l.city,l.state_province from EMPLOYEES e join  DEPARTMENTS d on e.DEPARTMENT_ID=d.DEPARTMENT_ID JOIN LOCATIONS l on d.LOCATION_ID=l.LOCATION_ID; 
--2
select DEPARTMENT_NAME from DEPARTMENTS  join  EMPLOYEES on departments.DEPARTMENT_ID=EMPLOYEES.DEPARTMENT_ID group by DEPARTMENTS.DEPARTMENT_NAME HAVING count(EMPLOYEES.EMPLOYEE_ID) >= 2;
--3
select employees.employee_id,employees.salary,departments.dapartment_id from employees join departments on employees.department_id=DEPARTMENTS.DEPARTMENT_ID where employees.salary < (select avg(salary) from employees where department_id = departments.DEPARTMENT_ID);
--4
select e.first_name,j.Job_title,12*salary as Annual_salary,d.department_id,d.department_name,city from employees e ,DEPARTMENTS d ,JOBS j ,LOCATIONS l
where e.JOB_ID=j.JOB_ID and e.DEPARTMENT_ID=d.DEPARTMENT_ID and d.Location_id = l.LOCATION_ID and (12*salary)=60000;
--5
select e1.first_name,e1.Last_name from employees e1 join employees e2 on e1.EMPLOYEE_ID=e2.MANAGER_ID;
--6
select * from EMPLOYEES where DEPARTMENT_ID in (select department_id from DEPARTMENTS where DEPARTMENT_ID in(10,20,30) group by Department_id) or salary > 70000;
--7
select First_name,salary,department_name from employees e LEFT outer join DEPARTMENTS d on e.DEPARTMENT_ID=d.DEPARTMENT_ID;
--8
select d.DEPARTMENT_NAME ,ROUND(AVG(e.SALARY),1) , count(e.EMPLOYEE_ID) as No_of_Employees from DEPARTMENTS d , Employees e where e.DEPARTMENT_ID=d.DEPARTMENT_ID and e.COMMISSION_PCT is not null group by d.DEPARTMENT_NAME ;
--9
select FIRST_NAME,LAST_NAME,department_name,City,State_province from employees e , DEPARTMENTS d , LOCATIONS l  where e.DEPARTMENT_ID=D.DEPARTMENT_ID
 and D.LOCATION_ID=L.LOCATION_ID and e.FIRST_NAME like '%z%';
--10
select j.Job_id from jobs j  join JOB_HISTORY h on j.JOB_ID=h.JOB_ID ; 