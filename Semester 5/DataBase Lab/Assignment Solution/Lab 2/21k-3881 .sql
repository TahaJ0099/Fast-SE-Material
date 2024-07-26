--Task 1
-- 1
select * from  employees WHERE SALARY > 6000 and SALARY <8000;
--2
select EMPLOYEE_ID,FIRST_NAME from EMPLOYEES where department_id between 50 and 70;
--3
select * from EMPLOYEES where JOB_ID in ('IT_PROG','SH_CLERK','PU_CLERK');
--4
SELECT * FROM EMPLOYEES WHERE COMMISSION_PCT IS NULL;

--Task 2
--1
select UPPER(first_name)  AS "uppercase_first_name", LOWER (JOB_ID) AS "lowercase_job_id" from employees;
--2
select FIRST_NAME|| ' '||LAST_NAME||' ' ||JOB_ID,LENGTH(FIRST_NAME),INSTR(FIRST_NAME,'a') FROM EMPLOYEES;
--3
SELECT EMPLOYEE_ID,HIRE_DATE FROM EMPLOYEES WHERE EXTRACT(YEAR FROM HIRE_DATE)=2003;
--4
select to_char(HIRE_DATE,'DD MONTH,YYYY') from EMPLOYEES;
--5
SELECT TO_CHAR (SALARY,'$99999') FROM EMPLOYEES WHERE FIRST_NAME='Neena';
--6
SELECT LAST_NAME FROM employees WHERE LAST_NAME LIKE '%a%';
--7
SELECT SUBSTR(FIRST_NAME,LEN(FIRST_NAME) - 3 ) AS last_three_letters FROM EMPLOYEES;

--Task 3
--1
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY,(SALARY+SALARY*0.15) AS INCREMENTED_SALARY,(SALARY+salary * .05-SALARY) AS DIFFERENCE_OF_SALARY from EMPLOYEES;
--2
SELECT FIRST_NAME,HIRE_DATE,TO_CHAR(HIRE_DATE,'D') AS DAY_OF_WEEK FROM EMPLOYEES ORDER BY DAY_OF_WEEK;
--3
SELECT DEPARTMENT_ID,MANAGER_ID,ROUND(COMMISSION_PCT,1) AS COMMISSION FROM EMPLOYEES;
--4
SELECT * FROM EMPLOYEES WHERE COMMISSION_PCT > 0 AND DEPARTMENT_ID NOT IN (90,100); 
--5
SELECT * FROM EMPLOYEES,JOBS WHERE MIN_SALARY > 8000 AND MIN_SALARY < 15000 AND commission_pct IS NULL;
--6
SELECT FIRST_NAME,lAST_NAME,JOB_ID FROM EMPLOYEES WHERE (EMPLOYEE_ID > 100 AND EMPLOYEE_ID > 150) AND (DEPARTMENT_ID > 90 AND DEPARTMENT_ID < 100);
--7
SELECT SALARY,(SALARY+(COMMISSION_PCT*SALARY))AS TOTAL_SALARY FROM EMPLOYEES WHERE COMMISSION_PCT IS NOT NULL; 