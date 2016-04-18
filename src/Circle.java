
public class Circle extends Shape {
	private int radius;
	
	Circle(String aName) {
		super(aName);
		radius = 3;
		// TODO Auto-generated constructor stub
	}
	
	public float calculateArea(){
		float area;
		area = (float) (3.14*radius*radius);
		return area;
	}
}
