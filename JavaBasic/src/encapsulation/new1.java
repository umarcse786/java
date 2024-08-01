package encapsulation;
class demo
{
	private int a;
	private String b;
	public void setAge(int age) {
        // Setter method for age
        this.a= age;
    }

    public int getAge() {
        // Getter method for age
        return a;
    }

    public void setName(String name) {
        // Setter method for name
        this.b = name;
    }

    public String getName() {
        // Getter method for name
        return b;
    }
}
public class new1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo obj=new demo();
		 obj.setAge(21);
	        obj.setName("Umar Farooq Khan");

	        // Using getter methods to retrieve values
	        int retrievedAge = obj.getAge();
	        String retrievedName = obj.getName();

	        System.out.println("Name: " + retrievedName + ", Age: " + retrievedAge);
	    }
	}