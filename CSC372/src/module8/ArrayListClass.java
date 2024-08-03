package module8;

import java.util.ArrayList;

public class ArrayListClass {

	
	public static void main(String[] args) {
		
		// Create studentlist array list and fill with sample data.
		
		ArrayList<Student> studentlist = new ArrayList<> ();
		
		studentlist.add(new Student(1,"Bill","Water Street"));
		studentlist.add(new Student(2,"Penelope","Brink Street"));
		studentlist.add(new Student(3,"Sarah","Fall Drive"));
		studentlist.add(new Student(4,"Danny","Main Street"));
		studentlist.add(new Student(5,"Christy","5th Street"));
		studentlist.add(new Student(6,"Samuel","Wall Street"));
		studentlist.add(new Student(7,"John","Park Avenue"));
		studentlist.add(new Student(8,"Matt","Old 60 Lane"));
		studentlist.add(new Student(9,"Corey","Upalika Street"));
		studentlist.add(new Student(10,"Jaime","Pine Street"));
		
		
		// Print out Original Student List to compare to list after sort
		
		System.out.println("Original Student List - ");
		System.out.println();
		for (int i=0; i < studentlist.size(); ++i) {
			System.out.print(studentlist.get(i).rollno + " - ");
			System.out.print(studentlist.get(i).name);
			System.out.println(" - " + studentlist.get(i).address);
		}
		
		System.out.println();
		System.out.println("Sorted by Name - ");
		System.out.println();
		
		// Call Selection Sort class sort method using Name Comparator and then print list for comparison
		
		SelectionSort.sort(studentlist, new NameComparator());
		
		for (int i=0; i < studentlist.size(); ++i) {
			System.out.print(studentlist.get(i).rollno + " - ");
			System.out.print(studentlist.get(i).name);
			System.out.println(" - " + studentlist.get(i).address);
		}
		

		
		for (int i=0; i < studentlist.size(); ++i) {
			System.out.print(studentlist.get(i).rollno + " - ");
			System.out.print(studentlist.get(i).name);
			System.out.println(" - " + studentlist.get(i).address);
		}
		
		System.out.println();
		
		

	}

}
