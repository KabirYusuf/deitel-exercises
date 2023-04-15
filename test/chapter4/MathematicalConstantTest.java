package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalConstantTest {
    @Test
    void testThatMathematicalConstantCanBeGotten(){
        //Given that we have a number
        int number = 2;
        //If i find the mathematical constant
        double result = MathematicalConstant.findMathematicalConstant(number);
        //Assert that result = 2.5
        assertEquals(2.5, result);
    }
    @Test
    void testThatMathematicalConstantForExponential(){
        //Given that we have a number
        int number = 3;
        //If I find the mathematical constant of the exponential
        double result = MathematicalConstant.findMathematicalConstantForExponential(number);
        //Assert that result = 13.0
        assertEquals(13.0, result);
    }

}