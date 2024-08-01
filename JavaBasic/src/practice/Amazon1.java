package practice;

public class Amazon1 {

	public static void main(String[] args) {
		int sales=800;
		double sal;
		int basesal=50;
		int hours=5;
		double salessal=0;
		if(sales>100&&sales<1000)
		{
			salessal=sales*0.01;
		}
		else if(sales>1000&&sales<10000)
		{
			salessal=sales*0.02;
		}
		else if(sales>100&&sales<1000)
		{
			salessal=sales*0.03;
		}
		else {
			System.out.println("invalid input");
		}
		sal=basesal*hours;
		System.out.println(sal);
		double totalsal=sal+salessal; 
		System.out.println("total salary is : "+totalsal);
		


		

	}

}
