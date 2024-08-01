package basics;
public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int originalNumber = n;
        int c = 0;
        int res = 0;

        // Calculate the number of digits in the original number
        while (n != 0) {
            c++;
            n = n / 10;
        }

        n = originalNumber; // Reset n to the original number
        while (n != 0) {
            int digit = n % 10;
            res += Math.pow(digit, c); // Add the digit raised to the power of c
            n = n / 10;
        }

        if (res == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
