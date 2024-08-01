package pattern;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}

}
