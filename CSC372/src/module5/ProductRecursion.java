package module5;

import java.util.Scanner;

public class ProductRecursion { 
	
	// Creation of Integer array
	
	private static Integer[] input = new Integer[6];
	
	private static int ProductR(Integer [] array, int num) {
		if (array[num] == null) {
			return 1;
		}
			
		return (array[num] * ProductR(array, (num + 1)));
		
	}

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers");
		
		for (int i=0; i < 5; i++) {
			System.out.println("Number " + (i + 1) + ": ");
			Scanner s = new Scanner(System.in);
			input[i] = s.nextInt();
		}
		
		input[(input.length - 1)] = null;
		int num = 0;
		System.out.println("The Product of the numbers is: " + ProductR(input, num));
		
	}

		
	

}
