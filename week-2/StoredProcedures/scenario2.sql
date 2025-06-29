--Table Structure
CREATE TABLE employees (
    emp_id        NUMBER PRIMARY KEY,
    name          VARCHAR2(100),
    department_id NUMBER,
    salary        NUMBER(10, 2)
);

-- Sample Data
INSERT INTO employees VALUES (1, 'Asha', 10, 30000);
INSERT INTO employees VALUES (2, 'Raj', 20, 40000);
INSERT INTO employees VALUES (3, 'Kiran', 10, 35000);
COMMIT;

-- Stored Procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_id IN NUMBER,
  bonus_pct IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_pct / 100)
  WHERE department_id = dept_id;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to Department ID: ' || dept_id);
  COMMIT;
END;

SET SERVEROUTPUT ON;
EXEC UpdateEmployeeBonus(10, 5);  -- 5% bonus to department 10

