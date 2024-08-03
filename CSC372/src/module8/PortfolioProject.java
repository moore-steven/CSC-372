package module8;

import java.util.ArrayList;
import java.util.Scanner;

public class PortfolioProject {

	
	public static void main(String[] args) {
		
		// Create studentlist array list and fill with sample data.
		
		ArrayList<Student> studentlist = new ArrayList<> ();
		
		
		
		String nameIn = "";
		String addressIn = "";
		double gpaIn = 0;
		
		
		while (!"0".equals(nameIn)) {
			Scanner userIn = new Scanner(System.in);
			System.out.println("Enter Name of new student (Enter 0 to exit): ");
			nameIn = userIn.nextLine();
			if ("0".equals(nameIn)) {
				break;
			}
			System.out.println("Enter address of new student: ");
			addressIn = userIn.nextLine();
			System.out.println("Enter GPA of new student: ");
			while (!userIn.hasNextDouble()) {
				System.out.println("Invalid Number - Try Again");
				userIn.next();
			}
			gpaIn = userIn.nextDouble();	
			studentlist.add(new Student(nameIn, addressIn, gpaIn));
		}
		

		
		
		System.out.println();
		System.out.println("Student List Sorted by Name - ");
		System.out.println();
		
		// Call Selection Sort class sort method using Name Comparator and then print list for comparison
		
		SelectionSort.sort(studentlist, new NameComparator());
		
		for (int i=0; i < studentlist.size(); ++i) {
			System.out.print(studentlist.get(i).name);
			System.out.println(" - " + studentlist.get(i).address);
			System.out.println(" - " + studentlist.get(i).GPA);
		}
		
		
		System.out.println();
		
		

	}

}
