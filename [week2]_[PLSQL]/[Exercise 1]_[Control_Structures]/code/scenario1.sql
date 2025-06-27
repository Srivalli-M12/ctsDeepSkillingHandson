SET SERVEROUTPUT ON;

BEGIN
  FOR rec IN (
    SELECT l.LoanID, l.CustomerID, c.DOB, l.InterestRate
    FROM Loans l, Customers c
    WHERE l.CustomerID = c.CustomerID
  ) LOOP
    IF MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12 > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE LoanID = rec.LoanID;
    END IF;
  END LOOP;
  COMMIT;
END;
/
