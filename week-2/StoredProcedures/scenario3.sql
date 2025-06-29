-- Table Structure
CREATE TABLE accounts (
    account_id   NUMBER PRIMARY KEY,
    customer_id  NUMBER,
    balance      NUMBER(10, 2)
);

-- Sample Data
INSERT INTO accounts VALUES (201, 1, 5000);
INSERT INTO accounts VALUES (202, 1, 3000);
COMMIT;

-- Stored Procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
  from_acc IN NUMBER,
  to_acc IN NUMBER,
  amount IN NUMBER
) IS
  from_balance NUMBER;
BEGIN
  -- Get balance of source account
  SELECT balance INTO from_balance FROM accounts WHERE account_id = from_acc FOR UPDATE;

  IF from_balance < amount THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
  ELSE
    -- Deduct from source
    UPDATE accounts SET balance = balance - amount WHERE account_id = from_acc;

    -- Add to destination
    UPDATE accounts SET balance = balance + amount WHERE account_id = to_acc;

    DBMS_OUTPUT.PUT_LINE('Transferred ₹' || amount || ' from Account ' || from_acc || ' to Account ' || to_acc);
    COMMIT;
  END IF;
END;

