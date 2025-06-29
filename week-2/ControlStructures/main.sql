-- Table to store customer details
CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,
    name          VARCHAR2(100),
    age           NUMBER,
    balance       NUMBER(10, 2),
    interest_rate NUMBER(5, 2),
    isvip         VARCHAR2(5) DEFAULT 'FALSE'
);

-- Table to store loan details
CREATE TABLE loans (
    loan_id       NUMBER PRIMARY KEY,
    customer_id   NUMBER REFERENCES customers(customer_id),
    due_date      DATE
);

----------------------------------------------------------------------------------------------

--Scenario 1: Apply 1% Interest Discount for Customers Above 60
BEGIN
  FOR cust_rec IN (
    SELECT customer_id, interest_rate 
    FROM customers 
    WHERE age > 60
  ) LOOP
    UPDATE customers
    SET interest_rate = interest_rate - 1
    WHERE customer_id = cust_rec.customer_id;

    DBMS_OUTPUT.PUT_LINE('Interest updated for customer ID: ' || cust_rec.customer_id);
  END LOOP;
  COMMIT;
END;

-- Scenario 2: Promote Customers to VIP Based on Balance
BEGIN
  FOR cust_rec IN (
    SELECT customer_id 
    FROM customers 
    WHERE balance > 10000
  ) LOOP
    UPDATE customers
    SET isvip = 'TRUE'
    WHERE customer_id = cust_rec.customer_id;

    DBMS_OUTPUT.PUT_LINE('Promoted to VIP: Customer ID ' || cust_rec.customer_id);
  END LOOP;
  COMMIT;
END;

-- Scenario 3: Send Reminders for Loans Due Within 30 Days
BEGIN
  FOR loan_rec IN (
    SELECT loan_id, customer_id, due_date
    FROM loans
    WHERE due_date <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ID ' || loan_rec.loan_id || 
      ' for Customer ID ' || loan_rec.customer_id || 
      ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY')
    );
  END LOOP;
END;
