package chapter4;

import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary");
        int binary = scanner.nextInt();
        int decimalPart = 0;
        int mul = 1;
        int decimal = 0;
        while (binary != 0){
            int mainPart = binary /10;
            decimalPart = binary % 10;
            decimal += decimalPart * mul;
            mul *= 2;
            binary = mainPart;
        }
        System.out.println(decimal);
    }
}
