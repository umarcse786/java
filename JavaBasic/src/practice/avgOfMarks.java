package practice;
import java.util.Scanner;
public class avgOfMarks {
	//public class avarage {
	double a=90.5;
	double b=85.9;
	double c=72.3;
	double d=49.5;
	double e=54.6;
	double f=90.5;
	double g=75.1;
	double h=88.2;
	
		public  void display()
		{
			double avg=(a+b+c+d+e+f+g+h)/8;
			System.out.println("The aggregate of 8 semisters is : "+avg);
		
	}

	public static void main(String[] args) {
		avgOfMarks a =new avgOfMarks();		
		a.display();
		

	}

}
