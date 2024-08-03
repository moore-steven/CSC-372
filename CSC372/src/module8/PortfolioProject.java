package module8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PortfolioProject {

	
	public static void main(String[] args) {
		
		// Create studentlist array list and input variables
		
		ArrayList<Student> studentlist = new ArrayList<> ();
		
		
		
		String nameIn = "";
		String addressIn = "";
		double gpaIn = 0;
		
		
		// loop that repeats until a zero value is entered for the student name.
		
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
			
			// validation of double for input before accepting
			
			while (!userIn.hasNextDouble()) {
				System.out.println("Invalid Number - Try Again");
				userIn.next();
			}
			gpaIn = userIn.nextDouble();	
			
			// adds new values to student list
			
			studentlist.add(new Student(nameIn, addressIn, gpaIn));
		}
		

		
		
		System.out.println();
		System.out.println("Student List Sorted by Name - ");
		System.out.println();
		
		// Call Selection Sort class sort method using Name Comparator and then prints final list
		
		SelectionSort.sort(studentlist, new NameComparator());
		
		for (int i=0; i < studentlist.size(); ++i) {
			System.out.println(studentlist.get(i).Export());
		}
		
		System.out.println();
		
		// Outputs final list to text file, try-catch used to intercept I/O errors
		
		 try {
		      FileWriter myWriter = new FileWriter("StudentList.txt");
		      for (int j=0; j < studentlist.size(); ++j) {
		    	  myWriter.write(studentlist.get(j).Export());
		    	  myWriter.write(System.lineSeparator());
		      }	      
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		

	}

}
