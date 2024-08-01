package basics;

public class primenumber {

	public static void main(String[] args) {
		int n=11,c=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
	}

}
