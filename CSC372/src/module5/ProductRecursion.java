package module5;

import java.util.Scanner;

public class ProductRecursion { 
	
	// Creation of Integer array
	
	private static Integer[] input = new Integer[6];
	
	// Create recursion method
	
	private static int ProductR(Integer [] array, int num) {
		
		// Returns value of 1 and ends recursion if the value of the array at num is null
		
		if (array[num] == null) {
			return 1;
		}
		
		// Returns the value of the array at num multiplied by the returned value from the recursion method using array and num + 1
		
		return (array[num] * ProductR(array, (num + 1)));
		
	}

	public static void main(String[] args) {
		
		// 
		System.out.println("Enter 5 numbers");
		
		// For loop to receive input values
		
		for (int i=0; i < 5; i++) {
			System.out.println("Number " + (i + 1) + ": ");
			Scanner s = new Scanner(System.in);
			input[i] = s.nextInt();
		}
		
		
		// adds null value to end of array
		
		input[(input.length - 1)] = null;
		
		// Initialize integer that indicates array location
		
		int num = 0;
		
		// Output and first call of recursion method
		
		System.out.println("The Product of the numbers is: " + ProductR(input, num));
		
	}

		
	

}
