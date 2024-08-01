package pattern;

public class P6 {

	public static void main(String[] args) {
		int n=5,x,j=n;
		for(int i=1;i<=n;i++)
		{
			for( j=n,x=i;x!=0;j--,x--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}

	}

}
