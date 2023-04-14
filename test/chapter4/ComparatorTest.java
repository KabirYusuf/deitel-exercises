package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    @Test
    void testThatOneIsReturnedIfFirstNumberIsGreaterThanSecondNumber(){
        //Given that I have two numbers
        int firstNumber = 4;
        int secondNumber = 2;
        //if both numbers are compared
        int result = Comparator.compare(firstNumber, secondNumber);
        //Assert that 1 is returned if firstNumber is Greater than secondNumber
        assertEquals(1, result);
    }
    @Test
    void testThatZeroIsReturnedIfFirstNumberIsEqualToSecondNumber(){
        //Given that I have two numbers
        int firstNumber = 4;
        int secondNumber = 4;
        //if both numbers are compared
        int result = Comparator.compare(firstNumber, secondNumber);
        //Assert that 0 is returned if firstNumber is equal to secondNumber
        assertEquals(0, result);
    }
    @Test
    void testThatNegativeOneIsReturnedIfFirstNumberIsLessThanSecondNumber(){
        //Given that I have two numbers
        int firstNumber = 1;
        int secondNumber = 4;
        //if both numbers are compared
        int result = Comparator.compare(firstNumber, secondNumber);
        //Assert that 0 is returned if firstNumber is less than secondNumber
        assertEquals(-1, result);
    }

}