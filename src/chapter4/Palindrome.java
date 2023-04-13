package chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int digit = scanner.nextInt();
        int originalDigit = digit;
        while ((digit / 10000) < 1 || (digit / 10000) > 9){
            System.out.println("enter a valid number");
            digit = scanner.nextInt();
        }
        int count = 1;
        int reverse = 0;
        int mul = 10000;
        while (count <= 5){
            int num = digit / 10;
            int extract = digit % 10;
            reverse += extract * mul;
            mul = mul / 10;
            digit = num;
            count ++;
        }
        if (reverse == originalDigit){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
