package module4;

// Creation of Sphere class that extends abstract Shape class

public class Sphere extends Shape {
	
	private double radius;	

	// Constructor that accepts radius variable
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	// Surface area method for this shape
	
	@Override
	double surface_area() {
		return (4*Math.PI*Math.pow(radius, 2));
	}

	// Volume method for this shape
	
	@Override	
	double volume() {
		return (4/3*Math.PI*Math.pow(radius, 3));
	}
	
	// toString method to output calculated volume and surface area
	
	public String toString() {
		return "Sphere Volume: " + volume() + " - Sphere Surface Area: " + surface_area();
	}

}
