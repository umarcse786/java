package practice;
import java.util.Scanner;
public class avgOfMarks {
	//public class avarage {
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	int e=50;
	int f=60;
	int g=70;
	
		public  void display()
		{
			int avg=(a+b+c+d+e+f+g)/7;
			System.out.println("The aggregate of 8 semisters is : "+avg);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		avgOfMarks a =new avgOfMarks();		
		a.display();
		// TODO Auto-generated method stub

	}

}
