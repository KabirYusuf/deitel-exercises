package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int maxNum = num;
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter a number");
            num = scanner.nextInt();
            if (num > maxNum)maxNum = num;
        }
        System.out.printf("Largest Number is: %d", maxNum);
    }
}
