package practice;
import java.util.Scanner;

public class SwapWithout3rdvar {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter a value: ");
		int a =s.nextInt();
		System.out.println("enter b value: ");
		int b =s.nextInt();
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a value is : "+a+" b value is : "+b);
		
		
		

	}

}
