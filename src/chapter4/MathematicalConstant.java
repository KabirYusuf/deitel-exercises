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
}
