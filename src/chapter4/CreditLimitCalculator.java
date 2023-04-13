package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter balance at beginning of the month");
        int balanceAtBegOfMonth = scanner.nextInt();
        System.out.println("Total of items charged by the customer this month");
        int totalOfChargedItems = scanner.nextInt();
        System.out.println("Total credit applied");
        int creditApplied = scanner.nextInt();
        System.out.println("Allowed credit limit");
        int allowedCreditLimit = scanner.nextInt();

        int newBalance = calculateNewBalance(balanceAtBegOfMonth,totalOfChargedItems,creditApplied);
        boolean isCreditLimitExceeded = isCreditLimitExceeded(newBalance, allowedCreditLimit);
        if (isCreditLimitExceeded)
            System.out.println("Credit limit exceeded");
    }

    public static int calculateNewBalance(
            int balanceAtBegOfMonth,
            int charges,
            int creditApplied) {
        return balanceAtBegOfMonth + charges - creditApplied;
    }

    public static boolean isCreditLimitExceeded(int newBalance, int allowedCreditLimit) {
        return newBalance > allowedCreditLimit;
    }
}
