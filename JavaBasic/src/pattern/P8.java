package pattern;

public class P8 {

	public static void main(String[] args) {
		int n=5,x=5;
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>x-i;j--)
			{
				System.out.print(" "+n);
			}
			System.out.println();
			n--;
		}

	}

}
