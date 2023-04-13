package chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter citizen name");
            String name = scanner.next();
            scanner.nextLine();
            System.out.println("Enter citizen earning");
            int earning = scanner.nextInt();
            double tax = calculateTax(earning);
            System.out.printf("%s earning is: %d%n%s tax is: %.2f%n", name, earning, name, tax);

        }
    }

    public static double calculateTax(int earning) {
        if (earning <= 30000) return 0.15 * earning;
        return 0.2 * earning;
    }
}
