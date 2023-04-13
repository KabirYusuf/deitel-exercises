package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    @Test
    void testThatNewBalanceCanBeCalculated(){
        //Given
        //1. Balance at the beginning of the month
        //2. Charges
        //3. Credit applied to a customer
        int balanceAtBegOfMonth = 2000;
        int charges = 40;
        int creditApplied = 200;
        // when new balance is calculated
        int newBalance = CreditLimitCalculator.calculateNewBalance(balanceAtBegOfMonth, charges, creditApplied);
        //assert that newBalance = 1840
        assertEquals(1840, newBalance);
    }

    @Test
    void testThatTrueIsReturnedIfCustomerCreditLimitHasBeenExceeded(){
        //Given
        //1. Balance at the beginning of the month
        //2. Charges
        //3. Credit applied to a customer
        //4. Allowed credit limit
        int balanceAtBegOfMonth = 2000;
        int charges = 40;
        int creditApplied = 200;
        int allowedCreditLimit = 1000;
        int newBalance = CreditLimitCalculator.calculateNewBalance(balanceAtBegOfMonth, charges, creditApplied);
        // when we check to know if credit limit has been exceeded
        boolean isCreditLimitExceeded = CreditLimitCalculator.isCreditLimitExceeded(newBalance, allowedCreditLimit);
        //assert that new balance exceeds allowed credit limit;
        assertTrue(isCreditLimitExceeded);
    }
    @Test
    void testThatFalseIsReturnedIfCustomerCreditLimitHasBeenExceeded(){
        //Given
        //1. Balance at the beginning of the month
        //2. Charges
        //3. Credit applied to a customer
        //4. Allowed credit limit
        int balanceAtBegOfMonth = 2000;
        int charges = 40;
        int creditApplied = 200;
        int allowedCreditLimit = 5000;
        int newBalance = CreditLimitCalculator.calculateNewBalance(balanceAtBegOfMonth, charges, creditApplied);
        // when we check to know if credit limit has been exceeded
        boolean isCreditLimitExceeded = CreditLimitCalculator.isCreditLimitExceeded(newBalance, allowedCreditLimit);
        //assert that new balance does not exceed allowed credit limit;
        assertFalse(isCreditLimitExceeded);
    }
}