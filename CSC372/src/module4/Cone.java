package module4;

public class Cone extends Shape {
	private double radius;
	private double height;

	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	double surface_area() {
		return Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
	}

	@Override
	double volume() {
		return Math.PI*Math.pow(radius, 2)*(height/3);
	}
	
	public String toString() {
		return "Cone Volume: " + volume() + " - Cone Surface Area: " + surface_area();
	}

}
