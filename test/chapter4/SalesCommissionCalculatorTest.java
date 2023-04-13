package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {

    @Test
    void testToCalculateCommission(){
        //Given that we have value of total item sold by a salesperson and percentage
        double percentage = 0.09;
        double totalValueOfItemSold = 5000;
        // if 9% of the total value sold is calculated
        double commission = SalesCommissionCalculator.calculateCommission(percentage,totalValueOfItemSold);
        // assert that commission = 450
        assertEquals(450, commission);
    }

}