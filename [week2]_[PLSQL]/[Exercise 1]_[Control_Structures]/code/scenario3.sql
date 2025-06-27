DECLARE
  v_name VARCHAR2(100);
BEGIN
  FOR rec IN (
    SELECT LoanID, CustomerID, EndDate
    FROM Loans
    WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    SELECT Name INTO v_name FROM Customers WHERE CustomerID = rec.CustomerID;
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || v_name || ', your loan #' || rec.LoanID || ' is due on ' || TO_CHAR(rec.EndDate, 'YYYY-MM-DD'));
  END LOOP;
END;
/