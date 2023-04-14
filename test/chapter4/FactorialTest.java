package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void testThatFactorialOfANumberCanBeFound(){
        //Given that I have a number
        int number = 5;
        //if I find the factorial of the number
        int factorial = Factorial.findFactorial(number);
        //Assert that factorial = 120
        assertEquals(120, factorial);
    }
}