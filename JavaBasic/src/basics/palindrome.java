package basics;
public class palindrome {

    public static void main(String[] args) {
        int a = 121;
        int temp = 0;
        int b;

        int r;
        b = a;
        while (a != 0) { // Use "while" instead of "for" for the loop
            r = a % 10;
            temp = temp * 10 + r;
            a = a / 10;
        }
        if (b == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
