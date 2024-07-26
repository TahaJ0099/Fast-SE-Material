--1
select department_id,COUNT(*),AVG(salary) from EMPLOYEES GROUP BY DEPARTMENT_ID;
--2
select job_id ,COUNT(*) from employees GROUP BY job_id;
--3
select first_name,last_name from EMPLOYEES where SALARY > (select salary FROM employees WHERE employee_id = 163);
--4
select department_id  FROM EMPLOYEES GROUP by department_id HAVING MAX(SALARY) >= 15000;
--5
select first_name,last_name,department_id from EMPLOYEES WHERE salary = (select min(salary) from employees); 
--6
select employee_id,first_name,last_name,job_id from EMPLOYEES where SALARY < (select min(salary)from employees where job_id ='IT_PROG');                                  
--7
SELECT* FROM EMPLOYEES WHERE DEPARTMENT_ID NOT IN(SELECT DEPARTMENT_ID,MANAGER_ID FROM DEPARTMENTS WHERE MANAGER_ID BETWEEN 100 AND 200);
--8
select manager_id , min(salary) from employees where salary in(select min(salary) from employees GROUP by manager_id having (min(salary != 2000)) and manger_id is not null ) group by manger_id order by min(salary);
--9
CREATE table employee_bkp as (select * from employees);
--10
UPDATE employee_bkp set salary = salary*1.20 where salary >= 6000;
--11
DELETE from EMPLOYEE_BKP WHERE EMPLOYEE_ID in(SELECT employee_id from EMPLOYEES where department_id ='Finance' and job_id = 'Manager');
--12
select department_id,count(employee_id) from EMPLOYEES where salary > 20000 GROUP by DEPARTMENT_ID HAVING COUNT(EMPLOYEE_ID) > 5;