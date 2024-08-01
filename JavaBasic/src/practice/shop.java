package practice;
import java.util.Scanner;
public class shop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the selling price");
		double sp=s.nextDouble();
		System.out.println("Enter 'p' for profit/'L' for loss");
		char c=s.next().charAt(0);
		if(c=='p')
		{
			double cp=sp/(1+(20.0/100));
			System.out.println("the profit is "+cp);
		}
		else if(c=='L')
		{
			double cp=sp/(1-(20.0/100));
			System.out.println("the actual cost price is  "+cp+", the loss is "+(cp-sp));
		}
		
		// TODO Auto-generated method stub

	}

}
