package pattern;
import java.util.Scanner;
public class P1 {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		P1 obj=new P1();
		System.out.println("Enter row length");
		obj.n=s.nextInt();
		for(int i=1;i<=obj.n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}

	}

}
