package Constructor;

class Demo1 {
	int id;
	String name;
	Demo1(int i,String n)
	{
		id=i;
		name=n;
		
		
	}
	Demo1(Demo1 d2)
	{
		id=d2.id;
		name =d2.name;
	}

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	void DispalyDetails()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 D1=new Demo1(11,"farooq");
		Demo1 d2=new Demo1(12,"umar");
		D1.DispalyDetails();
		d2.DispalyDetails();
		

	}

}
