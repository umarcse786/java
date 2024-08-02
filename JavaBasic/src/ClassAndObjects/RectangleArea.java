package ClassAndObjects;

class rect{
	int length;
	int breadth;
	public void param(int l,int b)
	{
	length=l;
	breadth=b;
	
		System.out.println("Area is : "+length*breadth);
	
	}
}
public class RectangleArea {
	

	public static void main(String[] args) {
		
		rect r=new rect();
		rect r1=new rect();
		r.param(2,5);
		r1.param(6, 7);
		
	}

}
