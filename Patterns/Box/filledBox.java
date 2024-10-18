package Patterns.Box;

import java.util.Scanner;

public class filledBox {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the size of the box (n): ");
	     int n = sc.nextInt();

	     for (int i = 1; i <= n; i++) {  // Rows
	         for (int j = 1; j <= n; j++) {  // Columns
	             System.out.print("*");
	         }
	         System.out.println();  // Move to the next line
	     }
	 
	}

}
