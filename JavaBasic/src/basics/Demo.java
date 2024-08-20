package basics;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a;
			System.out.println("Enter a number");
			a=sc.nextInt();
			if(a%2==0)
			{
				System.out.println("The given number is even");
			}
			else
			{
				System.out.println("The given number is odd");
			}
		}
		
	}

}
