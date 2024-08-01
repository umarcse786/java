package practice;

import java.util.Scanner;


public class Banking {
	

	public static void main(String[] args) {
		BankAccount farooq=new BankAccount(12345,5000);
		BankAccount su=new BankAccount(12345,5000);
//		System.out.println("0.create a account");
		System.out.println("1.Deposit");
		System.out.println("2.withdrawl");
		System.out.println("3.Check Balence");
		System.out.println("4.tRansfer between accounts");
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Enter the transaction code :");
		n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter the amount: ");
			double amt=sc.nextInt();
			farooq.Deposit(amt);
			
		}
		if(n==2)
		{
			System.out.println("Enter the amount: ");
			double amt=sc.nextInt();
			farooq.Withdrawl(amt);
			
		}
		if(n==3)
		{
		
			
			farooq.Balence();
			
		}if(n==4)
		{
			System.out.println("Enter the amount: ");
			double amt=sc.nextInt();
			farooq.Transfer(500,su);
			
		}
		if(n==5) {
			System.exit(0);
		}

	}
	}

}
