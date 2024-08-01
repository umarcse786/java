package basics;

public class Randomnumber {

	public static void main(String[] args) {
		int min=10;
		int max=20;
		double random;
		random= Math.random()*(max-min+1)+min;
		System.out.printf("%.0f",random);
		
		

	}

}
