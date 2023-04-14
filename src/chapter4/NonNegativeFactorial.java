package chapter4;

import java.util.Scanner;

public class NonNegativeFactorial {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0){
            int result = 1;
            for (int i = number; i >= 2 ; i--) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
