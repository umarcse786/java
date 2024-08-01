package practice;
import java.util.Scanner;


public class Basicpayofemployee {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the basic pay");
		int base=s.nextInt();
		int da=base+(base*30/100);
		int hra=base+(base*15/100);
		double pf= ((int)base+(base+12.5/100));
		int grosspay=base+da+hra;
		double Netpay=grosspay-pf;
		System.out.println("The gross pay is "+grosspay);
		System.out.println("the Net pay is : "+Netpay);
		
		

	}

}
