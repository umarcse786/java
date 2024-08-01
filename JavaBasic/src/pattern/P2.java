package pattern;
import java.util.Scanner;


public class P2 {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2 obj=new P2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row length");
		obj.n=s.nextInt();
		
		for(int i=0;i<=obj.n;i++)
		{
			for(int j=obj.n-i;j>0;j--)
			{
				System.out.print(" "+j);
			}
			
			System.out.println();
		}
		
		
	}
	

}
