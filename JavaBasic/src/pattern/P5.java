package pattern;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int sum = 1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(sum+" ");
				sum+=2;
			}
			System.out.println();
		}

	}

}
