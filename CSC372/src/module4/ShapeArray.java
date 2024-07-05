package module4;

import java.util.ArrayList;

public class ShapeArray {


	public static void main(String[] args) {
		
		// Create instances of each shape along with necessary variables
		
		Sphere sphere1 = new Sphere(3.5);
		Cylinder cylinder1 = new Cylinder(3.5,10);
		Cone cone1 = new Cone(3.5,10);
		
		// Create ArrayList to hold each instance
		
		ArrayList<Shape> ShapeArray = new ArrayList<Shape>();
		
		// Add each instance to array
		
		ShapeArray.add(sphere1);
		ShapeArray.add(cylinder1);
		ShapeArray.add(cone1);
		
		// Iterate through shape array calling on each toString method to generate output
		
		for (Shape shape : ShapeArray) {
	         System.out.println(shape.toString());
	      }

	}

}
