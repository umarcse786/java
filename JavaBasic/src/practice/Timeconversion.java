package practice;
import java.util.Scanner;

public class Timeconversion {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the time in seconds");
		int n=s.nextInt();
		int min=n/60;
		int hours=min/60;
		System.out.println(hours);
		System.out.println(min);
		min=min-hours*60;
		System.out.println(min);
		int sec=((hours*60)*60)+(min*60);
		sec=n-sec;
		System.out.println(sec);
		System.out.println(hours+" Hour "+min+" Minutes "+sec+" Seconds");
		

	}

}
