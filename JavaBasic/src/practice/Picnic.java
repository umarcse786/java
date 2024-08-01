package practice;

import java.util.Scanner;

public class Picnic {
	public static void main(String[] args) {
		placement_celebration d1=new placement_celebration();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the venue :");
		
		String venue=sc.nextLine();
		System.out.println("enter the reporting time :");
		
		int report=sc.nextInt();
		
		d1.venue=venue;	
		d1.report=report;
		
		d1.display1();
		d1.display2();

	}
	
}
	 class placement_celebration
	
	{
		 String venue;
		 int report;
		 void display1()
			{
//			 this.venue=venue;
			 System.out.println("the venue is at : "+venue);
			 System.out.println("the reporting time is : "+report);
			 
				
			}
			void display2()
			{
//				To print number of students,
//				friends of students and parents accompanying .
				int stu=50;
				int fri=20;
				int par=45;
				System.out.println("students are : "+stu +" frends are: "+fri + "parents are: "+ par+
						"total is : "+(stu+fri+par));
				
			}
		
	}

	


