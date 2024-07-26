--1
SET SERVEROUTPUT ON
DECLARE
    v_empno NUMBER(6,0);
    v_salary NUMBER(8,2);
    v_bonus NUMBER;
    employee_number number(6,0);
BEGIN
    &employee_number := v_empno;
    SELECT salary INTO v_salary
    FROM employees
    WHERE employee_id =employee_number;
    IF v_salary < 1000 THEN
        v_bonus := 0.10 * v_salary;
    ELSIF v_salary BETWEEN 1000 AND 1500 THEN
        v_bonus := 0.15 * v_salary;
    ELSE
        v_bonus := 0.20 * v_salary;
    END IF;
    DBMS_OUTPUT.PUT_LINE('Employee ' || v_empno || ' has a bonus of ' || v_bonus || ' based on a salary of ' || v_salary);

END;
/
--2
SET SERVEROUTPUT ON
DECLARE
    v_employee_id NUMBER := &employee_id; 
    v_commission NUMBER;
    v_salary NUMBER;
BEGIN
    SELECT commission_pct, salary
    INTO v_commission, v_salary
    FROM employees
    WHERE employee_id = v_employee_id;
    IF v_commission IS NULL THEN
        UPDATE employees
        SET salary = salary + v_commission
        WHERE employee_id = v_employee_id;
        DBMS_OUTPUT.PUT_LINE('Salary updated for Employee ' || v_employee_id);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Employee ' || v_employee_id || ' already has a commission.');
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee with ID ' || v_employee_id || ' not found.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/
--3

DECLARE
  v_dept_name VARCHAR(50);
BEGIN
  FOR c IN (SELECT d.DEPARTMENT_NAME
            FROM DEPARTMENTS d
            WHERE d.DEPARTMENT_ID = 30)
  LOOP
    v_dept_name := c.department_name;
    DBMS_OUTPUT.PUT_LINE('Department Name for Deptno 30: ' || v_dept_name);
  END LOOP;
END;
/
--4

DECLARE
  v_deptno NUMBER := 20;  
  v_emp_salary NUMBER;
BEGIN
  FOR c IN (SELECT e.SALARY
            FROM EMPLOYEES e
            WHERE e.DEPARTMENT_ID = v_deptno)
  LOOP
    v_emp_salary := c.salary;
    DBMS_OUTPUT.PUT_LINE('Salary of the employee in Deptno ' || v_deptno || ': ' || v_emp_salary);
  END LOOP;
END;
/
--7 ( a )
CREATE OR REPLACE VIEW EMPLOYEEDESIGNATIONCOUNT AS
SELECT JOB_ID AS DESIGNATION, COUNT(*) AS EMPLOYEECOUNT
FROM EMPLOYEES
GROUP BY JOB_ID;

--7( b )
CREATE OR REPLACE VIEW EMPLOYEEDETAILS AS
SELECT E.EMPLOYEE_ID,E.FIRST_NAME||' '||E.LASTNAME AS EMPLOYEE_NAME,
E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID=D.DEPARTMENT_ID
WHERE E.FIRST_NAME || ' ' || E.LAST_NAME !='King';

--7 ( c )
CREATE OR REPLACE VIEW EMPLOYEEDETAILS AS
SELECT E.EMPLOYEE_ID,E.FIRST_NAME||' '||E.LASTNAME AS EMPLOYEE_NAME,
E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID=D.DEPARTMENT_ID;

--8
DECLARE
  v_num1 NUMBER;
  v_num2 NUMBER;
  v_sum NUMBER;
BEGIN
  DBMS_OUTPUT.PUT('Enter the first number: ');
  v_num1 := &enter_number1;
  DBMS_OUTPUT.PUT('Enter the second number: ');
  v_num2 := &enter_number2;
  v_sum := v_num1 + v_num2;
  DBMS_OUTPUT.PUT_LINE('The sum of ' || v_num1 || ' and ' || v_num2 || ' is ' || v_sum);
END;
/
--9
DECLARE
  lower_boundary NUMBER;
  upper_boundary NUMBER;
  total_sum NUMBER := 0;
BEGIN
  lower_boundary := &lower_boundary; 
  upper_boundary := &upper_boundary; 
  FOR i IN lower_boundary..upper_boundary LOOP
    total_sum := total_sum + i;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('The sum of numbers between ' || lower_boundary || ' and ' || upper_boundary || ' (inclusive) is: ' || total_sum);
END;
/
--10
DECLARE
v_employee_id NUMBER := &employee_id;
ENAME VARCHAR(50);
HDATE DATE;
DEPT VARCHAR(50);
first_name  VARCHAR(50);
BEGIN
SELECT FIRST_NAME,HIRE_DATE,DEPARTMENT_NAME INTO ENAME,HDATE,DEPT FROM EMPLOYEES JOIN DEPARTMENTS ON EMPLOYEES.DEPARTMENT_ID=DEPARTMENTS.DEPARTMENT_ID WHERE EMPLOYEE_ID=v_employee_id;
DBMS_OUTPUT.PUT_LINE(' 1ST NAME = '||ENAME ||' , HIRE DATE = '||HDATE||' , DEPARTMENT NAME = '||DEPT);
END;
/
--11
SET SERVEROUTPUT ON;
ACCEPT emp_name PROMPT 'Enter Employee Name : '
ACCEPT emp_job PROMPT 'Enter Employee Job Title: '
ACCEPT emp_mgr PROMPT 'Enter Manager ID: '
ACCEPT emp_hire_date PROMPT 'Enter Hire Date (YYYY-MM-DD): '
ACCEPT emp_salary PROMPT 'Enter Salary: '
ACCEPT emp_dept_id PROMPT 'Enter Department ID: '
DECLARE
    v_emp_name VARCHAR2(100) := '&emp_name'; 
    v_emp_job VARCHAR2(100) := '&emp_job'; 
    v_emp_mgr NUMBER := &emp_mgr; 
    v_emp_hire_date DATE := TO_DATE('&emp_hire_date', 'YYYY-MM-DD');
    v_emp_salary NUMBER := &emp_salary; 
    v_emp_dept_id NUMBER := &emp_dept_id; 
BEGIN
    INSERT INTO employees (employee_id, first_name, last_name, job_id, manager_id, hire_date, salary, department_id)
    VALUES (employees_seq.NEXTVAL, 
            SUBSTR(v_emp_name, 1, INSTR(v_emp_name, ' ') - 1), 
            SUBSTR(v_emp_name, INSTR(v_emp_name, ' ') + 1), 
            v_emp_job, 
            v_emp_mgr, 
            v_emp_hire_date, 
            v_emp_salary, 
            v_emp_dept_id);
            COMMIT; 
END;
/
--12
set serveroutput on;
DECLARE
    emp_salary EMPLOYEES.SALARY%type:=0;
    emp_first_name EMPLOYEES.FIRST_NAME%type;
    emp_last_name EMPLOYEES.LAST_NAME%type;
    emp_employee_id EMPLOYEES.EMPLOYEE_ID%type := 7499;
    emp_manager_id EMPLOYEES.MANAGER_ID%type := 7499;
BEGIN
    SELECT MANAGER_ID INTO emp_manager_id FROM EMPLOYEES WHERE EMPLOYEE_ID = emp_employee_id;
    WHILE(emp_salary <= 2500)
    LOOP
        SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY INTO emp_employee_id, emp_first_name, emp_last_name, emp_salary
        FROM EMPLOYEES WHERE EMPLOYEE_ID = emp_employee_id;
    END LOOP;
    dbms_output.put_line('The Employe who is higher in chain of command: ' || emp_first_name || ' ' || emp_last_name || ' with salary: ' || emp_salary);
EXCEPTION
    WHEN NO_DATA_FOUND
    THEN
        dbms_output.put_line('Record with employee id: ' || emp_employee_id || ' does not exists.');
END;
/
--13
DECLARE
   total NUMBER := 0;  
   counter NUMBER := 1;   

BEGIN
   WHILE counter <= 100 LOOP
      total := total + counter;  
      counter := counter + 1;           
   END LOOP;
   DBMS_OUTPUT.PUT_LINE('The sum of the first 100 numbers is: ' || total);
END;
/
