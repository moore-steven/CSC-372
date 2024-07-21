package module6;

import java.util.ArrayList;

public class ArrayListClass {

	
	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<> ();
		
		studentlist.add(new Student(1,"Bill","Water Street"));
		
		System.out.println(studentlist.get(0).name);

	}

}
