package ClassAndObjects;

class rect{
	int length;
	int breadth;
	public void param(int l,int b)
	{
	length=l;
	breadth=b;
	
		System.out.println("Area is : "+length*breadth);
		param p=new param();
	}
}
public class RectangleArea {
	

	public static void main(String[] args) {
		
		rect r=new rect();
		r.param(2,5);
	}

}
