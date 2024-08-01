package pattern;
import java.util.Scanner;
public class P4 {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of row");
		P4 obj=new P4();
		obj.n=sc.nextInt();
		for(int i=0;i<=obj.n;i++)
		{
			for(int j=obj.n;j>i;j--)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		

	}

}
