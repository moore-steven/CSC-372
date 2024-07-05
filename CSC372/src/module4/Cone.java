package module4;

// Creation of Cone class that extends abstract Shape class

public class Cone extends Shape {
	private double radius;
	private double height;

	// Constructor that accepts radius and height variables
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// Surface area method for this shape
	
	@Override
	double surface_area() {
		return Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
	}
	
	// Volume method for this shape
	
	@Override
	double volume() {
		return Math.PI*Math.pow(radius, 2)*(height/3);
	}
	
	// toString method to output calculated volume and surface area
	
	public String toString() {
		return "Cone Volume: " + volume() + " - Cone Surface Area: " + surface_area();
	}

}
