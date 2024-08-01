
package practice;
import java.util.Scanner;

public class Amazon {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of hours worked
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Input: Total sales
        System.out.print("Enter the total sales (in Rs.): ");
        double totalSales = scanner.nextDouble();

        // Basic hourly wage
        double basicHourlyWage = 50.0;

        // Calculate commission based on total sales
        double commissionRate;
        if (totalSales >= 100 && totalSales < 1000) {
            commissionRate = 0.01;
        } else if (totalSales < 10000) {
            commissionRate = 0.02;
        } else if (totalSales < 25000) {
            commissionRate = 0.03;
        } else {
            commissionRate = 0.035;
        }

        // Calculate total earnings
        double commissionEarnings = totalSales * commissionRate;
        double totalEarnings = basicHourlyWage * hoursWorked + commissionEarnings;

        // Display the result
        System.out.println("Basic Hourly Wage: Rs. " + basicHourlyWage);
        System.out.println("Commission Earnings: Rs. " + commissionEarnings);
        System.out.println("Total Earnings: Rs. " + totalEarnings);

        scanner.close();
    }
}