package pattern;

public class D1 {

	public static void main(String[] args) {
		int sum=1;
	for(int i=1;i<=5;i++)
	{
		if(i%2!=0){
			for(int j=0;j<5;j++)
			{
				
				System.out.print(" "+sum);
				sum++;
			}
			
		}
		
		if(i%2==0) {
			sum=sum+5;
			
		
		for(int j=0;j<5;j++)
		{
			
			System.out.print(" "+sum);
			sum--;
		}
		}
	 
		
		
		System.out.println();
		
		
	}
		// TODO Auto-generated method stub
	}

}
