package module4;

public class Cylinder extends Shape {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	double surface_area() {
		return ((2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2)));
	}

	@Override
	double volume() {
		return Math.PI*Math.pow(radius, 2)*height;
	}
	
	public String toString() {
		return "Cylinder Volume: " + volume() + " - Cylinder Surface Area: " + surface_area();
	}

}
