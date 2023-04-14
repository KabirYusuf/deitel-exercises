package chapter4;

public class Factorial {

    public static int findFactorial(int number) {
        int result = 1;
        for (int i = number; i >= 2 ; i--) {
            result *= i;
        }
        return result;
    }
}
