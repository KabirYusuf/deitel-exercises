package chapter4;

import java.util.Scanner;

public class ReadingNumberUntilASpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        int value = scanner.nextInt();
        System.out.println("Enter number");
        int number = scanner.nextInt();

        while (number < value){
            System.out.println("Enter number");
            int num = scanner.nextInt();
            number += num;
        }


    }
}
