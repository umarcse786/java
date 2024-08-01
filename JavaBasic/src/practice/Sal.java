package practice;
import java.util.Scanner;

public class Sal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of days worked");
		int wdays=s.nextInt();
		System.out.println("enter the no of days adsent");
		
		int adays=s.nextInt();
		System.out.println("the total salery is :"+(wdays*350-(adays*30)));
		

	}

}
