package practice;
import java.util.Scanner;


public class Shopoffer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of photos");
		int n=s.nextInt();
		int bill=n*50;
		bill=bill-(bill*10/100);
		int total=bill+(bill*6/100);
		System.out.println("the total cost of "+n+" photos is: "+total);
		
	}

}
