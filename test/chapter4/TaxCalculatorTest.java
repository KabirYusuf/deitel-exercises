package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    @Test
    void testThatFifteenPercentTaxIsCalculatedForCitizensEarningThirtyThousandBelow(){
        //Given that we have a citizen who earns 25000
        int earning = 25000;
        //when tax is calculated
        double tax = TaxCalculator.calculateTax(earning);
        //assert tax = 3750
        assertEquals(3750, tax);
    }
    @Test
    void testThatTwentyPercentTaxIsCalculatedForCitizensEarningThirtyThousandAbove(){
        //Given that we have a citizen who earns 25000
        int earning = 35000;
        //when tax is calculated
        double tax = TaxCalculator.calculateTax(earning);
        //assert tax =
        assertEquals(7000, tax);
    }

}