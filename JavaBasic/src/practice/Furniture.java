package practice;

public class Furniture {
	private static Furniture studytable;
	String type;
	String material;
	String colour;
	
	public void showDetails()
	{
		System.out.println("type:" +type);
		System.out.println("material:" +material);
		System.out.println("colour:" +colour);
	}

	public static void main(String[] args) {
		Furniture.studytable=new Furniture();
		studytable.type="table";
		studytable.material="table";
		studytable.colour="table";
		

	}

}
