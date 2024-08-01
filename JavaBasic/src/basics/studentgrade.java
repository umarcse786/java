package basics;

public class studentgrade {

	public static void main(String[] args) {
		int a=55;
		if(a>80 && a<=100)
		{
			System.out.println("grade A");
		}
		if(a>60 && a<=80)
		{
			System.out.println("grade B");
		}
		if(a>50 && a<=60)
		{
			System.out.println("grade C");
		}
		if( a<50)
		{
			System.out.println("FAIL");
		}
	}

}
