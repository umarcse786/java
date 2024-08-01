
package practice;
import java.util.Scanner;
public class Biodata {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=s.nextLine();
		System.out.println("Enter your father name: ");
		String fathername=s.nextLine();
		System.out.println("Enter your date of birth: ");
		String dob=s.next();
		System.out.println("Enter your blood group: ");
		String bg=s.next();
		System.out.println("Enter your aadhar no: ");
		int ad=s.nextInt();
		System.out.println("Enter your State: ");
		String st=s.next();
		
		
		System.out.println("Enter your name: "+name);
		System.out.println("Enter your father name: "+fathername);
		System.out.println("Enter your date of birth: "+dob);
		System.out.println("Enter your blood group: "+bg);
		System.out.println("Enter your aadhar no: "+ad);
		System.out.println("Enter your State: "+st);

		// TODO Auto-generated method stub

	}

}
