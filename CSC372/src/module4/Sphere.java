package module4;


public class Sphere extends Shape {
	
	private double radius;	

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	double surface_area() {
		return (4*Math.PI*Math.pow(radius, 2));
	}

	@Override	
	double volume() {
		return (4/3*Math.PI*Math.pow(radius, 3));
	}
	
	public String toString() {
		return "Sphere Volume: " + volume() + " - Sphere Surface Area: " + surface_area();
	}

}
