-- Table Structure
CREATE TABLE savings_accounts (
    account_id   NUMBER PRIMARY KEY,
    customer_id  NUMBER,
    balance      NUMBER(10, 2)
);
--  Sample Data
INSERT INTO savings_accounts VALUES (101, 1, 10000);
INSERT INTO savings_accounts VALUES (102, 2, 15000);
INSERT INTO savings_accounts VALUES (103, 3, 8000);
COMMIT;

-- Stored Procedures
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR acc IN (SELECT account_id, balance FROM savings_accounts) LOOP
    UPDATE savings_accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_id = acc.account_id;

    DBMS_OUTPUT.PUT_LINE('Interest applied to Account ID: ' || acc.account_id);
  END LOOP;
  COMMIT;
END;

SET SERVEROUTPUT ON;
EXEC ProcessMonthlyInterest;

