package basics;
import java.util.Scanner;
public class PerfectNumber {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		PerfectNumber p1=new PerfectNumber();
		System.out.println("Enter the number");
		p1.n=sc.nextInt();
		int sum=0;
		for(int i=1;i<p1.n;i++)
		{
			if(p1.n%i==0)
			{
				sum=sum+i;
				
			}
		}
		if(sum == p1.n)
		{
			System.out.println("The given number is perfect number");
		}
		else
		{
			System.out.println("The given number is not a perfect number");
		}
		

	}

}
