package practice;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		data p1=new data();
		System.out.println("enter your name");
		String name=sc.nextLine();
		p1.Setname(name);
		p1.pro();
		

	}

}
