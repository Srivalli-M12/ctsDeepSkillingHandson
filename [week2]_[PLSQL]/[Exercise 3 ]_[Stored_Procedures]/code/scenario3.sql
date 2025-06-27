CREATE OR REPLACE PROCEDURE TransferFunds(
  p_source_id IN Accounts.AccountID%TYPE,
  p_target_id IN Accounts.AccountID%TYPE,
  p_amount    IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts
  WHERE AccountID = p_source_id FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance');
  END IF;

  UPDATE Accounts
  SET Balance = Balance - p_amount, LastModified = SYSDATE
  WHERE AccountID = p_source_id;

  UPDATE Accounts
  SET Balance = Balance + p_amount, LastModified = SYSDATE
  WHERE AccountID = p_target_id;

  COMMIT;
END;
/