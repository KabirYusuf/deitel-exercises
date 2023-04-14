package chapter4;

import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary");
        int binaryValue = scanner.nextInt();
        int remainder = 0;
        int valueToMultiplyBinaryWith = 1;
        int decimalValue = 0;
        while (binaryValue != 0){
            int wholeNumber = binaryValue /10;
            remainder = binaryValue % 10;
            decimalValue += remainder * valueToMultiplyBinaryWith;
            valueToMultiplyBinaryWith *= 2;
            binaryValue = wholeNumber;
        }
        System.out.println(decimalValue);
    }
}
