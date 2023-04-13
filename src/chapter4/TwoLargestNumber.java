package chapter4;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();;
        int largestNumber = number;
        int secondLargestNumber = 0;

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter number");
            number = scanner.nextInt();

            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            }
            if (number < largestNumber && number > secondLargestNumber)secondLargestNumber = number;

        }
        System.out.println("Largest number is: " + largestNumber);
        System.out.println("Second largest number is: " + secondLargestNumber);
    }
}
