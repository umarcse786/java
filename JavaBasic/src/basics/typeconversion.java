package basics;

public class typeconversion {

	public static void main(String[] args) {
		int a=257;
		byte b=100;
//		here the type casting takes place where byte is going to do 
//		floor division with the int value it do the divion by 
//		Dividing int value with total range of the byte.
		b = (byte) a;
		System.out.println(b );
//		
////		
//		Integer number = Integer.valueOf('c');
//		System.out.println(number.getClass().getSimpleName()); // Prints "Integer"



	}

}
