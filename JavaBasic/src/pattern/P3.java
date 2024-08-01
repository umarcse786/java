package pattern;
import java.util.Scanner;

public class P3 {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		P3 obj=new P3();
		System.out.println("Enter the lengtrh of row");
		obj.n=s.nextInt();
		for(int i=0;i<obj.n;i++)
		{
			for(int j=1;j<=obj.n-i;j++)
			{
				System.out.print(" "+j);
				
			}
			System.out.println();
			
		}
		

	}

}
