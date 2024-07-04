package module4;

import java.util.ArrayList;

public class ShapeArray {


	public static void main(String[] args) {
		Sphere sphere1 = new Sphere(3.5);
		Cylinder cylinder1 = new Cylinder(3.5,10);
		Cone cone1 = new Cone(3.5,10);
		
		ArrayList<Shape> ShapeArray = new ArrayList<Shape>();
		
		ShapeArray.add(sphere1);
		ShapeArray.add(cylinder1);
		ShapeArray.add(cone1);
		
		for (Shape shape : ShapeArray) {
	         System.out.println(shape.toString());
	      }

	}

}
