
CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,
    name          VARCHAR2(100),
    age           NUMBER,
    balance       NUMBER(10, 2),
    interest_rate NUMBER(5, 2),
    isvip         VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE loans (
    loan_id       NUMBER PRIMARY KEY,
    customer_id   NUMBER REFERENCES customers(customer_id),
    due_date      DATE
);

-- Sample data for customers
INSERT INTO customers VALUES (1, 'Arun Kumar', 65, 15000, 9.5, 'FALSE');
INSERT INTO customers VALUES (2, 'Priya Sharma', 45, 8000, 10.0, 'FALSE');
INSERT INTO customers VALUES (3, 'John David', 70, 20000, 11.0, 'FALSE');
INSERT INTO customers VALUES (4, 'Meena Iyer', 30, 9500, 9.0, 'FALSE');
INSERT INTO customers VALUES (5, 'Ravi Raj', 61, 5000, 10.5, 'FALSE');

-- Sample data for loans
INSERT INTO loans VALUES (101, 1, SYSDATE + 10);
INSERT INTO loans VALUES (102, 2, SYSDATE + 40);
INSERT INTO loans VALUES (103, 3, SYSDATE + 25);
INSERT INTO loans VALUES (104, 4, SYSDATE + 5);
INSERT INTO loans VALUES (105, 5, SYSDATE + 60);

COMMIT;

