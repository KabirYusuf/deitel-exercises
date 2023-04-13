package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int largest = number;
        for (int counter = 0; counter < 9; counter++) {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if (number > largest) largest = number;
        }
        System.out.printf("Largest Number is: %d", largest);
    }
}
