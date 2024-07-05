package module4;

//Creation of Cylinder class that extends abstract Shape class

public class Cylinder extends Shape {
	private double radius;
	private double height;

	// Constructor that accepts radius and height variables
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// Surface area method for this shape
	
	@Override
	double surface_area() {
		return ((2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2)));
	}

	// Volume method for this shape
	
	@Override
	double volume() {
		return Math.PI*Math.pow(radius, 2)*height;
	}
	
	// toString method to output calculated volume and surface area
	
	public String toString() {
		return "Cylinder Volume: " + volume() + " - Cylinder Surface Area: " + surface_area();
	}

}
