package chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of miles covered or any number less than 0 to terminate");
        int miles = scanner.nextInt();
        System.out.println("Enter number of gallons used or any number less than 0 to terminate");
        int gallons = scanner.nextInt();
        double totalMilesPerGallon = 0;
        while (miles >= 0 || gallons >= 0){
            if (miles >= 0 && gallons >=0){
                double milesPerGallon = calcMilesPerGallon(miles, gallons);
                System.out.printf("Miles per gallon Is : %f%n", milesPerGallon);
                totalMilesPerGallon += milesPerGallon;
                System.out.println("Enter the number of miles covered or any number less than 0 to terminate");
                miles = scanner.nextInt();
                System.out.println("Enter number of gallons used or any number less than 0 to terminate");
                gallons = scanner.nextInt();
            }
            else break;
        }
        System.out.printf("Total Miles per gallon Is : %f%n", totalMilesPerGallon);

    }

    public static double calcMilesPerGallon(int miles, int gallon) {
        return (double) miles/gallon;
    }
}
