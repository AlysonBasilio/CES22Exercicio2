
public class Shape {
	private String name;
	
	Shape(String aName) {
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public float calculateArea(){
		return 0.0f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle("Circle c");
		Square s = new Square("Square s");
		Triangle t = new Triangle("Triangle t");
		Shape shapeArray[] = {c, s, t};
		for (int i=0; i<shapeArray.length; i++){
			System.out.println("The area of " + shapeArray[i].getName() + " is " + shapeArray[i].calculateArea() + " sq. cm.\n");
		}
	}

}
