package chapter4;

public class MathematicalConstant {

    public static double findMathematicalConstant(int number) {
        double result = 1;
        int count = 1;
        double factorial = 1;
        while (count <= number){
            for (int i = count; i > 0 ; i--) {
                factorial *= i;
            }
            double oneDividedByFactorial = 1 / factorial;
            result += oneDividedByFactorial;
            count++;
            factorial = 1;
        }
        return result;
    }

    public static double findMathematicalConstantForExponential(int number) {
        int count = 1;
        double result = 1;
        int factorial = 1;
        while (count <= number){
            double exponential = number;
            for (int i = count; i > 0 ; i--) {
                exponential *= number ;
                factorial *= i;
            }
            exponential /= number;
            double exponentialDividedByFactorial = exponential / factorial;
            factorial = 1;
            result += exponentialDividedByFactorial;
            count ++;
        }
        return result;
    }
}
