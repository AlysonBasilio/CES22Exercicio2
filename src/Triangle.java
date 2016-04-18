
public class Triangle extends Shape{
	private int base, heigh;
	
	Triangle(String aName) {
		super(aName);
		base = 3;
		heigh = 4;
		// TODO Auto-generated constructor stub
	}
	
	public float calculateArea(){
		int area;
		area = base*heigh/2;
		return area;
	}
	
}
