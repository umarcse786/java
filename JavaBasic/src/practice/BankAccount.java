package practice;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in);
	
	
	long accNum;
	double bal=5000;
	public BankAccount(long accNum, double bal) {
		super();
		this.accNum = accNum;
		this.bal = bal;
	}
	 

	public void Deposit(double amt)
	{
		bal=amt+bal;
		System.out.println("the amount is deposited and current balence is :"+bal);
	}
	public void Withdrawl(double amt)
	{
		
		bal=bal-amt;
		System.out.println("successful transaction");
		System.out.println("current balence is :"+bal);
	}
	public void Balence()
	{
		
		System.out.println("your balence is : "+bal);
	}
	public void Transfer(double amt, BankAccount b)
	{
		this.bal-=amt;
		b.bal+=amt;
		System.out.println("amount is transferd to : "+b.accNum);
	}
	

}
