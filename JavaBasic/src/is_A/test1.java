package is_A;
class Animal{
	void eat()
	{
		System.out.println("eating...");
	}
}
class dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class babyDog extends dog
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babyDog d=new babyDog();
		d.eat();
		d.bark();
		d.weep();



	}

}
