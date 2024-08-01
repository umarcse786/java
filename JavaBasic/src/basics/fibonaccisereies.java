package basics;

public class fibonaccisereies {

	public static void main(String[] args) {
		int a=1,b=0,sum=0,n=0;
		while(n<=10) {
			sum=a+b;
			System.out.println(sum);
			
			a=b;
			b=sum;
			
			
			n++;
			
		
		}
		

	}

}
