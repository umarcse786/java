package practice;

public class triangle {

	public static void main(String[] args) {
		int s1=90;
		int s2=90;
		int s3=0;
		int sum=s1+s2+s3;
		if(sum!=180) {
			System.out.println("Triangle not possible");
		}
		else if(s1==90 || s2 ==90 ||s3== 90)
		{
			System.out.println("right angle triangle");
			
		}
		else if(s1>=140 || s2>=140 || s3>=140 )
		{
			System.out.println("obtuse angle triangle");
		}
		else
		{
			System.out.println("acute angle triangle");
			
		}
		
	}

}
