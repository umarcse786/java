package practice;
import java.util.Scanner;


public class Palindrome {
	int  n;
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Palindrome p=new Palindrome();
		System.out.println("Enter a number");
		p.n= sc.nextInt();
	    prime p1 =new prime();
		p1.checkprime(p.n);

	}

}
class prime{
public  void  checkprime (int n)
{
	boolean isprime=true;
	int c=1;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			isprime=false;
		}
		
	}
	if(isprime)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("Not a prime");
	}
	
}
}