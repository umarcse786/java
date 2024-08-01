package basics;

public class twistedprimenumber {

	public static void main(String[] args) {
		int n;
		n=20;
		for(int i=10;i<n;i++)
		{
			int c=0,t=i;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0) {
					c++;
				}
			}
			if(c==0)
			{
				int rev=0,r,o=i;
				while(t!=0)
				{
					r=t%10;
					rev=rev*10+r;
					t=t/10;
				}
				if(rev!=o)
				{
					t=rev;
					
					c=0;
					for(int k=2;k<t/2;k++)
					{
						if(rev%k==0)
						{
							c++;
						}
						
					}
					if(c==0)
					{
						System.out.println(i);
					}
				}
				
			}
		}
	}

}
