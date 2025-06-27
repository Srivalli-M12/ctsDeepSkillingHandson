CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR rec IN (
    SELECT AccountID, Balance
    FROM Accounts
    WHERE LOWER(AccountType) = 'savings'
  ) LOOP
    UPDATE Accounts
    SET Balance = rec.Balance + (rec.Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountID = rec.AccountID;
  END LOOP;
  COMMIT;
END;
/