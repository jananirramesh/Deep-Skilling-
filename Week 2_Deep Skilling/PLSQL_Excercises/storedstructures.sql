DECLARE
    n NUMBER := 5;
    fact NUMBER := 1;
    i NUMBER := 1;
BEGIN
    WHILE i <= n LOOP
        fact := fact * i;
        i := i + 1;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Factorial of ' || n || ' is ' || fact);
END;
/