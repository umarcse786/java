package basics;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        a = sc.nextInt();

        System.out.print("Enter the second value: ");
        b = sc.nextInt();

        // Calculate results
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        double division = (double) a / b; // Cast to double for floating-point result

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        sc.close();
    }
}
