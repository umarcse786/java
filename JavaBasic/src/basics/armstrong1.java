package basics;
import java.util.Scanner;
public class armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=n;
		int r=0;
		for(int i=1;i<=3;i++)
			
		{
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		
		
		
		if(sum==x)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}

}
