package basics;

public class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		//Parameterised constructor
		super();
		System.out.println("Parametrized constructor intitalize the properties of person");
		this.age = age;
		this.name = name;
	}
	Person(Person p){
		//here the constructor chaining starts.
		this.age =p.getage();
		this.name=p.name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int ag)
	{
		age=ag;
	}
	public static void main(String[] args) {
		
		//System.out.println(new Privacy().age);
		Person p =new Person(23,"Raj");
		
		
		Person p1=new Person(p);
		p.setage(27);
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p.age);
		System.out.println(p.name);
		
	}
	public Person() {
		super();
		System.out.println("No argumaent Constructor");
	}
	

}
