package module5;

import java.util.Scanner;

public class ProductRecursion {
	private static int[] input = new int[5];
	public ProductRecursion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers");
		
		for (int i=0; i < 5; i++) {
			System.out.println("Number " + (i + 1) + ": ");
			Scanner s = new Scanner(System.in);
			input[i] = s.nextInt();
		}
		
		System.out.println(input[1]);
	}

}
