--Cursor and porcedure

CREATE TABLE Person (
ID int NOT NULL,
Name varchar (50) NOT NULL,
PreviousName varchar (50) NULL,
SameNameCount int NULL,
CONSTRAINT pk_Person PRIMARY KEY (ID));

--Task 1 

DECLARE
  CURSOR cursor_manager IS
      SELECT first_name,
             last_name,
             department_name
      FROM employees e
      INNER JOIN departments d ON d.manager_id = e.employee_id;
 
  managr cursor_manager%ROWTYPE;
BEGIN
  OPEN cursor_manager;
  LOOP
   
    FETCH cursor_manager INTO managr;
    EXIT WHEN cursor_manager%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE(managr.department_name || ' :: ' ||
                         managr.first_name || ' ' ||
                         managr.last_name);
  END LOOP;
  CLOSE cursor_manager;
  END;


--Task 2

DECLARE
  CURSOR cursor_emp IS
      SELECT *
      FROM employees e
      where e.SALARY >5000;
 
  emp cursor_emp%ROWTYPE;
BEGIN
  OPEN cursor_emp;
  LOOP
   
    FETCH cursor_emp INTO emp;
    EXIT WHEN cursor_emp%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('EMPLOYEE_ID: ' || emp.EMPLOYEE_ID || ' FIRST_NAME: ' || emp.FIRST_NAME || ' LAST_NAME: ' || emp.LAST_NAME || ' email: ' || emp.email);
    DBMS_OUTPUT.PUT_LINE('PHONE_NUMBER: ' || emp.PHONE_NUMBER || ' HIRE_DATE: ' || emp.HIRE_DATE  ||  ' JOB_ID: ' || emp.JOB_ID || ' salary: ' || emp.salary);
    DBMS_OUTPUT.PUT_LINE('COMMISSION_PCT: ' || emp.COMMISSION_PCT || ' MANAGER_ID: ' || emp.MANAGER_ID || ' DEPARTMENT_ID: ' || emp.DEPARTMENT_ID);
                   
  END LOOP;
  CLOSE cursor_emp;
  END;


--Task 3

DECLARE
    e_empno NUMBER := &empno;
    e_new_salary NUMBER(8, 2);
BEGIN
    SELECT salary * 1.10 INTO e_new_salary
    FROM employees
    WHERE employee_id = e_empno;

    UPDATE employees
    SET salary = e_new_salary
    WHERE employee_id = e_empno;

    DBMS_OUTPUT.PUT_LINE('Salary Updated for Employee ID ' || e_empno);
END;


--Task 4

CREATE OR REPLACE PROCEDURE increase_salary(deptno_in IN NUMBER) AS
BEGIN
  UPDATE employees
  SET salary = salary + 1000
  WHERE salary > 5000 AND department_id = deptno_in;
END;