package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount for item sold or any number less than 1 to terminate");
        double amount = scanner.nextDouble();
        double totalValueOfItemSold = 0.0;
        final double PERCENTAGE = 0.09;
        while (amount >= 1){
            totalValueOfItemSold += amount;
            System.out.println("Enter the amount for item sold or any number less than 1 to terminate");
            amount = scanner.nextDouble();
        }
        double commission = calculateCommission(PERCENTAGE, totalValueOfItemSold);
        double totalEarning = commission + 200;
        System.out.printf("Total earning = %.2f", totalEarning);

    }

    public static double calculateCommission(double percentage, double totalValueOfItemSold) {
        return  totalValueOfItemSold * percentage;
    }
}
