
package practice;
import java.util.Scanner;

public class Questions {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the total number of questions: ");
		int n=s.nextInt();
		System.out.println("enter the percentage of marks: ");
		int p=s.nextInt();
		int marks=n*p/100;
		System.out.println("the correct questions are : "+marks);
		
		

	}

}
