
public class Circle extends Shape {
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("area of circle = " + (Math.PI * radius * radius));
	}

}
